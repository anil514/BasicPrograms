package CommonJavaExamples;

import java.util.Scanner;

public class CheckWhetherNumberEvenOrOdd {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scr.nextInt();
		if(num % 2 == 0) {
			System.out.println(num +" even");
		}else {
			System.out.println(num +" Odd");
		}

	}

}
