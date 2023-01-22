package ie.tudublin;

public class Health
{
    float x, y;
    float fx, fy;
    float w;
    float halfW;

    YASC yasc;

    float rotation;

    public Health(float w, YASC yasc)
    {

        this.x = -50;
        this.y = yasc.random(yasc.height);
        this.w = w;
        this.fx = 1;
        this.fy = yasc.random(-1, 1);
        halfW = w / 2.0f;
        this.yasc = yasc;
        this.rotation = 0;
    }

    public void render()
    {
        yasc.pushMatrix();
        yasc.translate(x, y);
        yasc.rotate(rotation);
        yasc.stroke(255);
        yasc.noFill();
        yasc.rectMode(YASC.CENTER);
        yasc.rect(0, 0, w, w);
        yasc.popMatrix();
    }

    public void update()
    {
        x += fx;
        y += fy;
        rotation += 0.01f;
        if (x > yasc.width + w)
        {
            x = -w;
        } 

        if (x < -w)
        {
            x = yasc.width + w;;
        } 

        if (y < -w)
        {
            y = yasc.height + w;
        }
        if (y > yasc.height + w)
        {
            y = -w;
        }
    }

}