package com.basic;

public class Histogram {
	public void printStudentCount(int marks[]) {
		int arr[] = new int[10];
		for(int i=0; i<marks.length;i++) {
			arr[(marks[i]-1)/10] = arr[(marks[i]-1)/10]+1;
		}
		for(int i=0; i<10; i++) {
			if(i==0) {
				System.out.println("no of scores between 0 and 10 is "+arr[i]);
			} else {
				System.out.println("no of scores between "+((i*10)+1)+" and "+(i+1)*10+" is "+arr[i]);
			}
		}
	}
	
	public static void main(String args[]) {
		int studentMarks[] = {100,99,80,50,40,30,20,10,0,30};
		Histogram h = new Histogram();
		h.printStudentCount(studentMarks);
	}
}
