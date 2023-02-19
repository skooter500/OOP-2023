package ie.tudublin;

import processing.data.Table;
import processing.data.TableRow;
import processing.core.PApplet;

import java.io. * ;
import java.util.Scanner;

public class StarMap extends PApplet {
    public void settings()
	{
		size(800, 800);
	}

	public void setup()
	{
		float x1 = 100, y1 = 200;
		float x2 = 300, y2 = 150;
		line(x1, y1, x2, y2);
	}

    

    // void loadStars()
 	// {
 	// 	Table table = loadTable("HabHYG15ly.csv", "header");
 	// 	for(TableRow r:table.rows())
 	// 	{
 	// 		// Star s = new Star(r);
 	// 		// stars.add(s);
 	// 	}
 	// } 

}



