/**
 *  is number reverse is the same as input. then number is palindrome.
 * 	121 = 121
 * */
import java.util.Scanner;
class IsPalindrome{
	public static void main(String args[]){
		System.out.println("Enter the number to check is Palindrome or not: ");
		int num = new Scanner(System.in).nextInt();
		int reminder,sum=0,temp;
		
		temp = num;
		while(num > 0){
			reminder = num%10; //getting reminder
			num = num/10;
			sum = (sum*10)+reminder;
		}

		if(temp == sum){
			System.out.println("Number "+temp+" is Palindrome.");
		}else{
			System.out.println("Number "+temp+" is not Palindrome.");
		}
	}
}