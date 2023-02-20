package ie.tudublin;

;
import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio1 extends PApplet
{

    Minim minim;
    AudioInput ai;
    AudioPlayer ap;
    AudioBuffer ab;

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
		
	}
}
