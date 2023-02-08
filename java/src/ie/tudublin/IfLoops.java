package ie.tudublin;

import processing.core.PApplet;

public class IfLoops extends PApplet
{
	float startX = 200;
	float startY = 200;
	float sizeX = 100;
	float sizeY = 100;

	float i = 0;

	public void settings() {
		size(500, 500);
	}

	public void setup()
	{
		colorMode(HSB);
	}

	public void draw()
	{
		background(0);
		noStroke();

		/*
		// Part 1
		rect(startX, startY, sizeX, sizeY); // Default square

		if(mouseX > 200 && mouseX < 300 && mouseY > 200 && mouseY < 300)
		{
			fill(0, 255, 255);
		}
		else
		{
			fill(150, 255, 255);
		}
		*/

		/*
		// Part 2
		for(i = 0; i < 500; i++)
		{
			rect(i * 25, 0, 100, 500);
			fill(i * 10, 255, 255);
		}
		*/

		/*
		// Part 3
		for(i = 0; i < 10; i++)
		{
			rect(i * 50, i * 50, 50, 50);
			fill(i * 25, 255, 255);
		}

		for(i = 0; i < 10; i++)
		{
			rect(i * 50, 450 - (i * 50), 50, 50);
			fill(i * 25, 255, 255);
		}
		*/
	}
}
