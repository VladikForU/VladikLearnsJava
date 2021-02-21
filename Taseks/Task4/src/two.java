/*
import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String str;
		
		
		System.out.println("Enter: ");
		
	    str = vl.nextLine();
	    
		
		System.out.println("Result: " );
		
		vlad(str);
		
	
		
}
	
	
	public static void vlad(String s) {
		int a = 0, b = 0;
		String ss = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				a++;
				ss+=s.charAt(i);
			} else if(s.charAt(i) == ')') {
				b++;
				ss+=s.charAt(i);
			}
			
			
			if(a == b) {
				System.out.println(ss);
				
				ss = "";
				a = 0;
				b = 0;
			}
		}
		
	}
	
	
}
*/