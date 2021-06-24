class WayToPrintArrayEl{
	public static void main(String args[]){
		int a[] = {10,30,20};
		int i = 0;
		while(i<a.length){
			System.out.println(a[i]+" ");
			i++;
		}

		System.out.println("\nForeach Loop:");
		for(int j : a){ //foreach
			System.out.println(j);
		}
	}
}