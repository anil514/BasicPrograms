package CommonJavaExamples;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		int x = 500;
		int y = 1500;
		int z = 300;
		if(x>y && x>z) {
			System.out.println(x+ " is large number");
		}else if(y>z){
			System.out.println(y+" is large number");
		}else {
			System.out.println(z+" is large number");
		}
		
		//Java ternary operator
		int lar1 = x>y?x:y;   //largest of x,y
		// a>b?a:b  -->if a>b true a is large otherwise b is large
		int lar2 = z>lar1?z:lar1;  
	    // int lar2 = c>(a>b?a:b)?c:(a>b?a:b);   --combined statement
		System.out.println(lar2);
		
		//combined statement
		int com = y>(x>y?x:y)?z:(x>y?x:y);
		System.out.println(com);
		
	}

}
