
/*
import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter str: ");
		
		str = vl.nextLine();
		
		
		System.out.println("Result: " + vlad(str) );
		
		
		
	}
	
	
	public static String vlad(String str) {
	
		String res = "";
		String ss = "";
		
		for(int i = 0; i < str.length(); i++) {
			String w = "";
			w += str.charAt(i);
			if(!ss.contains(w) && i < str.length() - 1) {
				ss += w;
			} else {
				if(i == str.length()-1 && !ss.contains(w)) {
				ss += w;
				}
				if(res.length() < ss.length()) {
					res = "";
					res += ss;
				}
				ss = "";
				ss += w;
			}
		}
		
		return res;
		
	}
}

*/