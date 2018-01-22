/*
 * File: Pyramid.java
 * ------------------
 * this Program took so much time I feel i have to marry it...
 */

import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {

	
	private static final int BRICKS_IN_BASE = 12; 
	private static final int PAUSE_TIME=20;
	
	
	public void run() {
		
		 pause (150 * PAUSE_TIME);
		 
	int BRICK_WIDTH = getWidth()/BRICKS_IN_BASE;
    int BRICK_HEIGHT = (getHeight()-5)/BRICKS_IN_BASE;
    
	
	double startPointY= (double) getHeight()-BRICK_HEIGHT-1;
		
		for (int i=0; i<BRICKS_IN_BASE; i++ ) {
			int bricksInRow = BRICKS_IN_BASE - i;
			double y = startPointY - (i * BRICK_HEIGHT);
			for (int j=0; j<bricksInRow; j++) {
				double x = j * BRICK_WIDTH + ( (double) getWidth() / 2 ) - (BRICK_WIDTH *bricksInRow /2);
				GRect brick= new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT) ;
				add (brick);
			    pause (PAUSE_TIME);
			
			
			}
		}
	}

	
}
