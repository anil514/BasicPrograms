package JavaPrograms;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num = 864865;
		int count =0;
		while(num>0) {
			num = num/10;
			count++;
			//num = num/10;
		}
		System.out.println("number of digits:" +count);

	}

}
