package CommonJavaExamples;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int num = 29;
		boolean flag = false;
		
		for(int i =2; i<=num/2; i++) {
			if(num % i ==0) {
			flag = true;
			break;
			}
		}
		if(!flag) {
			System.out.println(num +" Prime");
		}else {
			System.out.println(num + " Not Prime");
		}

	}

}
