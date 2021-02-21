/*

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter str: ");
		
		str = vl.nextLine();
		
		
		System.out.println("Result: " );
		String[] arr = vlad(str);
		
		for(int i = 0; i < 3; i++) {
			if(!arr[i].equals("")) {
			System.out.println("#" + arr[i]);
		}
		}
		
	}
	
	
	public static String[] vlad(String str) {
	
		String[] arr = new String[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = "";
		}
		
		String ss = "";
		
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i) != ' ' && str.charAt(i) != ',') && i < str.length() - 1) {
				ss += str.charAt(i);
				
			} else {
		if(i == str.length() - 1) {
			ss += str.charAt(i);
		}
				int q = 0;
				for(int j = 0; j < 3; j++) {
					if(ss.length() > arr[j].length()) {
						q++;
					}
				}
				if(q == 1) {
					arr[2] = "";
					arr[2] += ss;
					ss = "";
				}
				if(q == 2) {
					arr[2] = arr[1];
					arr[1] = "";
					arr[1] += ss;
					ss= "";
				}
				if(q == 3) {
					arr[2] = arr[1];
					arr[1] = arr[0];
					arr[0] = "";
					arr[0] += ss;
					ss = "";
				}
				
				ss = "";
			}
	}
		
		return arr;
		
	}
}

*/
// How the Avocado Became the Fruit of the Global Trade    до пробела или до запятой
