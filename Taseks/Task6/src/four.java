/*
import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		String str;
		int q;
		
		System.out.println("Enter str: ");
		
		str = vl.nextLine();
		
		System.out.println("Enter size of arr: ");
		
		q = vl.nextInt();
		
		
		char[] arr;
		
		if(q > 0) {
			arr = new char[q];
		for(int i = 0; i < q; i++) {
			vl.nextLine();
			String y = vl.nextLine();
			arr[i] = y.charAt(0);
		}
		} else {
			arr = new char[1];
		}
		
		
		System.out.println("Result: " + vlad(str, arr, q));
		
	}
	
	
	public static String vlad(String str, char[] arr, int size) {
	
		int r = str.indexOf('?');
		int ee = 0;
		
		String ss = "";
		String res = "";
		String[] zna = new String[13];
		for(int i = 0; i < 13; i++) {
			zna[i] = "0";
		}
		
		for(int i = 0; i < r+1; i++) {
			res += str.charAt(i);
		}
		
		for(int i = r + 1; i < str.length(); i++) {
			if(str.charAt(i) != '&') {
				ss += str.charAt(i);
			} else if (str.charAt(i) == '&' || i == str.length()-1){
				int y = 0;
				for(int j = 0; j < 13; j++) {
					if(!ss.equals("") && zna[j].equals(String.valueOf(ss.charAt(0)))) {
						y++;
					}
				}
				int yy = 0;
				for(int j = 0; j < size; j++) {
					if(!ss.equals("") && (ss.charAt(0)) == arr[j]) {
						yy++;
					}
				}
				
				
				if(y == 0 && yy == 0) {
					res += ss;
					res += '&';
					if(y == 0 && ee < 13 && !ss.equals("")) {
					zna[ee] = String.valueOf(ss.charAt(0));
					ee++;
					
					}	
				}
				
				ss = "";
			}
			
		}
		
		String ress = "";
		if(!res.equals("")) {
		for(int i = 0; i < res.length() - 1; i++) {
			ress += res.charAt(i);
		}
		}
		res = "";
		res += ress;
		
		if(!str.contains("&")) {
			res += str;
		}
		
		return res;
	}
}


*/