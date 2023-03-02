package ie.tudublin;

import processing.core.PApplet;

public class Cube {
    public float x, y;
    public float size;
    public float c;
    public float rot;

    public void render(PApplet p)
    {
        p.stroke(c, 255, 255);
        p.strokeWeight(5);

        p.noFill();
        p.pushMatrix();
        p.translate(x, y);
        
        p.rotateY(rot);
        p.rotateX(rot);

        
        p.box(size);
        p.popMatrix();

    }

}
