/**
*	JVM provide the priority to each thread & according to the priority JVM allocate the procesor.
*	Priority is int number, JVM spectify momory by priority.
*	Priority range is 1 to 10, 10 is higer & 1 is lower, priority 5 is default.
*	1 -	MIN_PRIORITY
*	5 - NORM_PRIORITY
*	10 - MAX_PRIORITY
*	
*	ByDefault main thread priority is 5.
*	
*	Below are not the priorites
*		0, <1, >10
*
*	methods
*	-> public final int getPriority();
*	-> public final void setPriority(int newPriorty);
*	
*	NOTE : WindowsOS does not support priority, priorities is depends on Plateform.
**/
class PriorityEx extends Thread{
	@Override
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println("Name is : "+t.getName());
		System.out.println("Priority is : "+t.getPriority());
	}

	public static void main(String args[]){
		System.out.println("Name is : "+Thread.currentThread().getName());
		System.out.println("Priority is : "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(4);
		System.out.println("Name is : "+Thread.currentThread().getName());
		System.out.println("Priority is : "+Thread.currentThread().getPriority());
		

		PriorityEx p = new PriorityEx();
		p.setPriority(MAX_PRIORITY); // if we set priority other than (1 to 10) it will give IllegalThreadStateException
		// p.setDaemon(true); if we set it as daemonThread it will nothing return. becuase it is nothing to do mainThread.
		p.start();
	}
}