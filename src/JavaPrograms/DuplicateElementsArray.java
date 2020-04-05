package JavaPrograms;

import java.util.HashSet;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		String a[] = {"java", "C" , "C++", "Rubby", "java"}; 
		for(int i =0; i<a.length; i++) {
			for(int j =i+1; j<a.length; j++) {
				if(a[i].equalsIgnoreCase(a[j])) {
					System.out.println(a[i]);
				}
			}
		}
		HashSet<String> hm = new HashSet<>();
		for(String dub:a) {
			if(hm.add(dub)==false) {
				System.out.println("dub:" +dub);
			}
		}

	}

}
