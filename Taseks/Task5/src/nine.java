
/*
import java.util.Scanner;

public class nine {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter: ");
		
		str = vl.nextLine();
		
		System.out.println("Result: " + vlad(str));
	    
		}
		
//    one two three four five six seven eight nine ten elven twel
 //   123456789     
	
	
	public static String vlad(String str) {
		
		String res = "";
		String word = "";
	    String wordd = "";
		word += str.charAt(0);
	    
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) != ' ' && i < str.length()-1) {
				word += str.charAt(i);
				} else {
				for(int j = 0; j < word.length(); j++) {
					String ss = ""; 
					ss += word.charAt(j);
					wordd += ss.toLowerCase();
				}
				
				// wordd - чистые
				
				if(!wordd.equals("and") && !wordd.equals("in") && !wordd.equals("the") && !wordd.equals("of")) {
					word = "";
					String ss = "";
				ss += wordd.charAt(0);
				word += ss.toUpperCase();
				for(int k = 1; k < wordd.length(); k++) {
					word += wordd.charAt(k);
			}
				wordd = "";
				wordd += word;
				}
				
				word = "";
				res += wordd;
				res += ' ';
				wordd = "";
		}
		
			
		}
		
		res += '.';
		
		return res;
}
}

*/