/*

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter: ");
		
		str = vl.nextLine();
		
		System.out.println("Result: " + vlad(str));
		
	}
	
	
	public static Boolean vlad(String str) {
		int r = 3;
		int boo = 0;
		int u = 0;
		String rgb = "", rgba = "";
	  for(int i = 0; i < 3; i++) {
		  rgb += str.charAt(i);
	  }
	  for(int i = 0; i < 4; i++) {
		  rgba += str.charAt(i);
	  }
	  
	  if(rgba.equals("rgba")) {
		  r = 4;
		  boo = 1;
	  } else if(rgb.equals("rgb")) {
		  boo = 1;
	  } else {    
		  u--;
	  }
	  
	  if(boo == 1) {
		  if(str.charAt(r) == '(') {
			  boo++;
			  r++;
		  } else {
			  u--;
		  }
			  
		  }
	  String zna = "";
	  int ch = 0;
	  int pr = 0;
	  int k = 0;
	  if(boo == 2) {
		  Double d = 300.0;
		  for(int i = r; i < str.length(); i++) {
			  if(str.charAt(i) != ',') {
				  zna += str.charAt(i);
			  } else {
				  ch++;
				  int w = 0;
				  for(int a = 0; a < zna.length(); a++) {
					  if(Character.isDigit(zna.charAt(a))) {
						  w++;
					  }
				  }
				  if(w == zna.length() && zna.length() >= 1) {
				  d = Double.valueOf(zna);
				  zna = "";
				  if(d >= 0 && d < 256) {
					  pr++;
				  }
			  }
			  }
		  }
		  String rez1 = "";
		  for(int i = 0; i < zna.length() - 1; i++) {
			  rez1 += zna.charAt(i);
		  }
		  
		  d = Double.valueOf(rez1);
		  
		  
		  rez1 = "";
		  if(d >= 0 && d < 256) {
			  pr++;
		  }
		  
		  
		  r--;
		  
		  
		  if(ch + 1 == r && r == pr) {
			  
			  
			  if(str.charAt(str.length() - 1) != ')') {
	u--;
			  } 
		  } else {
			  u--;
		  }
	  
	} else {
		u--;
	}
	  
	  if(u == 0) {
		  return true;
	  } else {
		  return false;
	  }
	  
	}
}

*/
