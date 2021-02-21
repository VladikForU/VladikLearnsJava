/*

import java.util.Scanner;

public class nine {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String str1, str2;
		
		System.out.println("Enter: ");
		
		str1 = vl.nextLine();
		str2 = vl.nextLine();
		
		System.out.println("Result: " + vlad(str1, str2));
	    
		
		
}
                           
	
	public static Boolean vlad(String s1, String s2) {
		
		String ch = "";
		
		int ff = 0;
		
		for(int i = 0; i < s1.length() - 2; i++) {
			for(int j = 0; j < 10; j++) {
				String w = String.valueOf(j);
				if(s1.charAt(i) == w.charAt(0) && s1.charAt(i + 1) == w.charAt(0) && s1.charAt(i + 2) == w.charAt(0)) {
					ff++;
					ch += w.charAt(0);
				}
			}
		}
		
		
		if(ff > 0) {
		for(int i = 0; i < s2.length() - 1; i++) {
				if(s2.charAt(i) == ch.charAt(0) && s2.charAt(i + 1) == ch.charAt(0)) {
					ff++;
				}
		}
		}
		
		if(ff >= 2) {
			System.out.println(ch);
			return true;
		} else {
			return false;
		}
	
		
	}
}

*/
