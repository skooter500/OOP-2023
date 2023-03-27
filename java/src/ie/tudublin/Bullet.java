package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Bullet {
    PVector pos;
    float rot;
    float speed;
    PVector forward;
    PApplet p;
    int c;

    public Bullet(float x, float y, float rot, int c, PApplet p)
    {
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        speed = 5;
        this.p = p;
        this.rot = rot;
        this.c = c;
        

    }

    void render()
    {
        p.pushMatrix();
        p.stroke(c, 255, 255);
        p.translate(pos.x, pos.y);
        p.rotate(rot);
        p.line(0, -5, 0, 5);
        p.popMatrix();
    }

    void move()
    {
        forward.x = PApplet.sin(rot);
        forward.y = - PApplet.cos(rot);

        pos.add(PVector.mult(forward, speed));

        if (pos.x < 0 || pos.x > p.width || pos.y < 0 || pos.y > p.height)
        {
            ((YASC)p).bullets.remove(this);
        }


    }



}
