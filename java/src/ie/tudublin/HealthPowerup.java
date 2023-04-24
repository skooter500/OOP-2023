package ie.tudublin;

import processing.core.PVector;

public class HealthPowerup extends GameObject implements PowerUp{

    float w;
    float halfW;
    public HealthPowerup(float x, float y, float r, int c, YASC p)
    {
        super(x, y, r, c, p);
        w = 50;
        halfW = w / 2;
        forward.x = p.random(-1, 1);
        forward.y = p.random(-1, 1);
        forward.normalize();
        
    }

    @Override
    public void applyTo(Ship s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'applyTo'");
    }

    float speed = 1;

    @Override
    public void update() {
        rot += 0.01f;
        pos.add(PVector.mult(forward, speed));    

        if (pos.x < 0)
        {
            pos.x = p.width;
        }
        if (pos.y < 0)
        {
            pos.y = p.height;
        }
        if (pos.x > p.width)
        {
            pos.x = 0;
        }

        if (pos.y > p.height)
        {
            pos.y = 0;
        }
    }

    @Override
    public void render() {
        p.pushMatrix();
        p.noFill();
        p.stroke(255);
        p.translate(pos.x, pos.y);
        p.rotate(rot);
        p.rect(-halfW, -halfW, w, w);
        p.line(0, -20, 0, 20);
        p.line(-20, 0, 20, 0);
        p.popMatrix();
    }

    
}
