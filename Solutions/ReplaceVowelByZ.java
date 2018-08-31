package com.basic;
import java.util.regex.*;
public class ReplaceVowelByZ {
//	public boolean matchPhoneNumber(String phone) {
//		Pattern p = Pattern.compile("(91|0)?[6-9][0-9]{9}");
//		Matcher m = p.matcher(phone);
//		boolean b = m.matches();
//		return b;
//	}
	
//	public boolean matchNumbersGreaterThan10InLength(String number) {
//		boolean b = Pattern.matches("[0-9]{10,}", number);
//		return b;
//	}
	public void replaceByZ(String input) {
		boolean isVowelPresent = Pattern.matches(".*[aeiou].*", input);
		System.out.println(isVowelPresent);
		if(!isVowelPresent) {
			System.out.println("vowel not present");
		} else {
			String output = input.replaceAll("[aeiou]", "z");
			System.out.println(output);
		}
	}
	public static void main(String args[]) {
		ReplaceVowelByZ rz = new ReplaceVowelByZ();
		//rz.replaceByZ("98487984 fawefwe");
		rz.replaceByZ("hzllz hzw zrz yzz");
		//System.out.println(b);
		//System.out.println(b);
	}
}
