// Thread class present in "java.lang" package

public class ThreadClassHeirarcy{
	public static Thread currentThread(); //return current thread instance
	public final String getName(); //return the name of thread
	public final String setName(String name); //can set the name of thread
	public void run(); // contain the task of thread
	public void start(); //start thread by allocating resource;
	public long getId(); // return the id of thread.
	public final int getPriority(); //return the priority of thread 1 to 10 default is 5
	public final void setPriority(int newPriority); // MIN_PRIORITY is 1, MAX_PRIORITY is 10
	public static void sleep(long millis) throws InterruptedException; // caused the curent thred to sleep for given milliseconds
	public final void join() throws InterruptedException; // wait for this thread to die
	public final void join(long millis) throws InterruptedException; // waits at most millis milliseconds for this thread to die
	public void interrupt(); //interrupts this thread
	public static boolean interrupted(); // if current thread is interrupted
	public boolean isInterrupted(); // tests whether this thread has been interrupted
	public final boolean isAlive(); // tests if this thread is live
	public static void yield(); // a hint to the scheduler that the current thread is willing to yield its current use of processor.
	public final void setDaemon(boolean on); // mark this thread as either a daemon thread or a user thread
	public final boolean isDaemon(); // tests if this thread is daemon thread

	//all about daemonThread
	Daemon thread in java is a service provider thread that provides service to the user thread.

	setDaemon(bool); 
	public Boolean isDaemon();

	Garbage Collector is best example of Daemon thread.
}


/**
* @resource from SmartProgramming Youtube Channel
* Heirarchi of Thead Class
*
*	Life Cycle of Thread => 5 stag =>New, Runable, Running, non Ranable, Dead
*
**/

// package java.lang.* thread class define in java.lang package

class ThreadClass implements Runnable{

	//Constructor
	public Thread(){}
	public Thread(Runnable target){} //noramal way this we use
	public Thread(String name){} // name of thread like main thread, or thread-0
	public Thread(Readable target, String name){}
	public Thread(ThreadGroup group, Runnable target){}
	public Thread(ThreadGroup group, String name){}
	public Thread(ThreadGroup group, Runnable target, String name){}
	public Thread(ThreadGroup group, Runnable target, String name, long stackSize){}

	// basic methods
	public void run(){}
	public synchronized void start(){}
	public static native Thread currentThread();
	public final native boolean isAlive();

	// Naming Methods
	public final String getName(){}
	public final synchronized void setName(String name){}

	// daemon Thread Methods
	public final boolean isDaemon(){}
	public final void setDaemon(boolean b){}

	// priority based methods
	public final int getPriority(){}
	public final void setPriority(){}

	// prevent thread execution methods
	public static native void sleep(long millis) throws InterruptedException;
	public static void sleep(long millis,int nanoMilliSecond) throws InterruptedException;
	public static native void yield();
	public final void join() throws InterruptedException;
	public final void join(long millis) throws InterruptedException;
	public final void join(long millis, int nanoMilliSecond) throws InterruptedException;
	/* Depricated Methods */
	public final void suspend(){}
	public final void resume(){}
	public final void stop(){}
	public void destroy(){}

	// interrupting a thread methods
	public void interrupt(){}
	public boolean isInterrupted(){}
	public static boolean interrupted(){}
}

public class Object{
	// inter thread communication methods
	public final void wait() throws InterruptedException{}
	public final native void notify(){}
	public final native void notifyAll(){}
}