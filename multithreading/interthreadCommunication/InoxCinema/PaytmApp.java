class PaytmApp extends Thread{
	InoxCinema theater;
	int seats;
	
	public PaytmApp(){}

	public PaytmApp(InoxCinema theater, int seats){
		this.theater = theater;
		this.seats = seats;
	}

	@Override
	public void run(){
		theater.bookSeat(seats);
	}
}