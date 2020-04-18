package new_first;

public class Prime {
	String s1="";
	String s2 ="";
	
	

	public static void main(String[] args) {
		for(int i=2; i<=10; i++) {
			//boolean prime =true;
			int flag =1;
			for(int j =2; j<i; j++) {
				if(i%j==0) {
					//prime = false;		
					flag=0;
				}
			}
				if(flag==1) {
					System.out.println(i);
				}
			}
			
			
		}
	}


