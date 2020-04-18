package JavaP;

public class NumString {

	public static void main(String[] args) {
		String s = "123jhjdvbgf98";
		String p =s.replaceAll("[^0-9]", "");
		System.out.println(p);
		int num = p.length();
		int count =0;
		for(int i =0; i<num; i++) {
			if(Character.isDigit(p.charAt(i))) {
				count+=Integer.parseInt(p.substring(i, i+1));
			}
		}
		System.out.println(count);
	}

}
