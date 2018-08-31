package com.basic;

import java.util.Scanner;

public class Nonrepeated {
 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	   int number=sc.nextInt();
	   int count=0;
		int[] arr=new int[10];
		while(number!=0) {
			int r=number%10;
			arr[r]=arr[r]+1;
			number=number/10;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
		}
		System.out.println(count);
}
}
