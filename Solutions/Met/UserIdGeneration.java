package com.trainings;
import java.io.*;
import java.util.*;
public class ex1 {
	public String userIdGeneration(String input1, String input2, int input3, int input4) {
		String smaller_Name = "";
		String Longer_Name = "";
		int input1len = input1.length();
		int input2len = input2.length();
		if (input1len > input2len) {
			smaller_Name = input2;
			Longer_Name = input1;
		}

		if (input2len > input1len) {
			smaller_Name = input1;
			Longer_Name = input2;
		}

		if (input2len == input1len && (int) input1.charAt(0) > (int) input2.charAt(0)) {
			smaller_Name = input2;
			Longer_Name = input1;
		}
		if (input2len == input1len && (int) input2.charAt(0) > (int) input1.charAt(0)) {
			smaller_Name = input1;
			Longer_Name = input2;
		}

		String Stringinput3 = String.valueOf(input3);
		StringBuffer rev = new StringBuffer(Stringinput3);
		String Stringinput4 = rev.reverse().toString();
		
		int slen = smaller_Name.length();
		char result11 = smaller_Name.charAt(slen - 1);
		String result1 = String.valueOf(result11) + Longer_Name + Stringinput3.charAt(input4 - 1)
				+ Stringinput4.charAt(input4 - 1);
		
		String result2 = result1;
		System.out.println(result2);
		int resultlen = result2.length();
		String finalresult = "";
		char CurrentChar;
		for (int i = 0; i < resultlen; i++) {
			if (Character.isUpperCase(result2.charAt(i))) {
				CurrentChar=Character.toLowerCase(result2.charAt(i));
				finalresult = finalresult+CurrentChar;
			}
			else
			{
				CurrentChar=Character.toUpperCase(result2.charAt(i));
				finalresult = finalresult+CurrentChar ;
		    }
		}
		System.out.println(finalresult);
		return "";
	}
	public static void main(String[] args) {
		ex1  sample=new ex1();
		sample.userIdGeneration("Manoj", "Kumar", 561327, 2);
	}
	}


