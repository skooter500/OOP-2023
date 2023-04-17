package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public abstract class GameObject  {

    // Class, subclasses or classes in the same package
    protected PVector pos;

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

    public PVector getForward() {
        return forward;
    }

    public void setForward(PVector forward) {
        this.forward = forward;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    protected float rot;
    
    protected PVector forward;
    protected PApplet p;
    protected int c;

    public GameObject(float x, float y, float rot, int c, PApplet p)
    {
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.p = p;
        this.rot = rot;
        this.c = c;
    }

    public abstract void update();
    public abstract void render();

}
