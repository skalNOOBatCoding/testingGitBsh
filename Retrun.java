package com.loops;

public class Retrun {

	public static void main(String[] args) {
		Retrun r = new Retrun();
		int c = r.add();
		System.out.println("return:"+c);
	}
	public int add() {
		int a = 5;
		int b = 6;
		int c = a+b;
		//System.out.println(c);
		return c;
} 
}