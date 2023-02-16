package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
	ArrayList<Star> stars = new ArrayList<Star>();

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		
		smooth();

		loadStars();
		printStars();
	}

	void printStars()
	{
		for(int i = 0 ; i < stars.size() ; i ++)
		{
			println(stars.get(i));
		}
	}

	void displayStars()
	{
		for(int i = 0 ; i < stars.size() ; i ++)
		{
			stars.get(i).render(this);
		}
	}

	public void loadStars()
	{
		Table table = loadTable("HabHYG15ly.csv", "header");
 		for(TableRow r:table.rows())
 		{
 			Star s = new Star(r);
 			stars.add(s);
 		}
	}

	public void drawGrid()
	{
		stroke(0, 255, 255);
		float border = width * 0.1f;

		for(int i = -5 ; i <= 5 ; i ++)
		{
			float x = map(i, -5, 5, border, width - border);
			line(x, border, x, height - border);
			line(border, x, width - border, x);

			textAlign(CENTER, CENTER);
			text(i, x, border * 0.5f);
			text(i, border * 0.5f, x);
		}

		//float f = map(5, 0, 10, 100, 200);
		//float f1 = map1(5, 0, 10, 100, 200);
		
	}

	float map1(float a, float b, float c, float d, float e)
	{
		float r1 = c -b;
		float r2 = e - d;

		float howFar = a - b;

		return d + ((howFar / r1) * r2);
	}
		
	public void draw()
	{	
		strokeWeight(1);		

		drawGrid();
		displayStars();
	}
}
