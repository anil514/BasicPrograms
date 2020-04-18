package Targets;

import java.util.Scanner;

public class IntPalindrome {
	public void check() {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int rev=0;
		int sum =i;
		while(i>0) {
			int rem = i%10;
			rev = rev*10+rem;
			i=i/10;			
		}
		if(sum==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}
	public void verify() {
		int i = 12215;
		int rev =0;
		int sum =i;
		while(i>0) {
			int rem = i%10;
			 rev = rev*10+rem;
			i = i/10;
		}
		if(rev==sum) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	

	public static void main(String[] args) {
		IntPalindrome a = new IntPalindrome();
		a.verify();
	}		

}
