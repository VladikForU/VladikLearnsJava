
/*

import java.util.Scanner;

public class five {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String str1, str2;
		
		System.out.println("Enter x pounds/kilos, y inches/meters: ");
		
		str1 = vl.nextLine();
		str2 = vl.nextLine();
	    
		System.out.println("Result:   " + vlad(str1, str2));
		 
}

	
	public static String vlad(String s1, String s2) {
		
		String ch = "";
		String ves = "", rost = "";
		Double v = 0.0;
		Double r = 0.0;
		
		for(int i = 0; i < s1.length(); i++) {
			if(Character.isDigit(s1.charAt(i))) {
				ves += s1.charAt(i);
			} else if(Character.isLetter(s1.charAt(i))){
				ch += s1.charAt(i);
			}
		}
		
		
		v = Double.valueOf(ves);
		if(ch.equals("pounds")) {
			v *= 0.454;
		}
	
		
		ch = "";
		
		for(int i = 0; i < s2.length(); i++) {
			if(Character.isDigit(s2.charAt(i))) {
				rost += s2.charAt(i);
			} else if(Character.isLetter(s2.charAt(i))){
				ch += s2.charAt(i);
			}
		}
		
		r = Double.valueOf(rost);
		
		if(ch.equals("inches")) {
			r *= 0.025;
		} else {
			r /= 100;
		}
	
		
		Double imt = v / (r*r);
		
		
		String e = "";
		e += String.valueOf(imt);
		
		
		String res = "";
		
		for(int i = 0; i < 5; i++) {
			res += e.charAt(i);
		}
		
		res += "   ";
		
		if(imt < 18.5) {
			res += "Underweight";
		} else if(imt < 24.9){
			res += "Normal weight";
		} else {
			res += "oVERWEIGHT";
		}
		
		
		
		return res;
}
}
// 0,454 = 1kg;   pounds   kilos inches meters  0,0254 metr

*/