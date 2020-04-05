package JavaPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		int num =5;
		long fact =1;
//		for(int i =1; i<=num; i++) {
//			fact = fact*i;     //fact ==>1*2*3*4*5=>120
//		}
//		System.out.println(fact);
		for(int i =num; i>=1; i--) {
			fact = fact*i;     //5*4*3*2*1 ===>120
		}
		System.out.println(fact);

	}

}
