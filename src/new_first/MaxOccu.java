package new_first;

import java.util.HashMap;

public class MaxOccu {

	public static void main(String[] args) {
		String str = "ani Potla ani";
		char[] arrChar = str.toCharArray();
		HashMap<Character, Integer>hm = new HashMap<>();
		for(Character cha : arrChar) {
			if(hm.containsKey(cha)) {
				int val = hm.get(cha);
				hm.put(cha, val+1);
			}else {
				hm.put(cha, 1);
			}
		}
		System.out.println(hm);
	}

}
