package Pra;

public class PrintNumString {

	public static void main(String[] args) {
		String str = "ABC743DBF67OP";
		String num ="";
		num = str.replaceAll("[^0-9]", "");
		System.out.println(num);
		int len = num.length();
		int count =0;
		for(int i=0; i<len; i++) {
			if(Character.isDigit(num.charAt(i))) {
				count+=Integer.parseInt(num.substring(i, i+1));
			}
		}
		
		System.out.println(count);
		
	}

}
