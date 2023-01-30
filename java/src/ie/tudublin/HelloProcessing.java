package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings(){
		size(500, 500);
	}

	public void setup() {
		//colorMode(HSB);
		background(0);
		
		
	}
	
	public void draw(){	
		stroke(255);
		fill(0, 255, 255);
		line(10, 10, 100, 100); //x1, y1, x2, y2
		circle(100, 250, 70); //cx, cy, d
		fill(255, 255, 0);
		rect(10, 300, 10, 100); //tlx, tly, w, h
		fill(0, 0, 255);
		noStroke();
		noFill();
		strokeWeight(15);
		triangle(40, 90, 300, 20, 90, 70);
		stroke(127);
	}
}
