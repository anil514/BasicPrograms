package HackerRank;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(N%2 != 0){
            System.out.println("Weird");
        }else if(N%2 == 0 && N>2 && N<5){
            System.out.println("Not Weird1");
        }else if(N%2 ==0 && N>6 && N<=20){
            System.out.println("Weird2");
        }else if(N%2 ==0 && N>20){
            System.out.println("Not Weird2");
        }
    }

	

}
