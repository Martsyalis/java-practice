/*
 * File: Rainbow.java
 * ------------------
 * This program Creates a rainbow centered on the screen by drawing and clipping 7 Ovals
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Rainbow extends GraphicsProgram {

	public void run() {
	
	
	pause (150* PAUSE_TIME);

	GRect bees= new GRect (1,1,getWidth(), getHeight());
	bees.setFilled(true);
	bees.setFillColor(Color.CYAN);
	
	add (bees);

	
	double circleWidth0 = getWidth() * 1.5;
	double circleHeight0= getHeight() * 1.8;
	double startPointY0 = getHeight() / 10;
	double startPointX0= (double) getWidth()/2- circleWidth0/2;
	
	
	
		for (int i= 0; i<7; i++){
			double dr= (getHeight() / 10 * i) / 2 ;
			double circleWidth= circleWidth0 - 2 * dr;
			double circleHeight= circleHeight0 - 2 * dr;
			double startPointX =startPointX0 + dr;
			double startPointY =startPointY0 + dr;
			GOval bow= new GOval (startPointX,startPointY, circleWidth, circleHeight);
			bow.setFilled(true);
			switch (i) {
			case 0: bow.setColor(Color.RED);
			break;
			case 1: bow.setColor(Color.ORANGE);
			break;
			case 2: bow.setColor(Color.YELLOW);
			break;
			case 3: bow.setColor(Color.GREEN);
			break;
			case 4: bow.setColor(Color.BLUE);
			break;
			case 5: bow.setColor(Color.MAGENTA);
			break;
			case 6: bow.setColor(Color.CYAN);
			break;
			default: bow.setColor(Color.BLACK);
			}
			add (bow);
		}
		
//	
//	double yCord = 1000
//	double xCord= (double) getWidth()/2- arcWidth/2;  
//	GOval redArc= new GOval(xCord,yCord, arcWidth,100 );
//	add (redArc) ;
//	
	}

	private static final int PAUSE_TIME=20;

}
	
