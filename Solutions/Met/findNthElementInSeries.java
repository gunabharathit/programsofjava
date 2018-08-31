package com.test;

import java.util.ArrayList;

public class findNthElementInSeries {
	public int seriesN(int a, int b, int c, int N){
		ArrayList<Integer> arr = new ArrayList<>();
		
		int firstDiff = b-a;
		int secondDiff = c-b;
		int sum = c;
		for(int i = 0; i<N-3; i++){
			if(i%2==0){
					sum = sum+firstDiff;
			} else {
					sum = sum+secondDiff;			
			}
			arr.add(sum);
		}
	
		return arr.get(arr.size()-1);
	}
	public static void main(String args[]){
		findNthElementInSeries f = new findNthElementInSeries();
		System.out.println(f.seriesN(1, 3, 6, 17));
	}
}
