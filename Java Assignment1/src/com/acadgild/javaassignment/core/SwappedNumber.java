package com.acadgild.javaassignment.core;

import java.util.Scanner;
public class SwappedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = scan.nextInt();
		System.out.println("Enter 2nd number");
		int b = scan.nextInt();
		
		  a = a + b; 
		  b = a - b; 
		  a = a - b; 
		System.out.println("Number 1= "+a);
		System.out.println("Number 2= "+b);
	}

}
