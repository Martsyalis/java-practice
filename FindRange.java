/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

private static final int SENTINEL=0;

	public void run() {
		
		println ("this program finds a range of numbers entered");
		while (true) {
			int x = readInt ("Enter value:");
			if (x == SENTINEL) {
			println ("No values entered");
				break;
			}
			int big =x ; 
			int small = x;
		
			while (true) {
			int y = readInt ("Enter value:");
			if (y== SENTINEL){
				println ("The biggest value entered is: " + big);
				println ("The smallest value entered is: " + small);
				break;
			}
			
			if (big< y) {
				big = y;
			}
			if (small> y) {
				small= y;
			}
			}
			
		}
	}
		
}



