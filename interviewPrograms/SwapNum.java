class SwapNum{
	public static void main(String arg[]){

		/*with three variable*/
		int a = 3, b = 4, temp;

		System.out.println("\nWITH THREE VARIABLE:");
		System.out.println("\nInit Number:");
		System.out.println("A: "+a+" B:"+b+"\n");

		temp = a;
		a = b;
		b = temp;

		System.out.println("Number is Swaped:");
		System.out.println("A: "+a+" B:"+b);

		/*with TWO variable*/
		int k = 6, l = 8;

		System.out.println("\nWITH TWO VARIABLE:");
		System.out.println("\nInit Number:");
		System.out.println("K: "+k+" L:"+l+"\n");

		k = k+l; // 14
		l = k-l; //6
		k = k-l; //8

		System.out.println("Number is Swaped:");
		System.out.println("K: "+k+" L:"+l);

		/*IN SINGLE LINE*/
		int m = 10, n = 12;

		System.out.println("\nIN SINGLE LINE:");
		System.out.println("\nInit Number:");
		System.out.println("M: "+m+" N:"+n+"\n");

		n = m + n - (m=n);

		System.out.println("Number is Swaped:");
		System.out.println("M: "+m+" N:"+n);
	}
}