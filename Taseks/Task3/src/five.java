/*

import java.util.Scanner;

public class five {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter: ");
		
		str = vl.nextLine();
		
		System.out.println("The result is: " + vlad(str));
}
	
	
	public static Boolean vlad(String s) {
		
		int z = 0;
		
		if(s.charAt(0) == '#') {
			z++;
		}
		
		for(int i = 1; i < s.length() - 1; i++) {
			if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 70 || (int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57 || (int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 102) {
				z++;
			}
		}
		
		if(z == s.length() - 1 && s.length() == 7) {
			return true;
		} else {
			return false;
		}
		// 65-90, 48-57, 97-122
		}
		
	}
	
	
	*/
	
	
	
