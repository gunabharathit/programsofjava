package com.test;

public class NambiarNumber {
	public int numbiarGenerate(String number){
		int i = 0;
		int currPass = 0;  //0 is even 1 is odd
		String output = "";
		if((number.charAt(0)-'0')%2==0){
			currPass = 0;
		} else {
			currPass = 1;
		}
		long passsum = number.charAt(0)-'0';
		for(i =1; i<number.length(); i++){
			long newsum = passsum + (number.charAt(i)-'0');
			if(newsum % 2 != currPass){
					currPass = (number.charAt(i+1)-'0') % 2;
					output = output + newsum;
					passsum = (number.charAt(i+1)-'0');
					i++;
			} else {
				passsum = newsum;
			}
		}
		if(i == number.length()){
			output = output + (number.charAt(i-1));
		}
		return Integer.parseInt(output);
	}
	public static void main(String args[]){
		NambiarNumber n = new NambiarNumber();
		n.numbiarGenerate("9880127431");
		System.out.println(n.numbiarGenerate("9880127431"));
		System.out.println(n.numbiarGenerate("9860857152"));
		System.out.println(n.numbiarGenerate("8123454210"));
		System.out.println(n.numbiarGenerate("9900114279"));
	}
}
