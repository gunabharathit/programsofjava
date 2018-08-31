package com.basic;
import java.util.*;

public class EvenDigits {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
	 do {
	 while(input1!=0) {
		 int r = input1%10;
		 input1 = input1/10;
		 
		 if(r%2==0) {
			 sum=sum+r;
		 }
		 input1=sum;
	 }while(sum>=9) 
		 if(input1>0) {
			 System.out.println(sum);
		 }
	 
	}
 }
}