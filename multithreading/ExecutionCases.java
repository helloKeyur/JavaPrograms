/**
* performing single task from single thread
* performing single task from multiple thread
* performing multiple task from single thread => we can not achieve this
* performing multiple task from multiple thread
**/
public class ExecutionCases{
	public static void main(String args[]){
		PlayAudio a = new PlayAudio();
		a.setName("AudioThread");
		a.start(); 
		// a.start(); if we execute the thread 2nd time it will give IllegalThreadStateException by main thread.
		// bcoz we can not call a thread which is alread in dead state.

		PlayAudio second_a = new PlayAudio();
		second_a.setName("AudioThread - second_a");
		second_a.start(); 

		PlayVideo v = new PlayVideo();
		Thread t = new Thread(v);
		t.setName("VideoThread");
		t.start();
	}
}

class PlayAudio extends Thread{
	@Override
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("audio playing..."+ i + Thread.currentThread().getName());
		}
	}
}

class PlayVideo implements Runnable{
	@Override
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("video playing..."+ i + Thread.currentThread().getName());
		}
	}
}