
/*
import java.util.Scanner;

public class one {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		int cho = 0;
		
		System.out.println("0 - encode, 1 - decode: ");
		
		cho = vl.nextInt();
		
		if(cho == 0) {
			vl.nextLine();
			System.out.println("Enter: ");
			String str = vl.nextLine();
			int[] arr = new int[str.length()];
			System.out.println("Result: ");
			arr = vladEn(str);
			for(int i = 0; i < str.length(); i++) {
				System.out.println(arr[i]);
			}
		} else {
			int size = 0;
			
			System.out.println("Enter size: ");
			
			size = vl.nextInt();
			
		int[] arr = new int [size];
		
		System.out.println("Enter: ");
		for(int i = 0; i < size; i++) {
			arr[i] = vl.nextInt();
		}
		
		System.out.println("Result: " + vladDe(arr, size));
	    
		}
		
}
                           
	
	public static int[] vladEn(String s) {
		
		int[] arr = new int[s.length()];
		arr[0] = (int)s.charAt(0);
		for(int i = 1; i < s.length(); i++) {
			arr[i] = (int)s.charAt(i) - (int)s.charAt(i - 1);
		}
		
		return arr;
		
	}
	  //  H e   l  l  o
	//   72 29  7  0  3    H                 q 72              
	
	public static String vladDe(int[] arr, int size) {
		
		int q = 0;
		
		String str = "";
		
		
		for(int i = 0; i < size; i++) {
			str += (char)(q + arr[i]);
			q = q + arr[i];
		}
		
		return str;
	}
}

*/