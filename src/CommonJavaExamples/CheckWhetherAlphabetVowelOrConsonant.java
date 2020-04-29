package CommonJavaExamples;

import java.util.Scanner;

public class CheckWhetherAlphabetVowelOrConsonant {

	public static void main(String[] args) {
		// a e i o u

		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter any charcter");
		char ch = scr.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
			System.out.println(ch + " is Vowel");
		}else {
			System.out.println(ch + " is Consonant");
		}

		switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is Vowel");
			break;
		default:
			System.out.println(ch + " is Consonant");
		}

	}

}
