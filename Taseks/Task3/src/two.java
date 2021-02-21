/*

import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter: ");
		
		str = vl.nextLine();
		
		
		
		System.out.println("The result is: " + vlad(str));
}
	
	public static int vlad(String str) {
		
		int q = 0;
		int x = -1;
		
		
		
		for(int i = 2; i < str.length(); i++) {
			if((int)str.charAt(i) == (int)'p' && (int)str.charAt(i - 1) == (int)'i' && (int)str.charAt(i - 2) == (int)'z') {
				q++;
				if(q == 2) {
					x = i - 2;
				}
			}
		}
		
		return x;
	}
	
	
	
	
	
	
}

*/