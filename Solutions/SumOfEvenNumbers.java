package com.basic;

public class SumOfEvenNumbers {
	public void findBinary(int number) {
		int numberCopy = number;
		int r = 0;
		int rev = 0;
		while(numberCopy!=0) {
			r = numberCopy % 8;
			rev = (r*10) + rev;
			numberCopy = numberCopy / 8;
		}
		System.out.println(rev);
	}
	public static void main(String args[]) {
		SumOfEvenNumbers s = new SumOfEvenNumbers();
		s.findBinary(15);
		//System.out.println(result);
	}
}
