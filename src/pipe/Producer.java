package pipe;

import java.io.PipedOutputStream;

public class Producer extends Thread {
	private PipedOutputStream pos;
	
	public Producer(PipedOutputStream pos)
	{
		this.pos = pos;
	}
	
	public void run()
	{
		int i = 0;
		try {
			while (true) {
				this.sleep(3000);
				pos.write(i);
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
