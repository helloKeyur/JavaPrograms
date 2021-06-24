/**
*	Def : which run in the background of another thread.
*	use : it provides service to the thread.
*	Ex : Garbage Collector, spelling checker, finalizer, attach lister, signal dispatcher etc.
*	methods : public final boolean **isDaemon()**, public final void **setDaemon(boolean b)**
*	
*	case 1: we have to create daemon thread before starting the thread. if we create daemon thread after starting it, it will throw rut-time exception ie: IllegalThreadStateException.
*	case 2: we cannot create main thread as daemon thread.
*
*	life of daemon thread : it's life depends on another thread.
*	nature : it inherit the nature/properties from its parent thread.
*	JVM role : if main thread is in dead state then JVM make the daemon thread to dead state and after that JVM will shutdown.
*
*	Most of the times, daemon thread has Low priority , out we can change it's priority according to our need.
**/
class DaemonThreadEx extends Thread{
	@Override
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println(Thread.currentThread().getName()+" is Daemon Thread.");
		}else{
			System.out.println(Thread.currentThread().getName()+" is Child Thread.");
		}
	}

	public static void main(String args[]){
		DaemonThreadEx d = new DaemonThreadEx();
		d.setDaemon(true);
		d.start();
		// d.setDaemon(true); //if we declare setDaemon(true) after thread start it will give IllegalThreadStateException at runtime.
	}
}