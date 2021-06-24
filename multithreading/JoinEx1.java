public class JoinEx1{
	public static void main(String arg[]) throws InterruptedException{
		Medical m = new Medical();
		m.start();
		m.join(); // main Thread wait till this task(Medical) complete.

		TestDrive td = new TestDrive();
		td.start();
		td.join(); // main Thread wait till this task(TestDrive) complete.
		
		OfficerSign os = new OfficerSign();
		os.start();
	}
}
class Medical extends Thread{
	@Override
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("Medical Start.");
			Thread.sleep(2000);
			System.out.println("Medical complete.");
		}catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName()+" gives exception.");
		}
	}	
}
class TestDrive extends Thread{
	@Override
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("TestDrive Start.");
			Thread.sleep(2000);
			System.out.println("TestDrive complete.");
		}catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName()+" gives exception.");
		}
	}	
}
class OfficerSign extends Thread{
	@Override
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("OfficerSign Start.");
			Thread.sleep(2000);
			System.out.println("OfficerSign complete.");
		}catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName()+" gives exception.");
		}
	}	
}