/**
*	if a thread wants to wait for another thread to complete its task than we should use join() method.
*	
*	eg : licence queue-> medical, testDrive, Officer
*	
*	methods : 
			public final synchronized void join() throws InterruptedException;
			public final synchronized void join(long ms) throws InterruptedException;
			public final synchronized void join(long ms, int nenoSecond) throws InterruptedException;
**/
class JoinEx extends Thread{
	static Thread mainThread;

	@Override
	public void run(){
		try{
			mainThread.join(); // if we add this line here then currentThread (Thread-0) wait for otherThread (mainThread)
			for(int i=0; i<=5; i++){
				System.out.println(Thread.currentThread().getName() + " runs : "+ i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName()+" gives exception.");
		}
	}
	public static void main(String args[]){
		try{
			mainThread = Thread.currentThread();
			JoinEx t = new JoinEx();
			t.start();
			// t.join(); // if we add this line then currentThread (Main Thread) wait for OtherThread (Thread-0).
			for(int i=0; i<=5; i++){
				System.out.println(Thread.currentThread().getName() + " runs : "+ i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName()+" gives exception.");
		}
	}
}