package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter frist string:");
	String s1=sc.nextLine();
	
	System.out.println("enter second string:");
	String s2=sc.nextLine();
	
	
	ArrayList<Character>List1=new ArrayList<>();
	ArrayList<Character>List2=new ArrayList<>();
	
	for(char ch:s1.toCharArray()) {
		List1.add(ch);
		
	}
	
	for(char ch:s2.toCharArray()) {
		List2.add(ch);
		
	}
	
	Collections.sort(List1);
	Collections.sort(List2);
	

	if(List1.equals(List2)) {
		System.out.println("anagrams");
		
	}else {
		System.out.println("not anagrams");
	}
	}

}
