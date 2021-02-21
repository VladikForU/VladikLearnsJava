/*

import java.util.Scanner;

public class four {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		int sum;
		
		System.out.println("Enter amount: ");
		
		sum = vl.nextInt();
		
		int[] arr = new int[sum];
		
		System.out.println("Enter: ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = vl.nextInt();
		}
		
		System.out.println("Result: " + vlad(arr));
	    
		}
		

                           
	public static int vlad(int[] arr) {
		
		int sum = 0;
		String str = "";
		
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		str = String.valueOf(sum);
		sum = 1;
		
		while(str.length() >= 2) {
			for(int i = 0; i < str.length(); i++) {
				String v = "";
				v += str.charAt(i);
				sum *= Integer.valueOf(v);
			}
			str = String.valueOf(sum);
			sum = 1;
			
			System.out.println(str);
		}
		
		sum = Integer.valueOf(str);
		
		System.out.println("________________________");
		
		return sum;
	  
}
}
*/