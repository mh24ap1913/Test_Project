package in.co.brings;

import java.util.Scanner;

public class FaSeries {
	
	public static void main(String[] args) {
		int num,a=0,b=0,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(" "+a);
		}
	}

}
