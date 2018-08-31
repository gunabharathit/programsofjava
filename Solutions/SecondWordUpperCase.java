package com.basic;

public class SecondWordUpperCase {
	public String makeSecondWordUpper(String sent) {
		
		if(sent.indexOf(' ') == -1) {
			return "less";
		}
		int indexOfSecondWordStart  = sent.indexOf(' ')+1;
		System.out.println(indexOfSecondWordStart);
		int indexOfSecondWordEnd = sent
				.substring(indexOfSecondWordStart).indexOf(' ')
				+indexOfSecondWordStart;
		System.out.println(indexOfSecondWordEnd);
		String secondWord = sent.substring(indexOfSecondWordStart, indexOfSecondWordEnd);
		String secondWordUpper = secondWord.toUpperCase();
		System.out.println(secondWord);
		String finalWord = sent.substring(0, indexOfSecondWordStart) + secondWordUpper
								+ sent.substring(indexOfSecondWordEnd);
		
		return finalWord;
	}
	public static void main(String args[]) {
		SecondWordUpperCase s = new SecondWordUpperCase();
		String finalword = s.makeSecondWordUpper("hi hello how are you");
		System.out.println(finalword);
	}
}
