/*


import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter str: ");
		
		str = vl.nextLine();
		
		
		System.out.println("Result: " + vlad(str) );
		
		
		
	}
	
	//    1121 1230
	public static Boolean vlad(String str) {
	
		int boo = 0;
		String s1 = "", s2 = "";
		int res = Integer.valueOf(str);
		
		// 363
		
		
		
		while(str.length() > 1) {
		for(int i = 0; i < str.length()/2; i++) {
			s1 += str.charAt(i);
		}
		if(str.length()%2 == 0) {
		for(int i = str.length()/2; i < str.length(); i++) {
			s2 += str.charAt(i);
		}
		} else {
			for(int i = str.length()/2 + 1; i < str.length(); i++) {
				s2 += str.charAt(i);
			}
		}
		
		System.out.println(s2);
		
		String ss="";
		for(int i = s2.length() - 1; i >=0; i--) {
			ss += s2.charAt(i);
		}
		
		
		if(ss.equals(s1)) {
			boo++;
		}
		System.out.println(str);
		if(str.length() % 2 == 1) {
			break;
		}
		
		String re = "";
		
		
		
		for(int j = 1; j < str.length(); j+=2) {
			re += Integer.valueOf(String.valueOf(str.charAt(j))) + Integer.valueOf(String.valueOf(str.charAt(j - 1)));
		}
		
		str = re;
		
		System.out.println(str);
		
		s1 = "";
		s2 = "";
		
		
		}
		
		if(boo > 0) {
			return true;
		} else {
			return false;
		}
		
		}
		
	}
	
	*/
