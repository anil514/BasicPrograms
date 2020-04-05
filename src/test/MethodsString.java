package test;

public class MethodsString {

	public static void main(String[] args) {
		String s = "Anil A";
		int[] i = {1,2,3};
		System.out.println(s.isEmpty());
		System.out.println(s.length()); //method
		System.out.println(i.length);   //variable apply for arrays
		String a = "ANILA";
		System.out.println(a.replace('a', 'b'));
		System.out.println(a.substring(2));
		System.out.println(a.substring(2, 5));
		System.out.println(a.indexOf('I'));
		System.out.println(a.lastIndexOf('A'));
		String a1 = "  POtla  ";
		System.out.println(a1.trim());
		String a2 = "ANIL POTLA";
		System.out.println(a2.length());
		System.out.println(a2.trim().length());
		
		String s1 = new String("ABC"); 
		String s2 = s1.toLowerCase();
		String s3 = s1.toUpperCase();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		String t1 = "ABC";
		String t2 = t1.toLowerCase();
		String t3 = t1.toUpperCase();
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
		
		
		String r1 = "ANI10";
		String r2 = "ANI";
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
		
		String h1 = "10";
		int i1 = Integer.parseInt(h1);
		String h2 = "30";
		int i2 = Integer.parseInt(h2);
		int i3 = i1+i2;
		String h3 = String.valueOf(i3);
		System.out.println(h3);
	}

}
