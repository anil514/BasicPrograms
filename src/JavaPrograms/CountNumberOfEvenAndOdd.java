package JavaPrograms;

public class CountNumberOfEvenAndOdd {

	public static void main(String[] args) {
		int num = 1256894;
		int count =0;
		int even_count =0;
		int odd_count =0;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				System.out.println("Even:" +rem);
				even_count++;
			}else {
				odd_count++;
			}
			num = num/10;
			count++;
		}
		System.out.println("total count: "+count);
		System.out.println("number of even: "+even_count);
		System.out.println("number of Odd: "+odd_count);

	}

}
