package com.test;

import java.util.ArrayList;
import java.util.Arrays;

class Result{
	int noOfSequence;
	int seqMaxLength;
	public Result(int nseq, int seqMax){
		noOfSequence = nseq;
		seqMaxLength = seqMax;
	}
}
public class DecreasingSequence {
	public Result decreasingSequence(ArrayList<Integer> sequence){
		int currLength = 0;
		int bestLength = 0;
		int len = sequence.size();
		int seqCount = 0;
		for(int i = 1; i < len; i++){
			if(sequence.get(i)<sequence.get(i-1)){
				currLength++;
			} else {
				if(currLength != 0){
					seqCount++;
				}
				currLength = 0;
			}
			if(bestLength < currLength){
				bestLength = currLength;
			}
		}
		if(currLength != 0){
			seqCount++;
		}
		if(bestLength != 0){
			bestLength++;
		}
		Result r = new Result(seqCount, bestLength);
		return r;
	}
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
		DecreasingSequence ds = new DecreasingSequence();
		Result r = ds.decreasingSequence(arr);
		System.out.println(r.noOfSequence + " " + r.seqMaxLength);
	}
}
