/*
import java.util.Scanner;

public class nine {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		int q;
		
		System.out.println("Enter: ");
		
		q = vl.nextInt();
		
		System.out.println("The result is: " + vlad(q));
}
	
	
	public static int vlad(int z) {
		
		int q = 0;
		
		while(q != 2) {
		for(int i = 1; i <= z; i++) {
			if(z%i == 0) {
				q++;
			}
		}
		
		if(q == 2) {
			return z;
		} else {
			z += 1;
			q = 0;
		}
		
		}
		
		return 0;
	}
	
	
}
*/