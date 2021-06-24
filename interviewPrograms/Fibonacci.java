/**
 *	we can print fibonacci searies using recursion and iteration.
 * 	fibbonaci searies is sum of previous two numbers fn = (fn-1) + (fn-2);
 *  10 => 1,1,2,3,5,8, 
 **/
import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
		System.out.println("Enter the number upto which you want to print fibonacci:");
		int number = new Scanner(System.in).nextInt();
		for(int i=1;i<=number;i++){
			System.out.print(fiboRec(i)+" ");
		}
	}

	/**
	 * Fibonacci Series using recursion function.
	 * */
	public static int fiboRec(int i){
		if(i == 1 || i == 2){ return 1; }
		return (fiboRec(i-1) + fiboRec(i-2));
	}
}