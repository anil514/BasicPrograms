package JavaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		String str = sc.next();
		String org = str;
		String rev ="";
		int length = str.length();
		for(int i=length-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
	//	System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println("Palindrome value: "+rev);
		}else {
			System.out.println("not palindrome: "+rev);
		}
	}

}
