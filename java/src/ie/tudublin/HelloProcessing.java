package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		//colorMode(HSB);
		background(0);

		

		smooth();
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		//stroke(255);
		//line(10,10,100,100); // x1,y1,x2,y2
		//circle (300,250,70); // cx,cy,diam
		//fill(0,255,0);
		//rect(10,300,10,100); // top leftx , top left y , width , height 
		//stroke(127);
		//noStroke();
		//noFill();
		// fill(0,0,255);
		//triangle (30,90,300,20,80,70);
		//fill(0,0,255); 
		
		// making wierd thing
		fill(255,0,0);
		rect(0,0,900,900); // top leftx , top left y , width , height 
		fill(255,255,0);
		circle (250,300,450); // cx,cy,diam
		fill(0,250,255);
		triangle (30,450,470,450,250,0); // p1x,p1y,p2x,p2y,p3x,p3y
		fill(255,255,255);
		ellipse(250,230,180,110); // ex,ey,p1y,p2y
		fill(0,0,0);
		circle (250,230,80); // cx,cy,diam












	}
}
