/**
*	What if we use run() insteadOf start()?
*		-> if we use direct run() then thread will not be created in our program and we can not use MultiThreading Concepts.
*
**/
class RunMethodInsteadOfStart extends Thread{
	@Override
	public void run(){
		try{
			for(int i=0; i <= 5; i++){
				System.out.println(i +" "+ Thread.currentThread().getName());
				Thread.sleep(1000); //sleep for 1s
			}
		}catch(InterruptedException e){
			System.out.println("Thread is Interrupted."+e);
		}
	}

	public static void main(String args[]){
		RunMethodInsteadOfStart t = new RunMethodInsteadOfStart();
		t.start(); // it will start thread-0
		
		RunMethodInsteadOfStart r = new RunMethodInsteadOfStart();
		r.run(); // it will start thread-1, it is created but not start

		RunMethodInsteadOfStart r2 = new RunMethodInsteadOfStart();
		r2.start(); // it will start thread-2
	}
}