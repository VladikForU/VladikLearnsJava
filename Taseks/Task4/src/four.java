/*

import java.util.Scanner;

public class four {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		double[] arr = new double[4];
		
		System.out.println("Enter: ");
		
	    for(int i = 0; i < 4; i++) {
	    	arr[i] = vl.nextDouble();
	    }			
	    
	    System.out.println("Result: " + vlad(arr));
}

	
	public static int vlad(double[] arr) {
		
		int sverx = (int)(arr[1] - 17);
		int rab = (int)(17 - arr[0]);
		int opl = (int)(arr[2]);
		double mnoz = arr[3];
		
		double rez = rab*opl + sverx*mnoz*opl;
		rez = Math.ceil(rez);
		
		return (int)rez;
}
	
}

*/