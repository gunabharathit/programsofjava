package com.basic;

public class IsPalindromePossible {
	
	public boolean canPalindromeBeMade(int number) {
		String numStr = String.valueOf(number);
		boolean isEven = false;
		int length = numStr.length();
		if(length % 2 == 0) {
			isEven = true;
		} else {
			isEven = false;
		}
		int arr[] = new int[10];
		int numCopy = number;
		int r=0;
		while(numCopy!=0) {
			r = numCopy % 10;
			arr[r] = arr[r]+1;
			numCopy = numCopy / 10;
		}
		int flag = 0;
		if(isEven) {
			for(int i = 0; i<10; i++) {
				if(arr[i] % 2 ==1) {
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				return false;
			}else {
				return true;
			}
		} else {
			int oddNumbersCount = 0;
			for(int i = 0; i<10; i++) {
				if(arr[i]%2==1) {
					oddNumbersCount++;
				}
			}
			if(oddNumbersCount == 1) {
				return true;
			} else {
				return false;
			}
		}
	}
	public static void main(String args[]) {
		IsPalindromePossible b = new IsPalindromePossible();
		boolean result = b.canPalindromeBeMade(5442135);
		System.out.println(result);
	}
}
