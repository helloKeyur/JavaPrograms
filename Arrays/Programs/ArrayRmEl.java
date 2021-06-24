import java.util.Arrays;
class ArrayRmEl{
	
	public static void main(String args[]){
		int[] arr = {10,28,57,9,4,58,86,78,99};
		int arr_len = arr.length;
		int[] temp = new int[arr_len-1];
		int rm_index = 2;

		for (int i=0,k=0; i<arr_len ;i++ ) {
			if(i != rm_index){
				temp[k] = arr[i];
				k++;
			}
		}
		System.out.println("Init Array: "+Arrays.toString(arr));
		System.out.println("Deleted Array: "+Arrays.toString(temp));
	}
}