class ArrayMerge{

	public static void sort(int[] arr){
		int temp = 0;
		for(int i = 0; i < arr.length; i++){
			for (int j=0; j < (arr.length - i -1); j++ ) {
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
		int a[] = {2,1,3};
		int b[] = {23,11,43,21,54};
		int a_len = a.length, b_len = b.length;
		int c[] = new int[a_len+b_len];

		/*
		for(int i=0; i < a_len; i++){
			c[i] = a[i];
		}

		for(int i=0; i < b_len; i++){
			c[a_len+i] = b[i]; 
		}
		*/

		System.arraycopy(a,0,c,0,a_len);
		System.arraycopy(b,0,c,a_len,b_len);

		sort(c);
		printArray(c);

	}
}