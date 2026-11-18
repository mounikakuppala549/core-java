package com.stringhandling;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("main method started");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String:");
	    String str=sc.nextLine();
	    
	    String rev="";
	    
	    for(int i=str.length()-1;i>0;i--) {
	    	rev=rev+str.charAt(i);
	    }
	    
	    if(str.equals(rev)) {
	    	System.out.println(str+"is a palindrome");
	    }else {
	    	System.out.println(str + "is not palindrome");
	    }
	    
		System.out.println("main method ");

	}

}
