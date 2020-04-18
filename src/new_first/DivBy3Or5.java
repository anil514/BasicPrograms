package new_first;

public class DivBy3Or5 {

	public static void main(String[] args) {
		for(int i =0; i<=100; i++) {
			if(i%3==0||i%5==0) {
				if(i%3!=0||i%5!=0) {
					System.out.println(i);
				}
				
			}
		}

	}

}
