package com.basic;

import java.util.Scanner;

public class NumberEx {
	public static void main(String[] args) {
		int sum=0,sum1=0,count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int number=scan.nextInt();
			if(number<0) {
				number=Math.abs(number);
				 count=1;
						}
			
			while(number>0) {
				int r=number%10;
				sum=sum+r;
				number=number/10;
			
								}
			if(count==1) {
				int i=0;
				sum=i-sum;
			
			}
			System.out.println(sum);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
