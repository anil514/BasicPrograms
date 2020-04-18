package Targets;

import java.util.Scanner;

public class StringPalindrome {
	public void check() {
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String rev ="";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}if(rev.equals(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}
	
	public void verfy() {
		String str = "ANNNNA";
		String rev ="";
		for(int i = str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}if(rev.equals(str)) {
		System.out.println(rev+" :Palindrome");
		}else {
			System.out.println(rev+" :not Palindrome");
		}
	}

	public static void main(String[] args) {
		StringPalindrome sp = new StringPalindrome();
		//sp.check();
		sp.verfy();
		
	}
}
