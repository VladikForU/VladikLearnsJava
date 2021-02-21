
/*
import java.util.Scanner;

public class three {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String str1, str2;
		
		System.out.println("Enter: ");
		
		str1 = vl.nextLine();
		str2 = vl.nextLine();
		
		System.out.println("Result: " + vlad(str1, str2));
	    
		}
		
                           
	
	public static Boolean vlad(String s1, String s2) {
		
		int q = 0;
		
		String ss = "";
		
		for(int i = 0; i < s2.length(); i++) {
			if(q < s1.length()) {
			if(s2.charAt(i) == s1.charAt(q)) {
				ss += s2.charAt(i);
				q++;
				
			}
			}
		}
		
		if(s1.equals(ss)) {
			return true;
		} else {
			return false;
		}
	}
}
*/