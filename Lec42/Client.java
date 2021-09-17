package Lec42;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap<String, Integer> map = new MyHashMap<>();
		map.put("Ram", 20);
		map.put("Vishal", 15);
		map.put("Amit", 25);
		map.put("Shubham", 30);
//		map.put("Ra", 20);
//		map.put("Vshal", 15);
//		map.put("mit", 25);
//		map.put("ubham", 30);
//		map.put("m", 20);
//		map.put("ihal", 15);
//		map.put("mt", 25);
//		map.put("Subham", 30);
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.remove("ram"));
		System.out.println(map);

	}

}
