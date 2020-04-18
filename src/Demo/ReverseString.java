package Demo;

public class ReverseString {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Anil");
		System.out.println(a.reverse());
		
		int i = 1234, rev=0;
		while(i!=0) {
			int rem = i%10;
			rev = rev*10+rem;
			i = i/10;
		}
		System.out.println(rev);
		//---Rev String
		
		String s= "DOWN";
		String r="";
		for(int p=s.length()-1; p>=0; p--) {
			r=r+s.charAt(p);
		}
		System.out.println(r);

	}

}
