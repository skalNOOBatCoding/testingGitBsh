package com.loops;
import java.util.Scanner;
public class SwitchWithForLoop {

	public static void main(String[] args) {
	
		for (int i =1;i<=3;i++)	{
			Scanner k = new Scanner(System.in);
			System.out.print("Enter the Number: ");
	
		int day = k.nextInt();
	
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
		break;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
