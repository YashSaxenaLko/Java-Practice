package com.codebind;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {

		//		set is basically an interface implementation of set we gonna learn tree set/ hash set
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(24);
		hashSet.add(2);			//properties : 1.Unordered Collection 2.Cannot Store Duplicate elements
		hashSet.add(2);			//It has more implementationsuch as HashSet, TreeHashSet and TreeSet
		hashSet.add(2);			//Output : 2/24/10
		hashSet.add(10);
		for(int element: hashSet)
		{
			System.out.println(element+ " ");
		}
		
//		hashSet.isEmpty();		//returns true, if set is Empty
//		hashSet.contains(10);   // returns true, if element is found
//		hashSet.remove(23);     //returns true, if element was deleted
//		hashSet.clear();		//Delete all element

		System.out.println("------------------");
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(24);
		treeSet.add(2);			//properties : 1. in order collection it will come by default ascending order
		treeSet.add(2);			//Output 2/10/24
		treeSet.add(2);
		treeSet.add(10);
		for(int element: treeSet)
		{
			System.out.println(element+ " ");
		}
	}

}
