package codes;

import java.util.Arrays;

public class LargestPalin {
	public int Cal(int input1, int input2,int input3,int input4,int input5) {
	int array[]= {input1,input2,input3,input4,input5};
	boolean flag=false;
	int stable=0;
	int unstable=0;
	
	
	for(int i=0;i<5;i++) {
		int number=array[i];
		int numarray[]=new int[10];
		while(number>0) {
			int rem=number%10;
			number=number/10;
			numarray[rem]++;
			}
							
		
		Arrays.sort(numarray);
		int count=0;
		for(int j=0;j<10;j++) {
			if(numarray[j]!=0) count++;
		}
		
		System.out.println();
		
		int size=count;
	
		int sortarray[]=new int[size];
		int incre=0;
		
		for(int z=0;z<size;z++) {
			if(numarray[z]!=0) {
				System.out.println(numarray[z]);
				sortarray[incre]=numarray[z];
				incre++;
			}
		}
		for(int n:sortarray) {
			System.out.print(n);
						}
		
		int check=sortarray[size-1];
		for(int s=0;s<size;s++) {
			if(sortarray[s]==check) {
				 flag=true;
			}
			else 
			{
				 flag=false;
			}
		}
		
		if(flag==true)
			stable=stable+array[i];
		else
			unstable=unstable+array[i];
		
	}
	//System.out.println(stable);
	//System.out.println(unstable);
		
		return 0;
	}
public static void main(String[] args) {
	LargestPalin LP=new LargestPalin();
	int result=LP.Cal(123,22445,111,3322116,678);
}
}
