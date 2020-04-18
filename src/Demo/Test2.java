package Demo;

public class Test2 extends Test1{
	protected static  void atest1() {
		int a = 10, b=40;
		int c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.atest1();

	}

}
