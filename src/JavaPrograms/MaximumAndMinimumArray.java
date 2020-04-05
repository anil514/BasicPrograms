package JavaPrograms;

public class MaximumAndMinimumArray {

	public static void main(String[] args) {
		int a[] = {10, 20, 40, 5, 70};
		int max = a[0];    //10,  20, 40,  40
		for(int i =1; i<a.length; i++) {
			if(a[i]>max) {    //20>10,   20>40, 40>5, 40>70
				max = a[i];   //20,   40,  40, 70
			}
		}
		System.out.println("Maximum:" +max);
		
		System.out.println("<==================>");
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Minimun:" +min);
	}

}
