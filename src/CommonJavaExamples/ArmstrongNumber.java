package CommonJavaExamples;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//153 ==  1*1*1 + 5*5*5 + 3*3*3 ==> 1 + 125 + 27 ==>153
		int num = 153;
		int actNum = num;
		double result =0;
		while(actNum != 0) {
			int rem = actNum % 10;
			result = result + Math.pow(rem, 3);
			actNum = actNum/10;
		}
		if(result == num) {
			System.out.println(num +" Armstrong number");
		}else {
			System.out.println(num +" Not Armstrong number");
			
		}

	}

}
