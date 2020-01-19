package in.co.brings;

import java.util.Scanner;

public class PlyareverseNum {
	public static void main(String[] args) {
		String num,arg="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		num=sc.next();
		
		int length=num.length();
		for(int i=length-1;i>=0;i--) {
			arg=arg+num.charAt(i);
		}
		System.out.println("Reverse Number:-"+arg);
		if(arg.equalsIgnoreCase(num)) {
			System.out.println("polindrome String");
		}else {
			System.out.println("Not Polindome String");
		}
	}

}
