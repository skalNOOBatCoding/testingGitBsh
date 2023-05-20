package com.loops;

import java.util.Scanner;

public class ForScannerSwitch {
//Combining For Loop,Scanner and Switch Statements 
	
	public static void main (String [] args) {
		for (int i=1;i<=3;i++) {
			
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the Number: ");
		int day = input.nextInt();
		
	
		
	switch (day) {
	
	case 1:
		System.out.println("Monday"+'\n');
		break;
	case 2:
		System.out.println("Tuesday"+'\n');
		break;
	case 3:
		System.out.println("Wednesday"+'\n');
		break;
	case 4:
		System.out.println("Thursday"+'\n');
		break;
	default:
		System.out.println("Out Of Range"+'\n');
		break;
	}
		
		}
}
}