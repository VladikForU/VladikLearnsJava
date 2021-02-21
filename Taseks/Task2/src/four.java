/*
import java.util.Scanner;

public class four {
	public static void main(String[] args) {
		
	Scanner vl = new Scanner(System.in);
	
	int q;
	int[] arr;
	
	System.out.println("How many el? ");
	
	q = vl.nextInt();
	
	arr = new int[q];
	
	System.out.println("Enter: ");
	
	for(int i = 0; i < q; i++ ) {
		arr[i] = vl.nextInt();
	} 
	
	System.out.println("Result is: " );
	
	arr = vlad(arr, q);
	
	for(int i = 0; i < q; i++) {
		System.out.println(arr[i]);
	}
	
}
	
	public static int[] vlad(int[] a, int k) {
		int sum = 0;
		
		for(int i = 0; i < k; i++) {
			sum += a[i];
			a[i] = sum;
		}
		
		return a;
		
		
	}
	
}
*/
