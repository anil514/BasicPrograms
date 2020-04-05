package Programs;

public class Palindrome {

	public static void main(String[] args) {
		int i = 121;
		int rev = 0;
		int d =i;
		while(i>0) {
			int rem = i%10;
			rev = rev*10+rem;
			i = i/10;
		}if(d==rev) {
			System.out.println(" Palindrome");
		}else {
			System.out.println(" not Palindrome");
		}
		

	}

}
