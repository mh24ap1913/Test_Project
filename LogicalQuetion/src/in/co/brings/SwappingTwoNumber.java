package in.co.brings;

import java.util.Scanner;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		int x,y,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two number");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping:-"+x+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping:-"+x+y);
	}
}
