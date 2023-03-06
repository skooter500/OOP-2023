package ie.tudublin;

import java.util.ArrayList;

import ddf.minim.AudioBuffer;
// import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import processing.core.PApplet;

public class Audio3 extends PApplet{

    Minim m;
    AudioInput ai;
    AudioPlayer ap;
    AudioBuffer ab;

    FFT fft;
    ArrayList<Cube> cubes = new ArrayList<Cube>();

    public void keyPressed()
    {
        if (key == ' ')
        {
            if (ap.isPlaying())
            {
                ap.pause();
            }
            else
            {
                ap.play();
            }
        
        }
        if (key >= '0' && key <= '9')
        {
            createCubes(key - '0');
        }
    }

    public void settings()
    {
        fullScreen(P3D, SPAN);
        // size(1024, 1024, P3D);
    }

    public void setup()
    {
        m = new Minim(this);
        ap = m.loadFile("tomp3.cc - 08 PsychNerD and Marco G  More Cowbell.mp3", 1024);
        // i = m.getLineIn(Minim.MONO, width, 44100, 16);
        ab = ap.mix;

        lerpedBuffer = new float[width];

        // fft = new FFT(width, 44100);

        createCubes(2);

    }

    public void createCubes(int numCubes)
    {
        cubes.clear();
        float theta = TWO_PI / (float) numCubes;
        for(int i = 0; i < numCubes ; i ++)
        {
            float x = (width / 2) + sin(i * theta) * 300;
            float y = (height / 2) - cos(i * theta) * 300;
            Cube c = new Cube();
            c.x = x;
            c.y = y;
            cubes.add(c);
        } 
    }

    float[] lerpedBuffer;

    float rot = 0;
    float lerpedAverage = 0;

    public void draw()
    {

        float total = 0;
        for (int i = 0 ; i < ab.size() ; i ++)
        {
            total += abs(ab.get(i));
        }
        float average = total / (float) ab.size();

        lerpedAverage = lerp(lerpedAverage, average, 0.1f);
        background(0);
        lights();
        colorMode(HSB);
        
        float c = map(lerpedAverage, 0, 0.5f, 0, 255);        
        rot += map(lerpedAverage, 0, 1.0f, 0, 0.2f);
        float boxSize = map(lerpedAverage, 0, 0.5f, 100, 500);

        for(int i = 0; i < cubes.size() ; i ++)
        {
            Cube cube = cubes.get(i);
            cube.c = c;
            cube.rot = rot;
            cube.size = boxSize;
            cube.render(this);
        }        
    }

    float lerpedY = 0;
    
    float map1(float a, float b, float c, float d, float e)
    {
        float range1 = c - b;
        float range2 = e - d;
        float howFar = a - b;

        return d + (howFar / range1) * range2;
    }
}
