class UseOfThrowKeyword{
	static void dividByZero(){
		throw new ArithmeticException("Divid By Zero Exception Occure");
	} 
	public static void main(String args[]){
		dividByZero();
	}
}