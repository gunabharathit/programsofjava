package com.basic;

public class FrequencyOfAlphabets {
	public void printFrequency(String sentence) {
		int length = sentence.length();
		String sentenceCopy = sentence.toUpperCase();
		int arr[] = new int[26];
		for(int i = 0; i<length; i++) {
			char c = sentenceCopy.charAt(i);
			if(Character.isAlphabetic(c)) {
				int index = (int)c - 65;
				arr[index] = arr[index] + 1;
			}
		}
		for(int i=0; i<26; i++) {
			System.out.println("The count of "+(char)(i+65)
					+" is "+arr[i]);
		}
	}
	public static void main(String args[]) {
		FrequencyOfAlphabets f = new FrequencyOfAlphabets();
		f.printFrequency("hey there!");
	}
}
