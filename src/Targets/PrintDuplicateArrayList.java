package Targets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateArrayList {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("ANIL");
		name.add("ANI");
		name.add("ANI");
		Set<String> s= new HashSet<>();	
		for(String dub : name) {			
			if(s.add(dub)==false) {
				System.out.println(dub);
			}
		}		
		for(String dub : name) {
			s.add(dub);			
		}
		System.out.println("After remove Dub:"+s);

	}

}
