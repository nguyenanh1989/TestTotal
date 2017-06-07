package com.exercise;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
	private final Map<String, Integer> map = new HashMap<String, Integer>();
	String stringNumber = "";

	public Exercise4() {
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		map.put("Six", 6);
		map.put("Seven", 7);
		map.put("eight", 8);
		map.put("Nine",9);
		map.put("Ten", 10);
		map.put("Eleven", 11);
		map.put("twelve", 12);
		map.put("thirteen", 13);
		map.put("fifteen", 15);
		map.put("twenty", 20);
		map.put("thirty", 30);
		map.put("fifty", 50);

	}

	public String getNumber(int big) {
		
		if (big  > 1000000000){
			for (Map.Entry<String,Integer> map1 : map.entrySet()){
				if(big/1000000000 == map1.getValue()){
					stringNumber += map1.getKey();
				}
			}
			big = big%1000000000;
			stringNumber = 
			getNumber(big);
		} if (){
			
		}
		
		return stringNumber;
	}

	

}
