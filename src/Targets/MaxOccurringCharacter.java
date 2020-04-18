package Targets;

import java.util.HashMap;
import java.util.Iterator;

public class MaxOccurringCharacter {
	public void MaxChar() {
		String str="qwsqerfwqasddsaaqwedsaqwedsaqw";
		char[] arrChar = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(Character cha:arrChar) {
			if(hm.containsKey(cha)) {
				int val = hm.get(cha);
				hm.put(cha, val+1);
			}else {
				hm.put(cha, 1);
			}			
		}
		System.out.println(hm);
		Iterator<Character> tempString = hm.keySet().iterator();
		while(tempString.hasNext()) {
			Character temp = tempString.next();
			if(hm.get(temp)>1) {
				System.out.println(temp+""+hm.get(temp));
			}
		}
	}

	public static void main(String[] args) {
		
		MaxOccurringCharacter mc = new MaxOccurringCharacter();
		mc.MaxChar();

	}

}
