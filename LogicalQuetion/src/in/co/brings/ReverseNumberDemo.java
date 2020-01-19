package in.co.brings;

import java.util.Scanner;

public class ReverseNumberDemo {
	public static void main(String[] args) {
		
		int num=0;
		int reversenum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		while(num!=0) {
			reversenum=reversenum*10;//45=45*10=450
			reversenum=reversenum+num%10;//450=450+45%10
			num=num/10;//
		}
		System.out.println(reversenum);
	}

}
