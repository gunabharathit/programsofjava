package com.test;

public class SumOfCyclicDigits {
	public long sumOfCyclicDigits(long number){
		String numInString = String.valueOf(number);
		long sum = 0;
		for(int i=0; i<numInString.length(); i++){
			for(int j=i; j<numInString.length(); j++){
				sum = sum+(numInString.charAt(j)-'0');
			}
		}
		return sum;
	}
	public static void main(String args[]){
		SumOfCyclicDigits scd = new SumOfCyclicDigits();
		System.out.println(scd.sumOfCyclicDigits(582109));
	}
}
