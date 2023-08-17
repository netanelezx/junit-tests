package org.example;

/**
 * Basic Calculator class used for testing with JUnit tests
 * @author tanif
 *
 */

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
