
/*
import java.util.Scanner;

public class two {
	
	public static void main(String[] args) {
		
		Scanner vl = new Scanner(System.in);
	
		String name, first, last;
		
		System.out.println("Enter(bishop, knight, rook, queen, king, pawn)///A1///A1");
		
		name = vl.nextLine();
		first = vl.nextLine();
		last = vl.nextLine();
		
		System.out.println("Result: " + vlad(name, first, last));
	    
		}
		

                           
	public static Boolean vlad(String n, String f, String l) {
		
		
	  if(n.equals("bishop")) {
				if(Math.abs((int)l.charAt(0) - (int)f.charAt(0)) == Math.abs(f.charAt(1) - l.charAt(1))) {
					return true;
				} else {
					return false;
				}
	} else if(n.equals("knight")) {
		if(Math.abs((int)l.charAt(0) - (int)f.charAt(0)) == 2 && Math.abs(l.charAt(1) - f.charAt(1)) == 1 || Math.abs((int)l.charAt(0) - (int)f.charAt(0)) == 1 && Math.abs(l.charAt(1) - f.charAt(1)) == 2) {
			return true;
		} else {
			return false;
		}
	} else if(n.equals("rook")) {
		if(f.charAt(0) == l.charAt(0) || f.charAt(1) == l.charAt(1)) {
			return true;
		} else {
			return false;
		}
	} else if(n.equals("queen")) {
		if(Math.abs((int)l.charAt(0) - (int)f.charAt(0)) == Math.abs(f.charAt(1) - l.charAt(1)) || f.charAt(0) == l.charAt(0) || f.charAt(1) == l.charAt(1)) {
			return true;
		} else {
			return false;
		}
	} else if(n.equals("king")) {
		if(Math.abs((int)l.charAt(0) - (int)f.charAt(0)) <= 1 && Math.abs(l.charAt(1) - f.charAt(1)) <= 1) {
			return true;
		} else {
			return false;
		}
	} else if(n.equals("pawn")) {
		if((int)l.charAt(0) == (int)f.charAt(0) && Math.abs(l.charAt(1) - f.charAt(1)) == 1) {
			return true;
		} else {
			return false;
		}
	} else {
		System.out.println("ERROR!!!!");
		return false;
	}
}
}
// bishop knight rook queen king pawn    слон конь ладья ферзь король пешка

*/