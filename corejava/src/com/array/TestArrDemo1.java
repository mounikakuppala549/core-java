package com.array;

class Student {

}


public class TestArrDemo1 {

	
	
		
		
			public static void main(String[] args) {
				System.out.println("main method started ");

				Student s1 = new Student();

				Object[] str = new String[5];

//				Step1 : Declaration 
				int[] ages;

//				Step2 : Creation 
//				Variable must provide either dimension expressions or an array initializer
//				ages = new int[];
				ages = new int[5];// 0 1 2 3 4

//				Step3 : Initialization 
				ages[0] = 21;
				ages[1] = 22;
				ages[2] = 17;
				ages[3] = 18;
				ages[4] = 22;

//				Step4 : Representation Based your requirements 
//				for (int i = 0; i < ages.length; i++) {
//					if (ages[i] > 18) {
//						System.out.println(ages[i]);
//					}
//				}

				for (int age : ages) {
					if (age > 18) {
						System.out.println(age);
					}
				}

			}
		
}
