package CommonJavaExamples;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitchCase {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter two numbers ");
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		System.out.println("Please enter Operator: (+, -, *, /)");
		char operator = reader.next().charAt(0);
		double result =0;
		switch(operator) {
		case '+' :
			result = first + second;
			break;
		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' :
			result = first / second;
			break;
		default:
			System.out.println("Please enter correct values");
			break;
		}
		System.out.println(result);

	}

}
