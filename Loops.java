package com.loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
			Loops i = new Loops();
			i.oddNumbers();
		
		
	}
		
		
		public void oddNumbers() {
		//Scanner odd = new Scanner(System.in);
			//System.out.print("Enter a Number: ");
			//int num = odd.nextInt();
			int number =1;
			int total = 0;
			while(number <=50) {
				total=total+number;
				System.out.println(number);
				number=number+2;
			}
			System.out.println(number);
		}
		
		
		
		
		
		
		
		
		
		
	}
