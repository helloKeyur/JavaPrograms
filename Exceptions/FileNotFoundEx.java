import java.io.*;
class FileNotFoundEx{
	public static void main(String arg[]){
		try{
		FileReader f = new FileReader("text.txt");
		System.out.println("FileReader f  init;");
		}catch(FileNotFoundException e){ // here FileNotFoundException is checked exception so it need to give error at compile time. but here this code is compiled successfully. and give an exception at runtime of program.
			System.out.println(e.getMessage());
		}
	}
}

/**
*	Checked Exceptions -> checked at compile time
		->	IOException, SQLException, ClassNotFoundException
	
	Unchecked Exceptions -> checked at runtime 
		->	ArithmeticException, NullPointerException, NumberFormateException
		->	IndexOutOfBoundsException
			-	ArrayIndexOutOfBoundsException
			-	StringIndexOutOfBoundsException
	
	Error
		->	StackOverflowError
		->	VirtualMachineError
		->	OutOfMemoryError


	NOTE :
		->	In Java exceptions under Error and RuntimeException classes are unchecked exceptions
		->	everything else under throwable is checked
**/
