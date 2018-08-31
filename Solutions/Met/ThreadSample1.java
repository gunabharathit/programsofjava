package com.test;

public class ThreadSample1 {
	public void display(){
		Thread t=Thread.currentThread();
		System.out.println(t);
	}
public static void main(String[] args) {
	ThreadSample1 ts1=new ThreadSample1();
	
	ts1.display();
}
}
