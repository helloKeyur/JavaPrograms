class MyTestMultiThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<=10; i++){
			System.out.println(i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	public static void main(String args[]){
		String tname = Thread.currentThread().getName();
		System.out.println("program start..."+tname);
		// for(int j=0;j<=10;j++){
		// 	System.out.println("Main thread : "+j);
		// }
		MyTestMultiThread obj = new MyTestMultiThread();
		obj.start();
		

	}
}