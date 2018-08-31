package com.test;

class EncodedResult {
	int output1;
	int output2;
	public EncodedResult(int out1, int out2){
		output1 = out1;
		output2 = out2;
	}
}
public class SimpleEncoded {
	public EncodedResult findOriginalFirstAndSum(int[] input1, int input2){
		int origArray[] = new int[input2]; 
		for(int i = input2 - 1; i >= 0; i--){
			if(i == input2-1){
				origArray[i] = input1[i];
			} else {
				origArray[i] = input1[i] - origArray[i+1];
			}
		}
		int sum = 0;
		for(int i=0; i<input2; i++){
			sum+=origArray[i];
		}
		EncodedResult eR = new EncodedResult(origArray[0], sum);
		return eR;
	}
	public static void main(String args[]){
		SimpleEncoded se = new SimpleEncoded();
		int input1[] = {7,6,8,16,12,3};
		EncodedResult er = se.findOriginalFirstAndSum(input1, 6);
		System.out.println(er.output1+" "+er.output2);
		
		int input2[] = {-2,-7,-12,-15};
		
		EncodedResult er2 = se.findOriginalFirstAndSum(input2, 4);
		System.out.println(er2.output1+" "+er2.output2);
	}
}
