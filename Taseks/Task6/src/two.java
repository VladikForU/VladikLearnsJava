/*
import java.util.Scanner;

public class two {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		int x;
		String str;
		
		System.out.println("Enter 0 - for 1 word and 2 for line: ");
		
		x = vl.nextInt();
		
		System.out.println("Enter: ");
		
		vl.nextLine();
		str = vl.nextLine();
		
		System.out.println("Result: " );
		
		if(x == 0) {
		
			System.out.println(vlad1(str));
	    
		} else {
			System.out.println(vlad2(str));
		}
	}
	
	
	public static String vlad1(String str) {
		
	   String res = "";
	   String x = "";
	   
	   x += str.charAt(0);
	   
	   if(x.matches("^(?i:[aeiouy]).*")) {
		   str += "yay";
           return str;
	   } else {
		   String pp = "";
		   int i = 0;
		   x = "";
		   x += str.charAt(0);
		   while(!x.matches("^(?i:[aeiouy]).*")) {
			   pp += x;
			   i++;
			   x = "";
			   x += str.charAt(i);
		   }
		   
		   for(int j = i; j < str.length(); j++) {
			   res += str.charAt(j);
		   }
		   
		   res += pp;
		   res += "ay";
		   return res;
	   }
		
} 
	
	public static String vlad2(String str) {
		
		String ss = "";
		String ress = "";
		
		int i = 0;
		
		while(i < str.length()) {
			
			if(str.charAt(i) != ' ') {
				ss += str.charAt(i);
			} else {
				ress += vlad1(ss);
				ress += ' ';
				ss = "";
			}
			i++;
		}
		
		ress += vlad1(ss);
		
		return ress;
	}
}

*/
