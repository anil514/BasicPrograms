package JavaPrograms;

public class SumOfElementsArray {

	public static void main(String[] args) {
		int a[] = {2,4,5,7,3};    //length = 5, last index= length-1
		int sum =0;
		for(int i =0; i<=a.length-1; i++) {
			sum = sum +a[i];
		}
		System.out.println(sum);
		
		//for each loop
//		
//		for(int total :a) {
//			sum= sum+total;
//		}
//		System.out.println(sum);

	}

}
