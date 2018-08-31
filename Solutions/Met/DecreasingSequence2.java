package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class DecreasingSequence2 {
	public void findSeq(int input[]) {
		int seqCount=0;
		int maxCount=0;
		int count=0;
		for(int i=0;i<input.length-1;i++) {
			if(input[i]>input[i+1]) {
				seqCount++;
				count=1;
				for(int j=i;j<input.length-1;j++) {
						if(input[j]>input[j+1]) {
						count++;
						if(count>maxCount) {
							maxCount=count;
						}
						i=j;
					}
					else {
						break;
					}
				}
			}
		}
		System.out.println("No. of Sequence="+seqCount);
		System.out.println("Maximum count="+maxCount);
	}
	public static void main(String[] args) {
		DecreasingSequence2 obj=new DecreasingSequence2();
		int array[]= {8,7,6,5,2,3,4,5,-1,-2,-3,-4,-5,-6,-7,-8,9,8,7,6};
		obj.findSeq(array);

	}

}

