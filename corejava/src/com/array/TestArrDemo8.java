package com.array;



import java.util.Scanner;

//WAP to check Whether the Given element is available or not in an array .? 

public class TestArrDemo8 {

	public static void main(String[] args) {

		int[] arr = { 18, 7, 45, 1, 10, 33, 9, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int search = sc.nextInt();// 77
		boolean status = false;

		for (int a : arr) {
			if (a == search) {
				System.out.println("The element is found : " + a);
				status = true;
				break;
			}
		}
		
		if(!status) {
			System.out.println("The element is not found !!"+ search);
		}

	}

}

