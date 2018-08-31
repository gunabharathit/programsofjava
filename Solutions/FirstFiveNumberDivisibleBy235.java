package com.basic;

public class FirstFiveNumberDivisibleBy235 {

	public void findPossibleNumbers() {
		int counter = 1;
		int i = 1;
		System.out.println("possible values:");
		while(counter <= 5) {
			if(i%2==0 && i%3==0 || i%5 == 0) {
				System.out.print(i+" ");
				counter++;
			}
			i++;
		}
	}
	public static void main(String args[]) {
		FirstFiveNumberDivisibleBy235 f = new FirstFiveNumberDivisibleBy235();
		f.findPossibleNumbers();
	}
}
