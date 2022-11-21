package com.CodingClub;

public class Demonstrate {
	
	static int a = 10;
	static int b;
	
	public static void Method(int c) {
		System.out.println(a);
		System.out.println(b);
		System.err.println(c);
	}
	
	static {
		System.out.println("Static Block");
		b = a + 10;
	}

	public static void main(String[] args) {
		
		Method(30);
	}

}
