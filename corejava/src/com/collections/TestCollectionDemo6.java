package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo6 {

	public static void main(String[] args) {
		
//		Collection<String> fruits = new ArrayList<>();
//
//		fruits.add("Mango");
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Orange");
//		fruits.add("Grapes");
//		
//	
//		fruits.retainAll(vegetables);
//		
//		System.out.println(fruits);
		
Collection<String> appliedCandidates = new ArrayList<>();
		appliedCandidates.add("Mounika");
		appliedCandidates.add("Priya");
		appliedCandidates.add("Rahul");
		
Collection<String> shortlistedCandidates = new ArrayList<>();
		shortlistedCandidates.add("Mounika");
		shortlistedCandidates.add("Rahul");
		
Collection<String> technicalRoundPassed = new ArrayList<>();

	  technicalRoundPassed.add("Mounika");
	   technicalRoundPassed.add("Priya");
	   technicalRoundPassed.add("Rahul");
	    technicalRoundPassed.add("Kiran");
	    
	    Collection<String> codingRoundPassed = new ArrayList<>();
	    codingRoundPassed.add("Mounika");
	    codingRoundPassed.add("Priya");
    
	    Collection<String> hrRoundPassed = new ArrayList<>();
	    hrRoundPassed.add("Mounika");
	    hrRoundPassed.add("Rahul");
	    
	    Collection<String> selectedCandidates = new ArrayList<>();
	    selectedCandidates.add("Mounika");
	    selectedCandidates.add("Rahul");
	      
	    shortlistedCandidates.retainAll(technicalRoundPassed);
	    
	    System.out.println("final selected candidates:");
	    System.out.println(shortlistedCandidates);
	}

}
