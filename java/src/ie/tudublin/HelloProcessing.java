package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		background(255,0,0);	
	}
	
	public void draw()
	{	
		fill(255,255,0); // Bright Yellow
		circle(250, 250, 450);

		fill(0,204,204); // Light Blue
		triangle(25,450,250,10,475,450);

		fill(255,255,255); // White
		ellipse(250, 250, 210, 105);

		fill(0,0,0); // Black
		circle(250, 250, 80);


	}
}
