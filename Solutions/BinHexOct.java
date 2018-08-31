package com.basic;

public class BinHexOct {
	public void decimalToBinary(int number) {
		System.out.println(Integer.toBinaryString(number));
		System.out.println(Integer.toHexString(number));
		System.out.println(Integer.reverse(number));
	}
	public static void main(String args[]) {
		BinHexOct b = new BinHexOct();
		b.decimalToBinary(151564);
	}
}
