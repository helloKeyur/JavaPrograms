import java.util.*;
class ColSort{
	public static void main(String args[]){
		Integer[] a = {10,02,12,31,42,12,4};
		List<Integer> list = Arrays.asList(a);
		System.out.println(list);

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));


		Set<Object> setArr = new LinkedHashSet<>(Arrays.asList(50,20,40));
		setArr.add("hello");
		System.out.println(setArr);

		Map<Integer, String> user = new LinkedHashMap<>();
		user.put(1,"Keyur Vamja");
		user.put(2,"SHANTILAL SHAH ENG. COLLEGE, BHAVANAGAR.");

		for(Map.Entry obj : user.entrySet()){
			System.out.println(obj.getKey()+" - "+obj.getValue());
		}
	}
}