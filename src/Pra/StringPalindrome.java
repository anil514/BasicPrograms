package Pra;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		//Scanner read = new Scanner(System.in);
		//int a = read.nextInt();
		int a= 1211;
		int rev =0;
		int sum = a;
		while(a>0){
		int rem = a%10;
		rev= rev*10+rem;
		a = a/10;
		}
		if(rev==sum){
		System.out.println("P");
		}else{
		System.out.println("NP");
		}
}
}

