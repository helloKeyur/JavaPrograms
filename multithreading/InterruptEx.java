/**
*	it is used to interrupt an executing thread.
*
*	interrupt() method will only work when the thread is in sleeping or waiting state (sleep() or wait())
*	
*	if a thread is not in sleeping or waiting state that calling an interrupt() method will perfom normal behavior.
*	
*	 we use a interrupt() method if throws exception InterruptedException	
*	
*	syntax : public void interrupt(){}
**/
class InterruptEx extends Thread{
	@Override
	public void run(){
		try{
			for(int i=0; i <=10; i++){
				System.out.println("Thread-0 Starting..."+ i);
				Thread.sleep(1000); // if we dont provide sleep() method than interrupt() will not work.
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static void main(String args[]){
		InterruptEx t = new InterruptEx();
		t.start();
		// t.interrupt(); //if we provide interrupt() here then thread is give InterruptedException
	}
}