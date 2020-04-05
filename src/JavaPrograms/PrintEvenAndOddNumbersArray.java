package JavaPrograms;

public class PrintEvenAndOddNumbersArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int length = a.length;
		System.out.println("Even");
		for(int i=0; i<length ; i++) {
			if(a[i]%2==0) 
				System.out.println(a[i]);			
		}
		System.out.println("Even");
		for(int value :a) {
			if(value%2==0) 
				System.out.println(value);			
		}	
		
		
		System.out.println("ODD");
		for(int i=0; i<length ; i++) {
			if(a[i]%2!=0) 
				System.out.print(a[i]);			
		}

	}

}
