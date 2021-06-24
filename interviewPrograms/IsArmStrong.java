/**
 * 153
 * 1 (1*1*1) = 1
 * 5 (5*5*5) = 125
 * 3 (3*3*3) = 27
 * 
 * sum of this three is 153, num is ArmStrong
 * 
 * */
import java.util.Scanner;
class IsArmStrong{
	public static void main(String arg[]){
		System.out.println("Enter the number you want to check.");
		int num = new Scanner(System.in).nextInt();
		
		if(isArmStrong(num)){
			System.out.println(num+" is ArmStrong.");
		}else{
			System.out.println(num+" is not ArmStrong.");
		}
	}

	public static boolean isArmStrong(int num){
		int i, sum = 0;
		int temp = num;

		while(num > 0){
			i = num%10;
			num = num/10;
			sum = sum+(i*i*i);
		}

		if(temp == sum)
			return true;
		return false;
	}
}