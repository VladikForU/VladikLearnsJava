/*

import java.util.Scanner;

public class seven {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String str;
		
		System.out.println("Enter: ");
		
		str = vl.nextLine();
		
		System.out.println("Result: " + vlad(str));
	    
		
		
}
//777geff      7*3gef                             q 1         ch    g
	
	public static String vlad(String s) {
		
		String neww = "";
		int q = 1;
		char ch = s.charAt(0);
		
		neww += ch;
		
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == ch) {
				q++;
				//if(i < s.length() - 1 && s.charAt(i + 1) != s.charAt(i))
			} else {
				
				if(q > 1) {
					neww += '*';
					neww += String.valueOf(q);
				}
				
				ch = s.charAt(i);
				neww += ch;
				q = 1;
				
			}
			
			if(i == s.length() - 1) {
				neww += '*';
				neww += String.valueOf(q);
			}
		}
		
		return neww;
	}
}

*/