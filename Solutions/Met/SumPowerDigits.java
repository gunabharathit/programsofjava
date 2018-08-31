package com.test;

public class SumPowerDigits {
	public long sumOfPowerDigit(long number){
		String numInString = String.valueOf(number);
		long sum = 0;
		for(int i=0; i<numInString.length(); i++){
			double pow = 0.0;
			if(i!=numInString.length()-1){
			pow = Math.pow(Double.parseDouble(""+numInString.charAt(i))
					, Double.parseDouble(""+numInString.charAt(i+1)));
			} else {
				pow = 1L;
			}
			System.out.println(pow);
			sum+=pow;
		}
		return sum;
	}
	public static void main(String args[]){
		SumPowerDigits sd = new SumPowerDigits();
		System.out.println(sd.sumOfPowerDigit(582109));
	}
}
