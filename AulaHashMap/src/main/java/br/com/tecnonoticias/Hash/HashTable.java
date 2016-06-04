package br.com.tecnonoticias.Hash;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {

		String[] name = "saara".split("");

		Map<String, Integer> list = new Hashtable<String, Integer>();
		/*
		 * Hashtable não aceita valores null
		 */

		for (int i = 0; i < name.length; i++) {

			if (list.containsKey(name[i])) {

				list.put(name[i], list.get(name[i]) + 1);
			} else {
				list.put(name[i], 1);
			}
		}

//		for (Object string : list.values()) {
//			System.out.println(string);
//		}

		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		
		System.out.print("entrySet: " +numbers.entrySet());
		System.out.println();
		
		System.out.print("hashCode: " +numbers.hashCode());
		System.out.println();
		
		System.out.print("keys: " + numbers.keys());
		System.out.println();
		
		System.out.print("keySet: " +numbers.keySet());
		System.out.println();
		
		Integer n = numbers.get("two");
		
		if (n != null) {
			System.out.println("two = " + n);
		}

	}

}
