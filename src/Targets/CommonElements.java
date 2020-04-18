package Targets;

public class CommonElements {
	public void array() {
		int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4};
        for(int i =0; i<arr1.length; i++) {
        	for(int j =0; j<arr2.length; j++) {
        		if(arr1[i]==arr2[j]) {
        			System.out.println(arr1[i]);
        		}
        	}
        }
		
	}
	public void string() {
		String a = "ANILP";
		String b = "ANIP";
		for(int i =0; i<a.length(); i++) {
			for(int j =0; j<b.length(); j++) {
				if(a.charAt(i)==b.charAt(j)) {
					System.out.println(a.charAt(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		CommonElements ce = new CommonElements();
		ce.string();

	}

}
