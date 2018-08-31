package com.basic;

public class MaximumValueInArray {
	public int maxValueInArr(int arr[]) {
		int length = arr.length;
		int max = arr[0];
		int secondMax = 0;
		int thirdMax = 0;
		for(int i = 1; i < length; i++) {
			if(max < arr[i]) {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];
			}
			System.out.println(max+" "+" "+secondMax+" "+thirdMax);
		}
		return thirdMax;
	}
	public static void main(String args[]) {
		MaximumValueInArray m = new MaximumValueInArray();
		int arr[] = {4,23,1,5,6,76,5};
		int thirdMax = m.maxValueInArr(arr);
		System.out.println(thirdMax);
	}
}
