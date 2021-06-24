/**
*	1.	What is Synchronization?
		->	it is the process by which we control the accessability of multiple threads to a particular shared resource.

	2.	Problem which can occur without synchronization
		->	Data Inconsistancy
		->	Thread Interference

	3	Advantages of Synchronization
		->	No data inconsistancy problem
		->	No thread interface

	4.	Disadvantages of Synchronization
		->	increases the waiting time period of thread
		->	Create performance problems

	5	To overcome synchronization disadvantages, java provides one package i.e. "java.util.concurrent"
**/

class V1MovieApp extends Thread{
	static BookSeats booking;
	int seats; 
	public V1MovieApp(int seats){
		this.seats = seats;
	}

	@Override
	public void run(){
		booking.book(seats);
	}

	public static void main(String arg[]){
		booking = new BookSeats();
		V1MovieApp parth = new V1MovieApp(7);// some time this (Thread-0) will work
		parth.setName("PARTH");
		parth.start();

		V1MovieApp mayur = new V1MovieApp(4); // some time this (Thread-1) will work
		mayur.setName("MAYUR");
		mayur.start();
	}
}

class BookSeats{
	int avl_seats = 10;

	// here i use synchronized method
	public synchronized void book(int seats){ // by adding synchronized keyword we can acheive data inconsistancy
		String name = Thread.currentThread().getName();
		System.out.println("\n"+ name + " is going to book the seats.");
		if(avl_seats >= seats){
			System.out.println("\t -> "+seats+" seat booked by "+ name);
			avl_seats = avl_seats - seats;
			System.out.println("\t -> Only "+ avl_seats + " seats available right now for the booking.");
		}else{
			System.out.println("\t -> Sorry only "+ avl_seats + " available right now.");
		}
	}
}