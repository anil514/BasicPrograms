package CommonJavaExamples;

public class WhetherCharacterAlphabetOrNot {

	public static void main(String[] args) {
		char c = 'A';
		
		if(c>='a' && c<='z' || c>='A' && c<='Z') {
			System.out.println(c + " is Alphabet");
		}else {
			System.out.println(c + " is not Alphabet");
		}

	}

}
