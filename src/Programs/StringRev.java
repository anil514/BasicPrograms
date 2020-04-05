package Programs;

public class StringRev {
	public void revString() {
		String s ="Anil";
		int l = s.length();
		String rev = "";
		for(int i =l-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		String s1 = "Anil Love India";
		String[] arr = s1.split(" ");
		String revAll = "";
		for(int i =0; i<arr.length; i++) {
			String revw = "";
			char[] ch = arr[i].toCharArray();
			for(int j=ch.length-1; j>=0; j--) {
				revw = revw+ch[j];
			}
			revAll = revAll + revw+" ";
		}
		System.out.println(revAll);
		
	}

}
