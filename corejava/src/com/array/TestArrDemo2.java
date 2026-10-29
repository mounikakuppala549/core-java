package com.array;

public class TestArrDemo2 {

	

		//String[] 
		

			public static void main(String[] args) {
				System.out.println("main method started ");
				String[] names = new String[5];// 0 1 2 3 4

				names[0] = "Dhoni";
				names[1] = "Virat";
				names[2] = "Rohit";
				names[3] = "Rahul";
				names[4] = "Hardhik";
//				names[5] = "Srikanth";

//				 for loop --> index 
//				for (int i = 0; i < names.length; i++) {
//					System.out.println(names[i]);
//				}

				// for each loop --> element
				for (String name : names) {
					System.out.println(name);
				}

				System.out.println("main method ended ");

			}



	}


