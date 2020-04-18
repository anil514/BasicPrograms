package Demo;



public class TestJava {
	

	public static void main(String[] args) {
		int i = 10;
		short s = (short)i;
		System.out.println(s);
		String name ="Anil";
		String a = "1";
		String b = name+a;
		System.out.println(b);
		anil1();
		//TestDemo.demo();
		TestJava j = new TestJava();
		j.anil2();

	}
	
	public static void anil1() {
		System.out.println("static method");
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		System.out.println("length:"+arr.length);
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int a : arr) {
			System.out.println(a);
		}
		
		
	}
	
	public void anil2() {
		System.out.println("non-static method");
		int a = 10; 
		int b = 20;
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 System.out.println(a+ ","+b);
		 
		 int[][] aa = new int[2][3];
		 aa[0][0]=11;
		 aa[0][1]=22;
		 aa[0][2]=33;
		 aa[1][0]=44;
		 aa[1][1]=55;
		 aa[1][2]=66;
		 for(int i =0; i<aa.length; i++) {
			 for(int j = 0; j<aa[0].length; j++) {				
				 System.out.println(aa[i][j]);
			 }
			
		 }
		 
		
	}

}
