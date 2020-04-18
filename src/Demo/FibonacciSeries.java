package Demo;

public class FibonacciSeries {

	public static void main(String[] args) {
	int a= 0, b=1, c, count=10;
	for(int i=0; i<count; i++) {
		c=a+b;
		System.out.println(""+c);
		a=b;
		b=c;
	}

	}

}
