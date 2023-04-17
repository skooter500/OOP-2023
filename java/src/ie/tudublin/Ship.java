package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Ship {
    private PVector pos;
    private PVector forward;
    private PApplet p;

    public Ship(float x, float y, float size, int c, PApplet p)
    {
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.size = size;
        this.halfSize = size / 2;
        this.c = c;       
        this.p = p;  
    }



    public PVector getPos() {
        return pos;
    }
    public void setPos(PVector pos) {
        this.pos = pos;
    }
    public float getRot() {
        return rot;
    }
    public void setRot(float rot) {
        this.rot = rot;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    private float rot;
    private int c;
    private float size;
    private float halfSize;

    int fireRate = 5;

    int toPass = 1000 / fireRate;
    int ellapsed = 1000;

    public void move()
    {
        forward.x = PApplet.sin(rot);
        forward.y = - PApplet.cos(rot);

        YASC yasc= ((YASC)p);
        

        if (yasc.keys[PApplet.LEFT])
        {
            rot -= 0.1f;
        }

        if (yasc.keys[PApplet.RIGHT])
        {
            rot += 0.1f;
        }

        if (yasc.keys[PApplet.UP])
        {
            pos.x += forward.x;
            pos.y += forward.y;
        }

        if (yasc.keys[PApplet.DOWN])
        {
            pos.x -= forward.x;
            pos.y -= forward.y;
        }
        if (yasc.keys[' '] && ellapsed >= toPass)
        {
            ellapsed = 0;
            PVector inFront = PVector.add(pos,
                PVector.mult(forward, 30)
                );  
            
            Bullet b = new Bullet(inFront.x, inFront.y, rot, c, p);

            ((YASC)p).bullets.add(b);
        }
        int now = p.millis();
        timeDelta = now - last;
        ellapsed += timeDelta;
        last = now;

    }
    int last = 0;
    int timeDelta;

    public void render()
    {
        p.pushMatrix();
        p.translate(pos.x, pos.y);
        p.rotate(rot);
        p.stroke(c, 255, 255);
        p.line(- halfSize, halfSize, 0, - halfSize);
        p.line(0, - halfSize, halfSize, + halfSize);
        p.line(halfSize, halfSize, 0, 0);
        p.line(0, 0, -halfSize, halfSize);
        p.popMatrix();
    }

    
    
}
