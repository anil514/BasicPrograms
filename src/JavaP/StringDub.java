package JavaP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringDub {

	public static void main(String[] args) {
		String s1= "I am am Java Java java am";
		String[] a =s1.split(" ");
		//String a[] = {"I", "am","am", "java", "java", "am", "am", "java"};
		
		for(int i =0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i].equals(a[j])) {
					System.out.println(a[i]);
				}
			}
		}
		System.out.println("++++++++++++++++++");
		Set<String>s = new HashSet<String>();
		for(String name : a) {
			if(s.add(name)==false) {
				System.out.println("dub"+name);
			}
		}
		System.out.println("**********");
		HashMap<String, Integer>map = new HashMap<>();
		for(String ch: a) {
			if(map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
