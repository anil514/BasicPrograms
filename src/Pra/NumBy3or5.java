package Pra;

public class NumBy3or5 {

	public static void main(String[] args) {
		for(int i =1; i<100; i++) {
			if(i%3==0||i%5==0) {
				if(i%3!=0||i%5!=0) {
					System.out.println(i);
				}
			}
		}

	}

}
