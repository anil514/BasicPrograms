package CommonJavaExamples;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swap a value:" +a+ ", b value " +b);		
		a = a + b;   // a==>30
		b = a - b;   // b==>10
		a = a - b;   // a==>20
		System.out.println("After Swap a value:" +a+ ", b value " +b);
		
		//Other Proess
		int i = 55;
		int j = 33;
		System.out.println("Before Swap i value:" +i+ ", j value " +j);		
		int temp;
		temp = i;   //temp==>55
		i = j;      // i==> 33
		j = temp;   //j==> 55
		System.out.println("After Swap i value:" +i+ ", j value " +j);		
	}

}
