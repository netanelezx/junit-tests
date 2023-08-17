package org.example;

public class Calculator {
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int sub(int x, int y) {
		return x - y;
	}
	
	public static int mul(int x, int y) {
		return x * y;
	}
	
	public static int div(int x, int y) throws ArithmeticException {
		return x / y;
	}
}
