package JavaP;

import java.util.HashMap;
import java.util.Iterator;

public class In1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		String s1= "I am am Java Java am";
		String[] a =s1.split(" ");
		for(String tempString: a) {
			if(hm.get(tempString)!=null) {
				hm.put(tempString, hm.get(tempString) +1);
			}else {
			hm.put(tempString, 1);
			}
		}
		Iterator<String> tempString  = hm.keySet().iterator();
		while(tempString.hasNext()) {
			String temp = tempString.next();
			if(hm.get(temp)>1) {
				System.out.println(temp+""+hm.get(temp));
			}
		}

	}

}
