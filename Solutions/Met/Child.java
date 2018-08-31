package com.test;

public class Child extends Parent {
	public Child(){
		super();
		System.out.println("Child with zero arguments");
	}
	public Child(int n){
		//super();
		this();
		System.out.println("Child with one arguments");
	}

}
