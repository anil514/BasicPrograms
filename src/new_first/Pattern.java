package new_first;

public class Pattern {
	
	public void FloydPattern() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void TriPattern() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k =1; k<=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	public void TriStarPattern() {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10-i; j++) {
				System.out.print(" ");
			}
			for(int k =1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern p = new Pattern();
		//p.FloydPattern();
		//p.TriPattern();
		p.TriStarPattern();

	}

}
