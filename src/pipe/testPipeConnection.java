package pipe;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class testPipeConnection {
	
	public static void main(String[] args) throws InterruptedException
	{
		PipedOutputStream pos = new PipedOutputStream();
		
		PipedInputStream pis = new PipedInputStream();
		
		try {
			pos.connect(pis);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Producer p = new Producer(pos);
		
		Consumer c = new Consumer(pis);
		
		p.start();
		c.start();
		
		Thread.sleep(5000);
		
	}

}
