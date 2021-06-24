class BubbleSort{
	public static void main(String args[]){
		int[] arr = {90,21,18,19,87,24};
		int temp;
		for(int i=0; i < arr.length; i++){
			System.out.println("\nRound: "+ i);
			int status = 0;// not changed yet
			for(int j=0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j+1]){
					System.out.println("\t processing to changing : "+arr[j]+" "+arr[j+1]);
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					status = 1; // changed now
					System.out.println("\t Changed : "+arr[j]+" "+arr[j+1]+"\n\n");
				}else{
					System.out.println("\t Nothing to Change."+"\n");
				}
			}
			for(int k=0; k < arr.length; k++){
				System.out.print(arr[k]+" ");
			}
			if(status == 0){
				break;
			}
		}

		// for(int i=0; i < arr.length; i++){
		// 	System.out.println(arr[i]);
		// }
	}
}