/*

import java.util.Scanner;

public class ten {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		int x;
		
		System.out.println("Enter: ");
		
		x = vl.nextInt();
		
		System.out.println("Result: " );
		
		vlad(x);
	    
		}
		

	
	
	public static void vlad(int x) {
		
	    int k = 0;
		
		for(int i = 1; i <= 13; i++) {    // i - точки сверху колво
			int sum = 0;
			for(int j = i; j <= i*2 - 2; j++) {
				sum += j;
			}
			sum *= 2;
			sum += i*2 - 1;
			
			if(sum == x) {
				k = i;
			}
			
		}
		
		
		
		if((x-1) % 6 == 0 && k > 0 ) {
			for(int i = k; i <= k*2 - 2; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i = 0; i < k*2-1; i++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			for(int i = k*2 - 2; i >=k; i--) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		} else {
			System.out.println("Invalid");
		}
}
}

*/
