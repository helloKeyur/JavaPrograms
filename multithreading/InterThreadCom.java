/**
*	Inter-Thread Communication is a mechanism in which a thread releases the lock and enter into paused state and another thread acquires the lock and continue to executed.
	It is implemented by wait(), notify(), notifyAll() methods.
*
*	1. wait() :- If any thread calls the wait() method, it causes the current thread to release the lock and wait until another thread invokes the notify() or notigyAll() method for this Object, or a specified amount of time has elapsed.
		Sysntax : public final void wait() throws InterruptedException (waits until object is notified)
				  public final void wait(long timeout) throws InterruptedException (waits for the specified amount of time)			  
*	
*	2. notify() :- This method is used to wake up a single thread and releases the object lock.
		Syntax :	public final void notify()
*	
*	3. notifyAll() :- This method is used to wake up all threads that are in waiting state.
		Syntax: public final void notifyAll()

*	NOTE : To call wait(), notify() or notifyAll() method on any object, thread should own the lock of that object i.e. the thread should be inside synchronized area.
**/
class TotalEarnings extends Thread{
	int total = 0;
	@Override
	public void run(){
		synchronized(this){
			for(int i=0; i<=10; i++){
				total += 100;
			}
			this.notify(); //notify when it's complete
		}
	}
}
class InterThreadCom{
	public static void main(String arg[]) throws InterruptedException{
		TotalEarnings te = new TotalEarnings();
		te.start();
		synchronized(te){ //it is neccessory
			te.wait(); // wait till the te thread is executing 
			System.out.println(te.total);
		}
	}
}