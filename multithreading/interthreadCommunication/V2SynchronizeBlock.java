/*
*	Synchronized Block is same as Synchronized method. but synchronized block is use for make a perticular block as a synchronized.
	Synchronized Block has low scope. and Synchronized method has more scope.
**/
class V2SynchronizeBlock extends Thread{
	static BookMSeats booking;
	int seats; 
	public V2SynchronizeBlock(int seats){
		this.seats = seats;
	}

	@Override
	public void run(){
		booking.book(seats);
	}

	public static void main(String arg[]){
		booking = new BookMSeats();
		V2SynchronizeBlock parth = new V2SynchronizeBlock(7);// some time this (Thread-0) will work
		parth.setName("PARTH");
		parth.start();

		V2SynchronizeBlock mayur = new V2SynchronizeBlock(4); // some time this (Thread-1) will work
		mayur.setName("MAYUR");
		mayur.start();
	}
}

class BookMSeats{
	int avl_seats = 10;

	// here i use synchronized method
	public synchronized void book(int seats){ // by adding synchronized keyword we can acheive data inconsistancy
		String name = Thread.currentThread().getName();
		System.out.println("\n"+ name + " is going to book the seats.");
		// here we are using Synchronize block
		synchronized(this){ 
			if(avl_seats >= seats){
				System.out.println("\t -> "+seats+" seat booked by "+ name);
				avl_seats = avl_seats - seats;
				System.out.println("\t -> Only "+ avl_seats + " seats available right now for the booking.");
			}else{
				System.out.println("\t -> Sorry only "+ avl_seats + " available right now.");
			}
		}
	}
}