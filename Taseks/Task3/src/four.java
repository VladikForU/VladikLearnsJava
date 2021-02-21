/*
import java.util.Scanner;

public class four {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter: ");
		
		str = vl.nextLine();
		
		System.out.println("The result is: " + vlad(str));
}
	
	
	public static String vlad(String s) {
		
		int q = s.length();
		
		if(q > 2 && s.charAt(0) != s.charAt(q - 1)) {
			String neww = " ";
			
			neww += s.charAt(q-1);
			
			for(int i = 0; i < q - 2; i++) {
				neww += s.charAt(i);
			}
			
			neww += s.charAt(0);
			
			return neww;
		} else if (q < 2) {
			return "Incompatible!!!!";
		} else  {
			return "Two is a pair <3";
		}
		
	}
	
	
	
	
	
	
}
*/