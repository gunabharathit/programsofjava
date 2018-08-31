package com.basic;

public class WeightOfString {
	public int calculateWeightOfString(String sentence, int input1) {
		String sentenceInUpper = sentence.toUpperCase();
		int length = sentence.length();
		int sum = 0;
		for (int i = 0; i < length; i++) {
			char letter = sentenceInUpper.charAt(i);
			if (Character.isAlphabetic(letter)) {
				if (input1 == 0 && isVowel(letter)) {
					sum = sum + 0;
				} else {
					sum = sum + (int) (letter - 64);
				}
			}
		}
		return sum;
	}

	public boolean isVowel(char ch) {
		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}

	public static void main(String args[]) {
		WeightOfString w = new WeightOfString();
		int weight = w.calculateWeightOfString("abc de1234 234",1);
		System.out.println(weight);
	}
}
