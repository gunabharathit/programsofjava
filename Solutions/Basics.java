package com.basic;

import java.util.Arrays;

public class Basics {
	public int[] uniqueNumbersInArray(int num[], int length) {
		
		Arrays.sort(num);
		int prev = 0;
		int uniqueValues[] = new int[length];
		int j = 0;
		for(int i = 0; i < length; i++) {
			if(prev != num[i]) {
				uniqueValues[j] = num[i];
				prev = num[i];
				j++;
			}
		}
		return uniqueValues;
	}
	public static void main(String args[]) {
		Basics b = new Basics();
		int arr[] = {2,6,26,42,36,78,42,42};
		int bb[] = b.uniqueNumbersInArray(arr, arr.length);
		System.out.println(bb);
	}
}
