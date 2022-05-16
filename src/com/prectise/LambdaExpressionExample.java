package com.prectise;

interface myInterface {
	int sub(int a, int b);
}

public abstract class LambdaExpressionExample implements myInterface {

	public static void main(String[] args) {

		myInterface i = (a, b) -> {
			if (a < b) {
				throw new RuntimeException("hii");
			} else
				return a - b;
		};
		System.out.println(i.sub(2, 3));
	}
}
