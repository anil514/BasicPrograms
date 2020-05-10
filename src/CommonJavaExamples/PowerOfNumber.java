package CommonJavaExamples;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3^4 =>81   3*3*3*3 
		int base = 3;
		int exponent = 4;
		long result = 1;
		
		while(exponent != 0) {
			result *= base;   //result*base
			--exponent;
		}
		System.out.println(result);
		
		//or direct operation
		System.out.println(Math.pow(2, 4));

	}

}
