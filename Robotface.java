import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
public class Robotface extends GraphicsProgram {

	private static final int HEAD_WIDTH=200;
	private static final int HEAD_HEIGHT=300;
	private static final int EYE_RADIUS= 18;
	private static final int MOUTH_WIDTH= 100;
	private static final int MOUTH_HEIGHT= 35;
	
	
	public void run(){
		int headX= getWidth() / 2-HEAD_WIDTH/2;
		int headY=getHeight()/2 - HEAD_HEIGHT/2;
		
		GRect head= new GRect(headX, headY, HEAD_WIDTH, HEAD_HEIGHT);
		head.setColor(Color.BLACK);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
		
		int eyeX1=headX + HEAD_WIDTH/4;
		int eyeY1=headY + HEAD_HEIGHT/4;
		int eyeX2=eyeX1 +HEAD_WIDTH/2;
		int eyeY2= eyeY1;
		add(drawCircle (eyeX1, eyeY1, EYE_RADIUS ));
		add(drawCircle (eyeX2, eyeY2, EYE_RADIUS));
	
	int mouthX=getWidth()/2-MOUTH_WIDTH/2;
	int mouthY= headY + 3*HEAD_HEIGHT/4;
	GRect mouth= new GRect(mouthX,mouthY, MOUTH_WIDTH, MOUTH_HEIGHT);
	mouth.setFilled(true);
	mouth.setFillColor(Color.WHITE);
	mouth.setColor(Color.WHITE);
	add(mouth);
	}
	
	private GOval drawCircle (int x, int y, int r) {
		GOval circle = new GOval (x-r, y-r, r * 2, r * 2);
		circle.setFilled(true);
		circle.setFillColor(Color.YELLOW);
		return (circle);
	}
}
