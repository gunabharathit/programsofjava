package com.test;

import java.util.Scanner;

public class Add {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of elements");
	int arraysize=scan.nextInt();
	int array[]=new int[arraysize];
	for(int t=0;t<arraysize;t++){
		array[t]=scan.nextInt();
	}
	System.out.println("enter the sum value to check");
	int sum=scan.nextInt();
	for(int i=0;i<array.length-1;i++){
		if(array[i]+array[i+1]==sum){
			System.out.println("the pairs with given sum 6 is: ("+array[i]+","+array[i+1]+")");
		}
	}

}
}
