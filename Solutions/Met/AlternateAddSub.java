package com.test;

public class AlternateAddSub {
	public int addSub(int input1, int opt){
		int N = input1;
		int i = 0;
		int sum = N;
		while((N-(i)) != 1){
			if(i%2 == 0){
				if(opt == 1){
					sum = sum - (N-(i+1)); 
				} else{
					sum = sum + (N-(i+1));
				}
			}
			else {
				if(opt == 1){
					sum = sum + (N-(i+1));
				} else {
					sum = sum - (N-(i+1));
				}
			}
			i++;
		}
		return sum;
	}
	public static void main(String args[]){
		AlternateAddSub aas = new AlternateAddSub();
		System.out.println(aas.addSub(6, 1));
	}
}
