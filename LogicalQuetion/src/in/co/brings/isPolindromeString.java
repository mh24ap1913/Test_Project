package in.co.brings;

import java.util.Scanner;

public class isPolindromeString {

	public static void main(String[] args) {
		String org,dup="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		org=sc.next();
		int length=org.length();
		for(int i=length-1;i>=0;i--) {
			dup=dup+org.charAt(i);
		}
		System.out.println("Reverese String:-"+dup);
		if(org.equalsIgnoreCase(dup)) {
			System.out.println("String polindrome");
		}
		else {
			System.out.println("string not  polindrome");
		}
	}
}
