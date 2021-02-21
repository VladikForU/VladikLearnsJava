/*

import java.util.Scanner;

public class eight {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter: ");
		
		str = vl.nextLine();
		
		System.out.println("The result is: " + vlad(str));
}
	
	
	public static String vlad(String s) {
		
	    int max = 0;
	    
	    String res = "";
	    
	    for(int i = 0; i < s.length(); i++) {
	    	int j = 0;
	    	if(s.charAt(i) == '0') {
	    	while (s.charAt(i + j) == '0' && i+j < s.length() - 1) {
	    		j++;
	    	}
	    	if(j > max) {
	    		max = j;
	    	}
	    	}
	    }
	    
	    for(int i = 0; i < max; i++) {
	    	res += '0';
	    }
		
	    return res;
	    
		}
		// 000101100001
	}
	
	*/