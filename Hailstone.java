/*
 * File: Hailstone.java
 * --------------------
 * This program is a stub for the Hailstone problem, which computes
 * Hailstone sequence described in Assignment #2.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {

	public void run() {
		int n = 0;
		int i = 0;
		n = getn();
		while (n != 1) {
			n = displayNextOperation(n); // new n is needed to close the while loop when it reaches 1
			i++;
			}
		println("the process took "+ i + " steps to reach 1");
		
	}
	
	private int getn(){
	 int n = readInt ("Enter n: ");
	 return (n);
	}
	
	// prints the line and returns latest n value
	private int displayNextOperation (int n1){
		if (n1 %2 ==1) {
			int n2 = 3 * n1 + 1;
			println (n1+ " is odd, so we make 3n+1 = " + n2);
			return (n2);
		} else {
			int n2 = n1 / 2;
			println (n1+ " is even, so we take half = "+n2 );
			return (n2);
			
		}
	}

}
