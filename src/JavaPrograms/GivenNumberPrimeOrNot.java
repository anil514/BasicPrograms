package JavaPrograms;

import java.util.Scanner;

public class GivenNumberPrimeOrNot {

	public static void main(String[] args) {
		
		//natural number>1
		//which has only 2 factres 1 and itself
		//19 => 1 and 19 =>Prime
		//28 => 1,2,4,7,14,28 =>not prime
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Number");
		//int num = sc.nextInt();
		int num =3;
		int count=0;
		if(num>1) {
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					count++;
				}
				if(count==2) {
					System.out.println("Prime Number");
				}else {
					System.out.println("not prime number");
				}
			}
		}else {
			System.out.println("not prime");
		}

	}

}
