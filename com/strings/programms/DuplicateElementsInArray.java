package com.strings.programms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {
	
	public static void main(String[] args) {
		
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Java"};
		
		// 1. Compare each element : O(n*n) : Time complexity : Worst approach
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is: "+names[i]);
				}
			}
		}
		
		// 2. Using HashSet  : It stores unique values : Time Complexity O(n) : Best Solution
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(!store.add(name)) {
				System.out.println("Duplicate element is: "+name);
			}
		}
		
		
		// 3. Using HashMap : Duplicates are allowed : Time Complexity O(2n)
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for(String name : names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}
		
		// get the values from hashMap object
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("Duplicate Element is: "+entry.getKey());
			}
		}
	}
}
