package com.trainings;
import java.util.*;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int input1=scan.nextInt();
		int power=input1/10;
		int sum=0;
		while(input1>0 && power>0) {
			int a=input1%10;
			input1=input1/10;
			int b=power%10;
			power=power/10;
			sum=(int)Math.pow(b, a);		
		}
		System.out.println(sum+1);

	}

}
