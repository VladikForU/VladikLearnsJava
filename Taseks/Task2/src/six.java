/*
import java.util.Scanner;

public class six {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		int q;
		
		System.out.println("Enter: ");
		
		q = vl.nextInt();
		
		System.out.println("Result is: " + vlad(q));
		
}
	
	public static int vlad(int a) {
		int x = 0;
		int y = 1;
		
		for(int i = 0; i < a - 2; i++) {
			if(i%2 == 0) {
				x = x + y;
				
			} else {
				y = y + x;
				
			}
		}
		
		if(x > y) {
			return x;
		} else {
			return y;
		}
	}
	
}
*/
