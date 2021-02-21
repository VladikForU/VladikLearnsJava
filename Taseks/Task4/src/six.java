/*


import java.util.Scanner;

public class six {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		int v;
		
		System.out.println("Enter: ");
		
		v = vl.nextInt();
		
		System.out.println("Result: " + vlad(v));
	    
		
		
}

	
	public static int vlad(int a) {
		
		int q = 1;
		
		int r = 1;
		
		if(a < 10) {
			return 0;
		} else {
		
		while(a != 0) {
			q = q * (a%10);
			a = a / 10;
			
			if(a == 0 && q >= 10) {
				r++;
				a = q;
				q = 1;
			}
			
		}
		
		return r;
		}
	}
	//729  q  a   9* 72   18 7   126  0     1  126   6 12  12 1  12 0   1 12 2  0
	
}

*/
