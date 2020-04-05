package JavaPrograms;

import java.util.Random;

public class RandomNumbersAndStrings {

	public static void main(String[] args) {
		//1st  -Random
		Random ran = new Random();
		int random = ran.nextInt(100);
		System.out.println(random);
		Double dis = ran.nextDouble(); //range 0.0 to 1.0 default
		System.out.println(dis);
		
		//2nd  - Math class
		System.out.println(Math.random()); //new dcimals for random
		
		//3rd -- Appoche commons-lang API
		
	}

}
