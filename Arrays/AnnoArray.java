class AnnoArray{
	public static void main(String args[]){
		System.out.println("Sum is : "+ arraySum(new int[]{10,2,30}));
	}

	public static int arraySum(int[] arr){
		int total = 0 ;
		for(int i : arr){
			total = total + i;
		}
		return total;
	}
}