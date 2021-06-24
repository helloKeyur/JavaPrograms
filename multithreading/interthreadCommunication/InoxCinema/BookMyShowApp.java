class BookMyShowApp extends Thread{
	InoxCinema theater;
	int seats;
	
	public BookMyShowApp(){}

	public BookMyShowApp(InoxCinema theater, int seats){
		this.theater = theater;
		this.seats = seats;
	}

	@Override
	public void run(){
		theater.bookSeat(seats);
	}
}