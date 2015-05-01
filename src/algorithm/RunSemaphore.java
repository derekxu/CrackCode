package algorithm;
class ProcessA extends RunSemaphore implements Runnable{
	public void run(){
		while(true){
			try{
				sema1.waitForNotify();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.print("A");
			try{
				sema0.notifyToWait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class ProcessB extends RunSemaphore implements Runnable{
	public void run(){
		while(true){
			try{
				Thread.sleep(2000);
				sema0.waitForNotify();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.print("B");
			try{
				sema1.notifyToWait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class RunSemaphore {
	protected static final BinarySemaphore sema0 = new BinarySemaphore(0);
	protected static final BinarySemaphore sema1 = new BinarySemaphore(1);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new ProcessA()).start();
		new Thread(new ProcessB()).start();
	}

}
