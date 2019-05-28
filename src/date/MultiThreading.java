package date;

/**
 * @author siva
 *
 */
public class MultiThreading implements Runnable{
	
	public static void main (String args[]){
		
		MultiThreading m1 = new MultiThreading();
		Thread t2 = new Thread(m1);
		t2.start();
		System.out.println(t2.getName());
		
	}

	@Override
	public void run() {
		
	}

}
