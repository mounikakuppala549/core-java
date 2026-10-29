package com.array;

public class TestArrDemo4 {


	//WAP to print total_marks of a Student+ avg marks of a Student 
	
		public static void main(String[] args) {
			System.out.println("main method started ");

			int[] marks = { 99, 98, 97, 96, 95, 94 };// 0 1 2 3 4 5
			System.out.println(marks);

			double total_marks = 0;// 99 +98 = 197+97= 294+96 = 390= 485 = 579
			double avg = 0;

			for (int i = 0; i < marks.length; i++) {
				total_marks += marks[i];
			}

//			for (int m : marks) {
//				total_marks = total_marks + m;
//			}

			avg = total_marks / marks.length;

			System.out.println("Total marks of the student : " + total_marks);
			System.out.println("Avg marks : " + avg);

			System.out.println("main method started ");
		}

	

	}


