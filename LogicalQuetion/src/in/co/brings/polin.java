package in.co.brings;

import java.util.Scanner;

public class polin {
	
	public static void main(String[] args) {
		String a,b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		a=sc.next();
		int n=a.length();
		for(int i=n-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("polindrone");
		}
		else {
			System.out.println("not polindrome");
		}
		
	}

}
