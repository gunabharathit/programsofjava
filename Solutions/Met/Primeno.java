package com.test;
import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner scan=new Scanner(System.in);
int number=scan.nextInt();
if(number<0)
	System.out.println("error");
int fact[]=new int[number];
int q=0;
for(int i=2;i<=number;i++){
	if(number%i==0){
		fact[q]=i;
		q++;
	}
}

	for(int m=0;m<fact.length;m++){
		int v=1,count=0;
		while(v<=fact[m]){
			if(fact[m]%v==0)
				count++;
			v++;
		}
		if(count==2)
			System.out.println(fact[m]);
	}


	}

}
