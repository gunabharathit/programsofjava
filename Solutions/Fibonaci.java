package com.basic;
import java.util.*;

public class Fibonaci {
	public void findFibonacci(int num) {
		if(num<=0) {
			System.out.println("Invalid input");
		}
		else {
		int a = -1;
		int b = 1;
		int c = 0;
		for(int i=0;i<num;i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		Fibonaci obj=new Fibonaci();
		obj.findFibonacci(num);
		scan.close();
	}

}
