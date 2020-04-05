package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		//1st
//		int rev =0;
//		while(num!=0){
//			int rem = num%10;   //1234%10 ==>4      //123%10 ==>3     //12%10 ==>2     //1%10 ==>1
//			rev = rev*10+rem;   //0*10+4==>4        //4*10+3 ==>43    //43*10+2==>432  //432*10+2==>4321
//			num = num/10;       //1234/10===>123    //123/10 ==>12    //12/10==>1      //1/10 ==>0
//		}
	//	System.out.println(rev);
		
		//2nd
//		StringBuffer rev = new StringBuffer(String.valueOf(num));
		//int i=Integer.parseInt(s);  
//		rev.reverse();
		//System.out.println(rev);
		
		//3rd
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
	}

}
