/*

import java.util.Scanner;

public class seven {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		int q;
		
		System.out.println("Enter: ");
		
		q = vl.nextInt();
		
		System.out.println("The result is: " + vlad(q));
}
	
	
	public static Boolean vlad(int z) {
		
		int q = z * z;
		
		int k = 0, x1, x2;
		
		String s1 = "", s2 = "";
		
		String num = String.valueOf(q);
		
		k = num.length();
		
		if(k > 1) {
		
		for(int i = 0; i <= k/2 - 1; i++) {
			s1 += num.charAt(i);
		}
		
		for(int i = k/2; i < k; i++) {
			s2 += num.charAt(i);
		}
		
		x1 = Integer.valueOf(s1);
		x2 = Integer.valueOf(s2);
		
		if(x1 + x2 == z) {
			return true;
		} else {
			return false;
		}
		} else {
			if(z == q) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	
}

*/