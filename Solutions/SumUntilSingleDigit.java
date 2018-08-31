package com.basic;

public class SumUntilSingleDigit {
	public int findEvenSumAndSumUntilASingleDigit(int number) {
		int numberCopy = Math.abs(number);
		int sum = 0;
		int r = 0;
		while(numberCopy!=0) {
			r = numberCopy % 10;
			if(r % 2 == 0) {
				sum = sum + r;
			}
			numberCopy = numberCopy / 10;
		}
		int sumCopy = sum;
		while(sumCopy > 9) {
			sum = 0;
			while(sumCopy!=0) {
				r = sumCopy % 10;
				sum = sum + r;
				sumCopy = sumCopy / 10;
			}
			sumCopy = sum;
		}
		 if(number<0) {
			 return -sumCopy;
		 }else {
			 return sumCopy;
		 }
	}
	public static void main(String args[]) {
		SumUntilSingleDigit s = new SumUntilSingleDigit();
		int res = s.findEvenSumAndSumUntilASingleDigit(789654);
		System.out.println(res);
		
	}
}
