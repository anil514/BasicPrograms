package test;

public class test {

	public static void main(String[] args) {
		
		
		String s = new String("Anil");
		String s1 = new String("Anil");
		String a1= "ANi";
		a1.concat("gg");
		//System.out.println(a1);
		 s.concat("Test");
		//System.out.println(s);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		
		
		StringBuffer sb = new StringBuffer("Test");
		StringBuffer sb1 = new StringBuffer("Test");
		//sb.append("test2");
		System.out.println(sb);
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
	}

}
