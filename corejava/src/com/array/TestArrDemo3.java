package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrDemo3 {
//Read the size & elements from the Console using Scanner ?
	
public static void main(String[] args) {
				
	System.out.println("main method strated ");

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a Size : ");
				int size = sc.nextInt();

				int[] numbers = new int[size];// 100 --> 0 to 9
				System.out.println(numbers.getClass());

				System.out.println("Enter the elements ");
				for (int i = 0; i < size; i++) {
					numbers[i] = sc.nextInt();
				}

				for (int i = 0; i < size; i++) {
					if (numbers[i] % 2 == 0) {
						System.out.println(numbers[i]);
					}
				}

			}

		
}
