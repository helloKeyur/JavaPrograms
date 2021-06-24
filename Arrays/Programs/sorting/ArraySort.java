class ArraySort{

	/*sort using bubble sort technique*/
	public static void sort(int[] arr){
		int temp = 0;
		for(int i = 0; i < (arr.length-1); i++){
			for(int j=0; j < (arr.length-i-1); j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void printArray(int[] arr){
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i]+", ");
		System.out.println();
	}

	public static void main(String args[]){
		int[] arr = {20,11,1022,23,54,32,321,642};

		System.out.println("Init arr: ");
		printArray(arr);

		sort(arr); // sort array

		System.out.println("\n\nSorted arr: ");
		printArray(arr);
	}
}