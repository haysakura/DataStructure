package pipe;

import java.io.PipedInputStream;

public class Consumer extends Thread {

	private PipedInputStream pis;
	
	public Consumer(PipedInputStream pis)
	{
		this.pis = pis;
	}
	
	public void run()
	{
		try {
			while (true) {
				System.out.println("consumer1:" + pis.read());				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
