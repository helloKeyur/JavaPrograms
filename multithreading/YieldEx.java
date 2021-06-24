/**
* 1)	Yield():- which stopes the current executing thread & give a chance to other thread for execution
*	EX : BigBazar Billing Queue example
* 2)	working :- Java5 - internally it used sleep() method.
					java6 - Thread provides the hint to the thread-scheduler, then it depends on thread-scheduler to accept or ignor the hint.
* 3)	Method : public static native void yield();
* 4) 	Output may be diffrent every, bcoz windows doesnot support priority.
**/
class YieldEx extends Thread{
	@Override
	public void run(){
		// Thread.yield(); // if we define yield method here then thread-0 will stop and give priority to other for execution first.
		for(int i=0; i <=10; i++){
			System.out.println(Thread.currentThread().getName() + " - "+ i);
		}
	}

	public static void main(String args[]){
		YieldEx t = new YieldEx();
		t.start();

		// Thread.yield(); // if we define yield method here then main thread stop and give priority to other for executing.
		for(int i=0; i <= 10; i++){
			System.out.println(Thread.currentThread().getName() + " - "+ i);
		}
	}
}