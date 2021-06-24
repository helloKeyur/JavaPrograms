/**
 * check the reverse string, we can check if reverse string as same as the input string the string is palindrome.
 * */
import java.util.Scanner;

class StrRev{
	public static void main(String arg[]){
		String reverse="";
		System.out.println("Enter the string to reverse.");
		String str = new Scanner(System.in).nextLine();
		int len = str.length();

		for(int i=(len-1); i >= 0; i--){
			reverse +=  str.charAt(i);
		}

		System.out.println("STR: "+str+" => "+reverse);
		if(reverse.equals(str)){
			System.out.println(str+" is Palindrome.");
		}else{
			System.out.println(str+" is not Palindrome.");
		}
	}
}