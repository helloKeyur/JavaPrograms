class InoxCinema{
	static int availableSeats = 15;
	static synchronized void bookSeat(int seats){
		String name = Thread.currentThread().getName();
		if(availableSeats >= seats){
			System.out.println("\n"+seats+" seats Booked by "+name);
			availableSeats -= seats;
			System.out.println("\t -> Now "+availableSeats+" availale for booking.");
		}else{
			System.out.println("\nSorry "+name+" You can not book the seats.");
			System.out.println("\t"+seats + " seats not availale right now. there are only "+availableSeats+" seats available for booking.");
		}
	}
}