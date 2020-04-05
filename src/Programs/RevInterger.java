package Programs;

public class RevInterger {

	public static void preMethod() {
		int i = 1908;
		StringBuffer sb = new StringBuffer(String.valueOf(i));
		sb.reverse();
		System.out.println("pre"+sb);
	}
	
	
	public static void main(String[] args) {
		preMethod();
		
		int i = 38745;
		int rev = 0;
		while(i>0) {
			int rem = i %10;   // 38745%10 = 5 || 3874%10 = 4 
			rev = rev*10+rem;   // 0 = 0*10+5 ==5  || 5 = 5*10+4 == 54
			i=i/10;             // 38745 = 38745/10 = 3874 || 3874 = 3874/10 = 387
		}
		System.out.println(rev);  // 5, 54

	}

}
