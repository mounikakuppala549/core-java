package com.array;



//Whenever we want to represent row & columns then will choose 2D array.
public class TestArrDemo9 {

	public static void main(String[] args) {

		int[][] numbers = new int[3][4];// 0 1 2 ---> 0 1 2 3

		System.out.println(numbers.length);// 3
		System.out.println(numbers[0].length);// 4
		System.out.println(numbers[1].length);// 4
		System.out.println(numbers[2].length);// 4

		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 30;

		numbers[1][0] = 40;
		numbers[1][1] = 50;
		numbers[1][2] = 60;
		numbers[1][3] = 60;

//		10 20 30 30
//		40 50 60 60
//		0  0  0  0 
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] +" ");
			}
			System.out.println();
		}

//		for(int[] n1:numbers) {
//			for(int n:n1) {
//				System.out.print(n +" ");
//			}
//			System.out.println();
//		}

	}


	}


