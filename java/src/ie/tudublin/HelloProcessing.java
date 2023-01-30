package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{
	int screenSize = 500;
	
	public void settings(){
		size(500, 500);
	}

	public void setup() {
		background(255, 0, 0);
		
		
	}
	
	public void draw(){	
		noStroke();
		fill(255, 255, 0);
		circle(screenSize/2, screenSize/2, screenSize/100*90);
		fill(0, 255, 255);
		triangle(0, 400, screenSize, 400, 255, 0);
		fill(255, 255, 255);
		ellipse(screenSize/2, screenSize/2, 300, 100);
		fill(1, 1, 1);
		circle(screenSize/2, screenSize/2, screenSize/100*25);
		fill(mouseX, mouseY, mouseY);

		circle(mouseX, mouseY, 50);


		// stroke(255);
		// fill(0, 255, 255);s
		// line(10, 10, 100, 100); //x1, y1, x2, y2
		// circle(100, 250, 70); //cx, cy, d
		// fill(255, 255, 0);
		// rect(10, 300, 10, 100); //tlx, tly, w, h
		// fill(0, 0, 255);
		// noStroke();
		// noFill();
		// strokeWeight(15);
		// triangle(40, 90, 300, 20, 90, 70);
		// stroke(127);
	}
}
