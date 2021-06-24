/**
	Diffrence btw Sleep(), Yield(), Join()
	
	purpose
		sleep ->	if any thread does nott wait to perform any operation for perticlar time.
		yield ->	it stops the current executing thread & provide chance to other thread of same or higher priority to execte.
		join  -> 	if a thread wants to wait for another thread to complete its task.

	example
		sleep : time, ppt, blinking blubs
		yeild : shopping 
		join : licence

	how the thread invokes again?
		sleep - automatically after provide time period. OR if thread is interrupted.
		yield - automatically invoked by thread-schduler.
		Join  - automatically invoke after compliition of another thread task.
				- after completion of time period
				- if thread is interrupted.	 
**/
class DiffSleepYieldJoinEx{
	public static native void sleep(long millis) throws InterruptedException;
	public static void sleep(long millis, int nanoMilliSeconds) throws InterruptedException;

	public static native void yield();

	public final void join() throws InterruptedException;
	public final void join(long millis) throws InterruptedException;
	public final void join(long millis, int nanoMilliSeconds) throws InterruptedException;
}