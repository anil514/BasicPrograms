package JavaPrograms;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// Ternary operator
		int a =50; 
		int b = 70;
		int c = 30;
		int lar1 = a>b?a:b;   //largest of a,b
		// a>b?a:b  -->if a>b true a is large otherwise b is large
		int lar2 = c>lar1?c:lar1;  
	    // int lar2 = c>(a>b?a:b)?c:(a>b?a:b);   --combined statement
		System.out.println(lar2);

	}

}
