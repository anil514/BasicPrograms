package Demo;

public class TestP1 {

	public static void main(String[] args) {
		int i=0;
		int num =0;
		String pm ="";
		for( i =0; i<=100; i++) {
			int count =0;
			for(num=i; num>=1; num--) {
				if(i%num==0) {
					count =count+1;
					//System.out.println(count);
				}
			}
			if(count==2) {
				pm =pm+i+"";
			}
			
		}
		System.out.println(pm);
	}

}
