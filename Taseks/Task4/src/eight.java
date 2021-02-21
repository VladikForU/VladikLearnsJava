/*

import java.util.Scanner;

public class eight {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String str1, str2;
		
		
		System.out.println("Enter: ");
		
	    str1 = vl.nextLine();
	    str2 = vl.nextLine();
	    System.out.println("Result: " + vlad(str1, str2));
		
}
	
	
	public static Boolean vlad(String s1, String s2) {
		
		String word1 = "", word2 = "";
		String rez1 = "", rez2 = "";
		char[] arr = new char[] {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
		
		Boolean boo = false;
		
		word1 = s1.substring(s1.lastIndexOf(" ")+1);
		word2 = s2.substring(s2.lastIndexOf(" ")+1);
		
		for(int i = 0; i < word1.length(); i++) {
			for(int j = 0; j < 12; j++) {
				if(word1.charAt(i) == arr[j]) {
					char ch = arr[j];
					rez1 += ch;
					break;
				}
				
			}
		}
		
		for(int i = 0; i < word2.length(); i++) {
			for(int j = 0; j < 12; j++) {
				if(word2.charAt(i) == arr[j]) {
					char ch = arr[j];
					rez2 += ch;
					break;
				}
				
			}
		}
		
		
		rez1 = rez1.toLowerCase();
		rez2 = rez2.toLowerCase();
		
		boo = rez1.equals(rez2);
		
		return boo;

		//65 90
	}

}

*/