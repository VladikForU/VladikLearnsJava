
/*

import java.util.Scanner;

public class five {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String[] str;
		int x = 0;
		
		System.out.println("Enter amount: ");
		
		x = vl.nextInt();
		
		str = new String[x];
		
		System.out.println("Enter: ");
		
		vl.nextLine();
		
		for(int i = 0; i < x; i++) {
			str[i] = vl.nextLine();
		}
		
		System.out.println("Result: " + vlad(str));
	    
		}
		// "toe", "ocelot", "maniac
                           
	
	public static String vlad(String[] arr) {
		
		char[] glas = new char[] {'a', 'e', 'i', 'o', 'u', 'y'};
		int[] rr = new int[] {1, 3, 7, 15, 28, 51};
		
		//1   3   7  15  28  51
		
		String q = "";
		
		int summ = 0, sum = 0;
		
		String rez = "";
		
		String ss = "";
		
		rez += arr[0];
		rez += ' ';
		
		for(int i = 0; i < arr[0].length(); i++) {
		for(int j = 0; j < 6; j++) {
			if(arr[0].charAt(i) == glas[j]) {
				if(!q.contains(String.valueOf(glas[j]))) {
					q += String.valueOf(glas[j]);
					summ += rr[j];
				}
			}
		}
	}
		
		for(int k = 1; k < arr.length; k++) {
			ss = "";
			sum = 0;
			for(int i = 0; i < arr[k].length(); i++) {
				for(int j = 0; j < 6; j++) {
					if(arr[k].charAt(i) == glas[j]) {
						if(!ss.contains(String.valueOf(glas[j]))) {
							ss += String.valueOf(glas[j]);
							sum += rr[j];
						}
					}
				}
			}
			if (sum == summ && q.length() == ss.length()) {
				rez += arr[k];
				rez += ' ';
			}
		}
		
		return rez;
}
}

*/