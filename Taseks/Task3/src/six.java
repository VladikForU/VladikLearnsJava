
/*
import java.util.Scanner;

public class six {
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
		
		int[] arr1;
		int[] arr2;
		
		int q1, q2;
		
		
		System.out.println("Size of arr1: ");
		
		q1 = vl.nextInt();
		
		arr1 = new int[q1];
		
		System.out.println("Enter arr1: ");
		
		for(int i = 0; i < q1; i++) {
			arr1[i] = vl.nextInt();
		}
		
		
        System.out.println("Size of arr2: ");
		
		q2 = vl.nextInt();
		
		arr2 = new int[q2];
		
		System.out.println("Enter arr2: ");
		
		
		for(int i = 0; i < q2; i++) {
			arr2[i] = vl.nextInt();
		}
		
		
		System.out.println("The result is: " + vlad(arr1, arr2, q1, q2));
}
	
	
	public static Boolean vlad(int[] a1, int[] a2, int q1, int q2) {
		
		int[] rez1 = new int[10];
		int[] rez2 = new int[10];
		
		int sum1 = 0, sum2 = 0;
		
		for(int i = 0; i < 10; i++) {
			rez1[i] = 0;
			rez2[i] = 0;
		}
		
		for(int i = 0; i < q1; i++) {
			for(int j = 0; j < 10; j++) {
				if(a1[i] == j) {
					rez1[j]++;
				}
			}
		}
		
		for(int i = 0; i < q2; i++) {
			for(int j = 0; j < 10; j++) {
				if(a2[i] == j) {
					rez2[j]++;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(rez1[i] == 1) {
				sum1++;
			}
			if(rez2[i] == 1) {
				sum2++;
			}
		}
		
		if(sum1 == sum2) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// 3 5 8 9 0 1 2 3     (8)    0 0 0 1 0 0 0 0 0 0 
	
	
	
	
	
}

*/