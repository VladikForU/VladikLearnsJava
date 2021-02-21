
/*
import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter str: ");
		
		str = vl.nextLine();
		
		
		System.out.println("Result: " + vlad(str) );
		
		
		
	}
	
	
	public static Boolean vlad(String str) {
	
		String a = "";
		String znak = "";
		String ss = "";
		int aa = 0;
		String zn = "/%-+";
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				a += str.charAt(i);
			} else if(!a.equals("") && zn.contains(String.valueOf(str.charAt(i)))) {
					aa = Integer.valueOf(a);
					a = "";
					znak += str.charAt(i);
				} else if(str.charAt(i) == '=') {
					aa += Integer.valueOf(a);
				}
			}
		}
		
	}
	
	*/
