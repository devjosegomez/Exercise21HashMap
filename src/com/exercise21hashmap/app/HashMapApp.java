package com.exercise21hashmap.app;
import java.util.HashMap;
import java.util.Map;
public class HashMapApp {

	public static void main(String[] args) {
		HashMap<Integer, String> myHash = new HashMap<Integer, String>();
		myHash.put(1, "Jose");
		myHash.put(2, "Angela");
		for(int i=0; i<myHash.size(); i++) {
			if(myHash.containsKey(i)) {
				System.out.println(myHash.get(i));
			}
		}
		
		for(Map.Entry<Integer,String> myMap : myHash.entrySet()) {
			System.out.println(myMap);
		}
	}

}
