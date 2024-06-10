package Threads;

public class MyThread implements Runnable {

	@Override
	public void run() {
		int iterations=5;
		try {
			for (int i=0; i<iterations; i++) {
				System.out.println("From secondry THREAD");
				Thread.sleep(1000);
				
			}
			
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted");
		
		}
		
	}
	


}
