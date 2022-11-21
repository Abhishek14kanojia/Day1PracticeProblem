package com.CodingClub;

public class InvalidIntegers {

	public static void main(String[] args) {

		int N = 0;
		
		for(int i = 0; i < args.length; i++) {
			
			N = N + Integer.parseInt(args[i]);
			
		}
		System.out.println(N);
		
	}

}
