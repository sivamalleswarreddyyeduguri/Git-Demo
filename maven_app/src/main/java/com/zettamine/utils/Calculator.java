package com.zettamine.utils;

public class Calculator {
		
	   public int add(int x, int y) {
		     return x+y;
	   }
	   public int sub(int x, int y) {
		   return x-y;
	   }



	public static void main(String[] args) {
		 
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(30, 20));

	}
}
