package new_first;

import java.util.Scanner;

public class Palindrome {
	
	public void palindromeInter() {
		Scanner scan = new Scanner(System.in);		
		int pal = scan.nextInt();
		//int pal = 345;
		int temp =pal;
		int rev =0;
		while(pal>0) {
			int rem = pal%10;
			rev=rev*10+rem;
			pal = pal/10;			
		}if(pal==temp) {
			System.out.println("palindram");
		}else {
			System.out.println("not palindrome");
		}
		System.out.println("reverse order:-> "+rev);
		
	}
	
	
	public void palindromeString() {
		Scanner scan = new Scanner(System.in);
		String st = scan.nextLine();
//		StringBuilder strOriginal = new StringBuilder(st);	  
//		  // reversing string
//		  StringBuilder strReverse = new StringBuilder(strOriginal).reverse();
		String rev="";
		for(int i=st.length()-1; i>=0; i--) {
			rev = rev+st.charAt(i);
		}
		if(rev.equals(st)) {
			System.out.println("palidrome");
		}else {
			System.out.println("not palindrome");
		}
		System.out.println("reverString--> "+rev);
		
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.palindromeString();
		
	}

}
