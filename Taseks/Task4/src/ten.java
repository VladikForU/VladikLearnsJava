/*
import java.util.Scanner;

public class ten {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String str;
		char ch;
		
		System.out.println("Enter: ");
		
		str = vl.nextLine();
		ch = vl.next().charAt(0);
		
		System.out.println("Result: " + vlad(str, ch));
	    
		
		
}
                           
	
	public static int vlad(String s, char ch) {
		
		int q = 0, sum = 0;
		String str = "", rez = "";
		
		
	for(int i = 0; i < s.length(); i++) {
		if(s.charAt(i) == ch) {
			q++;
		}
		if(q%2 != 0 && s.charAt(i) != ch) {
			str += s.charAt(i);
		}
		if(q%2 == 0) {
			rez+=str;
			str = "";
		}
	}
	
	
	str = "";
	s = "";
	
	for(int i = 0; i < rez.length(); i++) {
		s = "";
		s+=rez.charAt(i);
		if(!str.contains(s)) {
			str += rez.charAt(i);
		}
	}
	
	
	return str.length();
		
	}
}
*/