package com.exceptionhandling;

import java.util.Scanner;

public class UserAccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="mounika";
		try {
			System.out.println("enter user name:");
			String username=sc.nextLine();
			if(username.equals(s)) {
				throw new DuplicateUsernameException("user already exist");
				
			}else{
				System.out.println("account created successfully");
				
			}
		}catch(DuplicateUsernameException DE) {
		
        System.out.println(DE);
	}

   }
}
