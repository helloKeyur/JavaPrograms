class ThreeDimArray{
	public static void main(String args[]){
		int arr[][][] = {{{10,20,30},{40,50},{60,70,80,90}}};
		System.out.println(arr.length); //1
		System.out.println(arr[0].length); //3
		System.out.println(arr[0][0].length); //3
		System.out.println(arr[0][1].length); //2
		System.out.println(arr[0][2].length); //4

		System.out.println(arr[0][0][2]); //30
		System.out.println(arr[0][1][1]); //50
		System.out.println(arr[0][2][3]); //90

		System.out.println("\n==========================");

		for(int i=0; i < arr.length; i++){
			for(int j=0; j < arr[i].length; j++){
				for(int k=0; k < arr[i][j].length ; k++){
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}
}