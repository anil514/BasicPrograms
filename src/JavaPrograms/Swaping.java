package JavaPrograms;

public class Swaping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before Swaping");
		//Logic one
		//int t = a;
		//a=b;
		//b=t;
		//System.out.println("after swaping:"+a+","+b);
//		System.out.println("2nd logic");
//		a=a+b;  //10+20 =30
//		b=a-b;  //30-20=10
//		a=a-b;  //30-10 = 20
//		System.out.println("after swaping:"+a+","+b);
//		System.out.println("3rd logic");
//		a=a*b;  //10*20 =200
//		b=a/b;  //200/20=10
//		a=a/b;  //200/10 = 20
//		System.out.println("after swaping:"+a+","+b);
		b = a+b -(a=b);   //1st a=b, a = 20,     2nd a+b= 10+20=>30 , total= b = 30-20 =10
		System.out.println("after swaping:"+a+","+b);

	}

}
