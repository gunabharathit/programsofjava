package com.test;

import java.util.Scanner;

public class ArrayArrangement {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the arraysize");
		int arraysize = scan.nextInt();
		int array[] = new int[arraysize];
		int arraysort[] = new int[arraysize];
		System.out.println("Enter the elements");
		int oddsize = 0;
		int evensize = 0;
		for (int i = 0; i <= arraysize - 1; i++) {
			array[i] = scan.nextInt();
			if (array[i] % 2 == 0)
				evensize++;
			else
				oddsize++;
		}
		System.out.println("oddsize" + oddsize);
		System.out.println("evensize" + evensize);
		int oddarray[] = new int[oddsize];
		int evenarray[] = new int[evensize];
		int j = 0, k = 0;
		for (int y = 0; y <= arraysize - 1; y++) {
			if (array[y] % 2 == 0) {
				evenarray[j] = array[y];
				// System.out.println(evenarray[j]);
				j++;
			} else {
				oddarray[k] = array[y];
				// System.out.println(oddarray[k]);
				k++;
			}

		}

		int r1 = 0, t2=0;
		
		 for(;t2<oddsize;t2++)
		 {
			 
			 arraysort[r1]=oddarray[t2]; 
			 r1=r1+2;
			 }
		 
		for (int q = 1, t1 = 0; t1 <= evensize - 1; q = q + 2, t1++) {
			arraysort[q] = evenarray[t1];
		}

		for (int ee : arraysort)

			System.out.println(ee);
	}
}
