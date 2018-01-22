

import acm.program.*;
import acm.graphics.*;

public class circlemethod extends GraphicsProgram {
	
	public void run(){
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		add(drawCircle (x, y, 200 ));
	}
	
	
	
	
	private GOval drawCircle (int x, int y, int r) {
		GOval circle = new GOval (x-r, y-r, r * 2, r * 2);
		return (circle);
	}
}
