package tirgul01;

public class MainForTimer {

	public static void main(String[] args) {
		Timer t1=new Timer(10,00);
		for(int i=0;i<10;i++) {
			t1.tickDown();
		}
		System.out.println(t1);
	Timer t2=new Timer(2,0);
	Timer t3=t1.diff(t2);
	
	System.out.println(t2);
	System.out.println(t3);

	}
}
