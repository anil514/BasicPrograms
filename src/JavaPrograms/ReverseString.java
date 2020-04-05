package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		//using + (String concation) opration
		//1st count the string
		//using for loop itrate lenth of string(expale 4times)
		//using charAt need to go each charcter and to 'rev'
		String str = "ABCD";
		String rev ="";
//		int length = str.length();
//		for(int i=length-1; i>=0; i--) {
//			rev = rev+str.charAt(i);
//		}
//		System.out.println(rev);
		
		//2nd using charcter array
//		char a[] = str.toCharArray();
//		int len = a.length;
//		for(int i=len-1; i>=0; i--) {
//			rev = rev+a[i];
//		}
//		System.out.println(rev);
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		//or
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1.reverse());
	}

}
