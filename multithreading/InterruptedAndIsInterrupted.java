/**
*	interrupted() method is used to check wether a thread is interrupted or not.
*	isInterrupted() method is used to check wether a thread is interrupted or not.
*
*	interrupted() method clears the interrupted status from true to false if thread is interrupted.
*	isInterrupted() method does not clear the interrupted status.
*	
*	interrupted() method will change the result if called twice.
*	isInterrupted() method will produce same result. if called twice.
*	
*	public static boolean interrupted(){}
*	public boolean isInterrupted(){}
**/
class InterruptedAndIsInterrupted extends Thread{
	@Override
	public void run(){
		System.out.println(Thread.interrupted()); // true, but it will change the currentStatus to false.
		System.out.println(Thread.currentThread().isInterrupted()); // false bcoz above line.
		System.out.println(Thread.currentThread().isInterrupted()); // false, bcoz not change anything

		System.out.println(Thread.interrupted()); // false, it will not change the currentStatus (false to true) bcoz it's work only when thread isInterrupted -> true
		System.out.println(Thread.currentThread().isInterrupted()); // false, bcoz not change anything. above line will not execute and the status is same.
		try{	
			System.out.println("Thread-0 Startd...");
			Thread.sleep(1000);
			System.out.println("Thread-0 wakeup again...");
			System.out.println("Thread-0 complete...");
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	public static void main(String arg[]){
		InterruptedAndIsInterrupted t = new InterruptedAndIsInterrupted();
		t.start();
		t.interrupt(); // it will interrupt thread.
	}
}