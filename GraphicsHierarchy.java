/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.program.*;
import acm.graphics.*;

public class GraphicsHierarchy extends GraphicsProgram {
	
private static final int CLASS_BOX_WIDTH = 120;
private static final int CLASS_BOX_HEIGHT = 40;
private static final int PAUSE_TIME = 4000; 
	
	public void run() {
					
		pause (PAUSE_TIME);
		
		// creates the top box with "GObject" label
		int classBoxX = getWidth()/2-CLASS_BOX_WIDTH/2;
		int classBoxY = getHeight()/2 - 3 * CLASS_BOX_HEIGHT;		
		GRect classBox = new GRect (classBoxX, classBoxY, CLASS_BOX_WIDTH, CLASS_BOX_HEIGHT);
		add (classBox);
		
		GLabel classBoxLabel= new GLabel ("GObject" ) ; 
		classBoxLabel.setFont("SERIF-BOLD-15");
		double classBoxLabelX = classBoxX + CLASS_BOX_WIDTH/2 - classBoxLabel.getWidth()/2 ; 
		double classBoxLabelY = classBoxY + CLASS_BOX_HEIGHT/2 + classBoxLabel.getHeight()/2;
		add (classBoxLabel, classBoxLabelX, classBoxLabelY);
		
		// creates 4 other boxes and labels. adds lines connecting the bottom center of top box
		// with upper centers of lower  boxes. 
		for (int i=0; i<4;i++){
			
			double subClassBoxX = getWidth ()/2- ((4.4 * CLASS_BOX_WIDTH)/2) + i * 1.1 * CLASS_BOX_WIDTH;
			int subClassBoxY = classBoxY + 4 * CLASS_BOX_HEIGHT;
			GRect subClassBox = new GRect (subClassBoxX, subClassBoxY, CLASS_BOX_WIDTH, CLASS_BOX_HEIGHT);
			add (subClassBox);
			
			GLabel subClassBoxLabel= new GLabel ("GLabel" ) ; 
			subClassBoxLabel.setFont("SERIF-BOLD-15");
			
			switch (i) {
			case 0:
				subClassBoxLabel.setLabel("GLabel");
				break;
			case 1:
				subClassBoxLabel.setLabel("GLine");
				break;
			case 2:
				subClassBoxLabel.setLabel("GOval");
				break;
			case 3:
				subClassBoxLabel.setLabel("GRect");
				break;
			}
			double subClassBoxLabelX = subClassBoxX + CLASS_BOX_WIDTH/2 - subClassBoxLabel.getWidth()/2;
			double subClassBoxLabelY = subClassBoxY + CLASS_BOX_HEIGHT/2 + subClassBoxLabel.getHeight()/2;
			
			add (subClassBoxLabel, subClassBoxLabelX, subClassBoxLabelY);
			
			double lineX1 = classBoxX+ CLASS_BOX_WIDTH /2 ; 
			double lineY1 = classBoxY + CLASS_BOX_HEIGHT;
			double lineX2 = subClassBoxX + CLASS_BOX_WIDTH/2;
			double lineY2 =  subClassBoxY;
		
			GLine line = new GLine ( lineX1, lineY1, lineX2, lineY2 );
			add (line);
			
			
			
		}
		
		
	
	}

}
