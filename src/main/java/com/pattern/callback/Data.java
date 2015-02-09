package com.pattern.callback;

public class Data {

	private int m;
	private int n;

	public Data(int m, int n) {
		this.m = m;
		this.n = n;
	}

	public String toString() {
		int r = 0;
		try {
			r = n / m;
		} catch (ArithmeticException e) {
		}
		return n + "/" + m + "=" + r;
	}

}
