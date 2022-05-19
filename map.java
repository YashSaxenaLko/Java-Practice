package com.codebind;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		
		
		//Map is an interface , there are 4 classes which implements map
		//HashMap / HashTable / TreeHashMap / LinkedHashMap
		Map<String , String> phonebook = new HashMap<>();
		phonebook.put("vaibhav", "987786756");
		phonebook.put("mani", "987784356");
		phonebook.put("prince", "982386756");
		phonebook.put("ayush", "637786756");
		phonebook.put("pawan", "786586756");
		System.out.println(phonebook.get("ayush"));
		
System.out.println("-----------------------------------------------------------------------");
		
		Set<String> keys = phonebook.keySet();
		for(String i : keys)
		{
			System.out.println(i +" "+phonebook.get(i));
		}
		
System.out.println("-----------------------------------------------------------------------");		
		
//		Map Entry : so entry is a interface in map(it is like nested interface) in map we have a method
//		called entry set which will give the set of entry
		Set<Map.Entry<String, String>> values = phonebook.entrySet();
		for(Map.Entry<String,String> e: values)
		{
			System.out.println(e.getKey() + ":" + e.getValue());
//			e.setValue("III");
		}
		
		
//		HashMap : 1) Introduced in 1.2 version 2) It is not thread safe and unsynchronized 3) it is fast
//		4) works with single thread  5)Allows one null key
		
//		Hash Table 1) There since java was introduced 2) It is thread safe and is synchronized 3) it is slow 
//		4) works with multiple threads 5) does not allow null key
	}

}
