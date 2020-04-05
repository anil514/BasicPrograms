package Programs;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "%%$^%$anil514(&*&)Potla";
		//using regular exprssion:[^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
