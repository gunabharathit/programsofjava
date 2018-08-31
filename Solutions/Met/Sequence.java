package mettyl;
import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int arraysize=scan.nextInt();
		int array[]=new int[arraysize];
		int maxsequence[]=new int[arraysize];
		System.out.println("Enter the elements");
		for(int y=0;y<arraysize;y++) {
			 array[y]=scan.nextInt();
		}
		
		int sequence=0;
		int i=0;
		for(int m=1;m<arraysize;m++) {
			if(array[m]<array[m-1]) {
				sequence++;
			}
			else {
				maxsequence[i]=sequence;
				i++;
				sequence=0;
			}
			
					}
		for(int j:maxsequence)
			System.out.print(j);
		
	}

}
