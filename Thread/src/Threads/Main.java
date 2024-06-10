package Threads;

public class Main {

	public static void main(String[] args) {
		Thread thread= new Thread(new MyThread());
		thread.start();
		try {
			thread.sleep(3000);
			
		}
		catch(InterruptedException e){
			e.printStackTrace();
			
		}
		
		thread.interrupt();
		
		System.out.println("Called interrupt() function..");
		

	}

}
