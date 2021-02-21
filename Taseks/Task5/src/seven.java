/*

import java.util.Scanner;

public class seven {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		int q;
		
		System.out.println("Enter: ");
		
		q = vl.nextInt();
		
		System.out.println("Result: " + vlad(q));
	    
		}
		
//    one two three four five six seven eight nine ten elven twel
                           
	public static String vlad(int x) {
		
		String res = "";
		
		String[] arr1 = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		//int[] arr2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		String[] arr2 = new String[] {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] arr3 = new String[] {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		if(x == 0) {
			res += "zero";
		}
		
		if(x < 10 && x != 0) {
			res += arr1[x - 1];
		}
		
		if(x >= 10 && x < 20) {
			res += arr2[x%10];
		}
		
		if(x >= 20 && x <= 100) {
			res += arr3[x/10 - 2];
			res += ' ';
			if(x%10 != 0) {
				res += arr1[x%10 - 1];
			}
		}
		
		if(x >= 100 && x < 1000) {
			res += arr1[x/100 - 1];
			res += ' ';
			res += "hundred";
			res += ' ';
			
			x = x % 100;
			if(x >= 10 && x < 20) {
				res += arr2[x%10];
			} else {
				if(x < 10 && x != 0) {
					res += arr1[x - 1];
				}
				if(x >= 20) {
					res += arr3[x/10 - 2];
					res += ' ';
					if(x % 10 != 0) {
						res += arr1[x%10 - 1];
					}
				}
			}
		}
		
		return res;
}
}

*/
