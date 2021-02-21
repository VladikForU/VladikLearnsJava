/*
import java.util.Scanner;

public class seven {
	public static void main(String[] args) {
	
	Scanner vl = new Scanner(System.in);
	
	String str;
	
	System.out.println("Enter: ");
	
	str = vl.nextLine();
	
	System.out.println("Result is: " + vlad(str));
}
	
	public static Boolean vlad(String s) {
		
		int q = s.length();
		
		int r = 0;
		
		for(int i = 0; i < q; i++) {
			if((char)s.charAt(i) < 48 || (char)s.charAt(i) > 57) {
				r++;
			}
			
		}
		
		if(q != 5 || r > 0) {
			return false;
		} else {
			return true;
		}
		
		
		
	}
}
*/