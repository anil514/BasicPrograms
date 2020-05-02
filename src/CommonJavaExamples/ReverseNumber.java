package CommonJavaExamples;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;
		while(num != 0) {
			int rem = num %10;   //5     //4    //3
			rev = rev * 10 + rem;  //5   //54   //543
			num = num /10;       //1234   //123  //12
		}
		System.out.println(rev);
	}

}
