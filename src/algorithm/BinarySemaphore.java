package algorithm;

public class BinarySemaphore {
	private boolean locked=false;
	public BinarySemaphore(int init){
		locked = (init==0);
	}
	public synchronized void waitForNotify() throws InterruptedException{
		while(locked){
			wait();
		}
		locked=true;
	}
	public synchronized void notifyToWait() throws InterruptedException{
		if(locked){
			notify();
		}
		locked = false;
	}
}
