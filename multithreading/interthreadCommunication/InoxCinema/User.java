class User{
	public static void main(String args[]){
		/* Now using Paytm */
		InoxCinema theater1 = new InoxCinema();

		PaytmApp parth = new PaytmApp(theater1,5);
		parth.setName("PARTH Using PaytmApp");
		parth.start();

		PaytmApp raj = new PaytmApp(theater1, 6);
		raj.setName("RAJ Using PaytmApp");
		raj.start();

		PaytmApp pankaj = new PaytmApp(theater1, 5);
		pankaj.setName("PANKAJ Using PaytmApp");
		pankaj.start();

		/* Now using BookMyShow */
		InoxCinema theater2 = new InoxCinema();
		
		BookMyShowApp priya = new BookMyShowApp(theater2,2);
		priya.setName("PRIYA Using BookMyShowApp");
		priya.start();

		BookMyShowApp milan = new BookMyShowApp(theater2, 5);
		milan.setName("MILAN Using BookMyShowApp");
		milan.start();

		BookMyShowApp jigar = new BookMyShowApp(theater2, 3);
		jigar.setName("JIGAR Using BookMyShowApp");
		jigar.start();

	}
}