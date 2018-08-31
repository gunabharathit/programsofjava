package com.test;

public class SumString2 {
	public String sumTwoString(String one, String two){
		int minStrLength = 0;
		int maxStrLength = 0;
		String minStr = "";
		String maxStr = "";
		String sumStr = "";
		if(one.length() > two.length()){
			minStrLength = two.length();
			maxStrLength = one.length();
			minStr = two;
			maxStr = one;
		} else {
			minStrLength = one.length();
			maxStrLength = two.length();
			minStr = one;
			maxStr = two;
		}
		int k = maxStrLength - 1;
		int carry = 0;
		for(int i=minStrLength-1; i>=0; i--){
			int first = Integer.parseInt(""+minStr.charAt(i));
			int second = Integer.parseInt(""+maxStr.charAt(k));
			int sum = first + second + carry;
			if(sum > 9){
				carry = 1;
				sum = sum % 10;
			} else {
				carry = 0;
			}
			sumStr = sum + sumStr;
			k--;
		}
		int diff = maxStrLength - minStrLength;
		String subStr = maxStr.substring(0,diff);
		int frontSum = 0;
		if(!subStr.isEmpty()){
			frontSum = Integer.parseInt(subStr);
		}
		frontSum = frontSum + carry;
		if(frontSum > 0){
			sumStr = frontSum + sumStr;
		}
		return sumStr;
	}
	public static void main(String args[]){
		String s1 = "7654729850328997631007285998163550104";
        String s2 = "5980139243970186632651869926335829102";
        SumString2 s = new SumString2();
        String sum = s.sumTwoString(s1, s2);
        System.out.println(sum);
	}
}
