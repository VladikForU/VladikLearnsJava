/*

import java.util.Scanner;

public class six {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter: ");
		
		str = vl.nextLine();
		
		System.out.println("Result: " + vlad(str));
	    
		}
		
//    1234567890123452
                           
	public static Boolean vlad(String str) {
		
		int k = str.length();
		
		String ss = "";
		
		int sum = 0;
		
		String kontr = "";
		kontr += str.charAt(k - 1);
		
		for(int i = k-2; i >= 0; i--) {
			ss += str.charAt(i);
		}
		
		str = "";
		
		for(int i = 0; i < ss.length(); i++) {
			if(i % 2 == 0) {
				int w = Integer.valueOf(ss.charAt(i)) * 2;
				if(w >= 10) {
					w = w/10 + w % 10;
				}
				sum += w;
				w = 0;
			} else {
				sum += Integer.valueOf(ss.charAt(i));
			}
		}
		
		ss = "";
		
		sum = sum % 10;
		
		if(10 - sum == Integer.valueOf(kontr) && k >= 14 && k <= 19) {
			return true;
		} else {
			return false;
		}
}
}

*/