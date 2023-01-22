package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet
{

    Player p;
    Player p1;
    Health h;


    public void setup()
    {
        p = new Player(250, 250, 50, this);
        p1 = new Player(50, 50, 100, this);
        h = new Health(50, this);
    }

    public void settings()
    {
        size(500,500);
    }

    public void draw()
    {
        background(0);
        p.update();        
        p.render();
        
        p1.update();
        p1.render();

        h.update();
        h.render();
    }    
}
