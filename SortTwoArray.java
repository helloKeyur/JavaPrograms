/**
Merge two sorted arrays
Given two sorted arrays, the task is to merge them in a sorted manner.

Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}

*/
class SortTwoArray{
	public static void main(String args[]){

		int arr1[] = { 1, 3, 4, 5};
		int arr2[] = { 2, 4, 6, 8};

		List<Integer> data = new LinkedList<>();

		List<Integer> arr1 = new LinkedList<>();
		arr1.add(1);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);

		List<Integer> arr2 = new LinkedList<>();
		arr2.add(2);
		arr2.add(4);
		arr2.add(6);
		arr2.add(8);

		data.add(arr1);
		data.add(arr2);

		System.out.println(data);
	}
}
