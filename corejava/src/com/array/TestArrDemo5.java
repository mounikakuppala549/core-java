package com.array;

public class TestArrDemo5 {

//WAP to find min & max number from a Given Array ..? 
public static void main(String[] args) {

	int[] numbers = { 4, 5, 6, 1 };

				int min = numbers[0];// 4 1
				int max = numbers[0];// 4

				for (int i = 0; i < numbers.length; i++) {

					if (numbers[i] < min) {
						min = numbers[i];
					} else if (numbers[i] > max) {
						max = numbers[i];
					}

				}

//				for (int n : numbers) {
//					if (n < min) {
//						min = n;
//					}
		//
//					if (n > max) {
//						max = n;
//					}
//				}

				System.out.println("minimum number is : " + min);
				System.out.println("Maximum number is : " + max);
			}

		

	}


