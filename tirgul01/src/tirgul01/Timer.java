package tirgul01;

public class Timer {
		int m,s;
		public Timer(int m,int s) {
			this.m=m;
			this.s=s;
		}
		public Timer(int s) {
			m= s/60;
			this.s=s - m*60;
		}
		public String toString() {
			if (s>=10) {
				return "{" + m + ":" + s + "}";
			}
			else {
				return "{" + m +":0" + s + "}";
			}
		}
		public int totalSeconds() {
			return m*60+ s;
			
		}
		public boolean tickDown() {
			if (s>0) {
				s--;
			}
			else if(m>0) {
				m-=1;
				s=59;
			}
			else {
				return false;
			}
			return true;
		}
		public Timer diff(Timer other) {
			int tot1=totalSeconds();
			int tot2=other.totalSeconds();
			if(tot2>tot1) {
				return null;
			}
			else {
				return new Timer (tot1-tot2);
			}
		}
		
}
	


