/**
*	public static native void sleep(long millis) throws InterruptedException;
*	public static void sleep(long millis,int nano) throws InterruptedException;
*
*	1. if the value of milliseconds is negative then "IllegalArgumentException" is thrown.
*	2. if the value of nanoseconds is not in the rang 0-999999 then "IllegalArgumentException" is thrown.
*	3. Whenever we want to use the sleep() method we also need to handle the "InterruptedException". if we will not handle it, the JVM will show a compilation error.
*	4. When any thread is sleeping and if any other thread interrupts it, then it throws "InterruptedException".
*	5. The sleep() method always pauses the current thread execution. when the JVM finds the sleep() method in code, it checks that which thread is running and pause the execution of thread.
*	6. When we use sleep() method to pause the execution of thread. the thread scheduler assigns the CPU to another thread if any thread exists. So, there is no guarantee that thte thread wakes up exactly after the time specified in sleep() method. it totally depends on the thread scheduler.
*	7. While the thread is sleeping, it doesn't lose any locks or monitors that it had acquired before sleeping.
**/
class SleepEx extends Thread{
	@Override
	public void run(){
		try{
			for(int i=0; i <= 10; i++){
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Thread interrupted.");
		}
	}

	public static void main(String args[]){
		SleepEx e = new SleepEx();
		e.start();
	}
}