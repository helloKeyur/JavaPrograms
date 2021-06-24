class ArithmeticEx{
	public static void main(String args[]){
		try{
			int divideByZero = 5/0; // in this line ArithmeticException will be occure bcoz we can not divide number by 0; this is RunTimeException means it is Unchecked Exception.
			System.out.println("Arithmetic Exception");
			// this is will display when we run program.
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		finally{
			System.out.println("Finally Block");
		}
	}
}