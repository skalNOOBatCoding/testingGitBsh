package com.loops;

import java.util.Scanner;

public class Condition_Statements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Marks: ");	
		
		int Grade = input.nextInt();
		
		if (Grade >= 90) {
			System.out.println("You Got A Grade");
		}
		else if (Grade >= 60) {
			System.out.println("You Got B Grade");
		}
		else {
			System.out.println("You Got C Grade");
		}
	}

}
