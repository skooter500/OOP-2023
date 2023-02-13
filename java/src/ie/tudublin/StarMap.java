package ie.tudublin;

import processing.core.PApplet;

public class StarMap extends PApplet
{
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);

		smooth();
		
	}

		
	public void draw()
	{	
		strokeWeight(2);		
	}
}
