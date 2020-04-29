package CommonJavaExamples;

import java.util.Scanner;

public class PrintInteger_EnteredByUser {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = scn.nextInt();
		System.out.println("You enter Number here:" +num);

	}

}
