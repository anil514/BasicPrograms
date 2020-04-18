package Pra;

import java.util.HashMap;
import java.util.Map;

public class DublicateArrayInt {

	public static void main(String[] args) {
		int[] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		Map<Integer,Integer> hm = new HashMap<>();
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		for(int ch :arr) {
			if(hm.containsKey(ch)) {
				int val = hm.get(ch);
				hm.put(ch, val+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);

	}

}
