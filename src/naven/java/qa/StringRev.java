package naven.java.qa;

public class StringRev {

	public static void main(String[] args) {		
		String s = "This is Anil";
		StringBuffer bf = new StringBuffer(s);
		String rev1 = bf.reverse().toString();
		System.out.println(rev1);
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		String s1 = "My India";
		String revword = "";
		String[] arr = s1.split(" ");
		for(int i =0; i<arr.length; i++) {
			String revw = "";
			char[] ch = arr[i].toCharArray();
			for(int j=ch.length-1; j>=0; j--) {
				revw = revw+ch[j];
			}
			revword = revword + revw +" ";
		}
		System.out.println("reve: "+revword);
		

	}

}
