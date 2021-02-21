/*

import java.util.Scanner;

public class nine {
	public static void main(String[] args) {
	
	Scanner vl = new Scanner(System.in);
	
	String str, sstr;
	
	System.out.println("Enter: ");
	
	str = vl.nextLine();
	sstr = vl.nextLine();
	
	System.out.println("Result is: ");
	System.out.println("IsPreffix: " + isPref(str, sstr));
	System.out.println("IsSuffix: " + isSuff(str, sstr));
}
	
	public static Boolean isPref(String s, String ss) {
		
		int q = ss.length() - 1;
		int z = 0;
		 for(int i = 0; i < q; i++) {
			 if((int)s.charAt(i) != (int)ss.charAt(i)) {
				 z++;
			 }
		 }
		
		if(z == 0) {
			return true;
		} else {
			return false;
		}
		    
		
	}
	
	public static Boolean isSuff(String s, String ss) {
		
		int q1 = ss.length() - 1;
		int x = 0;
	
		for(int i = 0; i < q1; i++) {
			if((int)s.charAt(s.length() - q1 + i) != (int)ss.charAt(i+1)) {
				x++;
			}
		}
		if(x == 0) {
			return true;
		} else {
			return false;
		}
	}
		
}

*/