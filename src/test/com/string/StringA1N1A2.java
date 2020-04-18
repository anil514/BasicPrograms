package test.com.string;

public class StringA1N1A2 {

	public static void main(String[] args) {
		String s = "ANIAN";
		String output ="";
		for(int i=0; i<s.length(); i++) {
			output = output+s.charAt(i)+1;
		}
		System.out.println(output);

	}

}
