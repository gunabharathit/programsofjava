package com.basic;

public class MaxDigitInIntegers {
	int arr[] = new int[10];
	public void findFrequency(int num) {
		int numCopy = num;
		int r = 0;
		while(numCopy != 0) {
			r = numCopy % 10;
			arr[r] = arr[r] + 1;
			numCopy = numCopy / 10;
		}
		//printArray(arr);
	}
	public void maxValueInIntegers(int input1, int input2, int input3, int input4) {
		findFrequency(input1);
		findFrequency(input2);
		findFrequency(input3);
		findFrequency(input4);
		MaximumValueInArray m = new MaximumValueInArray();
		int maxNumbersCount = m.maxValueInArr(arr);
		int maxNumber = findMaximumNumber(maxNumbersCount);
		//printArray(arr);
		System.out.println(maxNumber);
	}
	public int findMaximumNumber(int maxCount) {
		for(int i = arr.length-1; i>=0; i--) {
			if(maxCount == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	public void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		MaxDigitInIntegers m = new MaxDigitInIntegers();
		m.maxValueInIntegers(1002, 2312, 5618, 9876);
	}
}
