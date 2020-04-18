package Pra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.IntStream;

public class DubNum {


	public void Test1() {
		String a ="The Man of Power The MAN MAN";
		String[] arr = a.split(" ");
		for(int i =0; i<arr.length; i++) {
			for(int j =i+1;j<arr.length; j++ ) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	public void Test2() {
		String a ="The Man of Power The MAN MAN";
		String[] arr = a.split(" ");
		HashMap<String, Integer>hm = new HashMap<>();
		for(String ch :arr) {
			if(hm.containsKey(ch)) {
				int val = hm.get(ch);
				hm.put(ch, val+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}
	
	public void Test3() {
		String str = "testcase,,,,,passed";
		int count =0;
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch==',') {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public void Test4() {
		String a = "1010110";
		int count =0;
		for(int i=0; i<a.length(); i++) {
			char ch = a.charAt(i);
			if(ch==1) {
				count++;
			}
		}
		System.out.println(count);
	}
	



	public static void main(String[] args) {
		DubNum db = new DubNum();
	//	db.Test1();
	//	db.Test2();
		db.Test3();
		db.Test4();


	}

}
