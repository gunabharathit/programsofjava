package com.test;

public class Pin {
	public int calculatePin(String sentence){
		String words[] = sentence.split(" ");
		int sum = 0;
		for(String word : words){
			int length = word.length();
			sum = sum + length;
		}
		int oneSum = 0;
		while(sum!=0){
			int rem = sum % 10;
			oneSum = oneSum + rem;
			sum = sum / 10;
		}
		return oneSum;
	}
	public static void main(String args[]){
		Pin p = new Pin();
		int pin = p.calculatePin("Wipro Technologies");
		System.out.println(pin);
	}
}
