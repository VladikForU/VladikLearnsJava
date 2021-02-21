
/*
import java.util.Scanner;

public class three {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String str;
		int v;
		
		
		System.out.println("Enter 0 for Camel and 1 for Snake: ");
		
		v = vl.nextInt();
		vl.nextLine();
		
		System.out.println("Enter: ");
		
	    str = vl.nextLine();
	    
		if(v == 0) {
		System.out.println("Result: " + Camel(str));
		} else {
			System.out.println("Result: " + Snake(str));
		}
		
}

	
	public static String Camel(String s) {
		
		String str = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != '_') {
				if(i != 0 && s.charAt(i-1) == '_' ) {
					int u = (int)s.charAt(i);
					str += (char)(u - 32);
				} else {
				str += s.charAt(i);
				}
			} 
		}
		
		return str;
	}
	
    public static String Snake(String s) {
		
		String str = "";
		for(int i = 0; i < s.length(); i++) {
			if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90) {
				str += '_';
				int u = (int)s.charAt(i);
				str += (char)(u + 32);
			} else {
				str += s.charAt(i);
			}
		}
		
		return str;
	}
	
	//65 97
}

*/