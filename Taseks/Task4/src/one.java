/*

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		int k;
		String ww;
		
		System.out.println("Enter k, str: ");
		
		k = vl.nextInt();
		vl.nextLine();
	    ww = vl.nextLine();
	    
		
		vlad(k, ww);
}
	
	
	public static void vlad(int b, String s) {
		
		
		String ss = "";
		int x = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				int o = 0;
				for(int j = 0; s.charAt(i + j)!= ' '; j++) {
					o++;
				}
				if(x + o < b) {
					ss += s.charAt(i);
					x++;
				} else {
					System.out.println(ss);
					x = 0;
					ss = "";
				}
				
			} else {
				ss += s.charAt(i);
				x++;
			}
			
			if(i == s.length() - 1) {
				System.out.println(ss);
			}
		}
		
	}
	
	
}

*/