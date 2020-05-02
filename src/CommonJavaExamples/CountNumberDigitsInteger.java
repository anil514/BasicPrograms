package CommonJavaExamples;

public class CountNumberDigitsInteger {

	public static void main(String[] args) {
		// 1234 --4
		//123 ---3
		long num = 851996690;
		long count = 0;
		
		 while(num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count); 

	}

}
