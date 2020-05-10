package CommonJavaExamples;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int i = 1221;
		int rev = 0;
		int actNum = i;
		while(i >0) {
			int rem = i %10;
			rev = rev *10 +rem; 
			i = i/10;
		}
		System.out.println(rev);
		if(actNum == rev) {
			System.out.println( actNum +" ==> Palindrome");
		}else {
			System.out.println(actNum+ " ==> Not Palindrome");
		}

	}

}
