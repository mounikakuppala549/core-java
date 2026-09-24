package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineStudentPortal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       try {
    	   String name=null;
    	   System.out.println("Student name length:"+name.length());
    	   }catch(NullPointerException e) {
    		   System.out.println("null pointer exception");
    		   
    	   }try {
    		  System.out.println("enter a age:");
    		  int age=sc.nextInt();
    		  System.out.println("age is:"+age);
    	   }catch(InputMismatchException e) {
    		   System.out.println("inputmismatch:");
    		   sc.nextLine();
    		   
    	   }try {
    		   int totalmarks=450;
    		   int subjects=0;
    		   int average=totalmarks/subjects;
    		   System.out.println("average is:"+average);
    	   }catch(ArithmeticException e) {
    		   System.out.println("arithmetic exception:");
    		   
    	   }try {
    		   int[]marks= {80,90,85,95};
    		   System.out.println("enter array index:");
    		   int index=sc.nextInt();
    		   System.out.println("marks:"+marks[index]);
    	   }catch(ArrayIndexOutOfBoundsException e) {
    		   System.out.println("arrayindexoutofboundsexception:invalid index");
    		   
    	   }finally {
    		   System.out.println("finally blocked excuted");
    		   System.out.println("online student portal completed");
    	   }sc.close();
	}

}
