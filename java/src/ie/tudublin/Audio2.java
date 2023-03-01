package ie.tudublin;

import ddf.minim.AudioBuffer;
// import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import processing.core.PApplet;

public class Audio2 extends PApplet{

    Minim m;
    AudioInput ai;
    AudioPlayer ap;
    AudioBuffer ab;

    FFT fft;

    public void settings()
    {
        size(1024, 1024);
    }

    public void setup()
    {
        m = new Minim(this);
        ai = m.getLineIn(Minim.MONO, width, 44100, 16);
        ab = ai.mix;
        lerpedBuffer = new float[width];

        fft = new FFT(width, 44100);
    }
    public String PitchSpeller(float frequency) //Yup
    {
        float[] frequencies = {293.66f, 329.63f, 369.99f, 392.00f, 440.00f, 493.88f, 554.37f, 587.33f, 659.25f, 739.99f, 783.99f, 880.00f, 987.77f, 1108.73f, 1174.66f};
	    String[] spellings = {"D,", "E,", "F,", "G,", "A,", "B,", "C", "D", "E", "F", "G", "A", "B","c", "d", "e", "f", "g", "a", "b", "c'", "d'", "e'", "f'", "g'", "a'", "b'", "c''", "d''"};
    } // PitchSpeller

    float[] lerpedBuffer;
    public void draw()
    {
        background(0);
        colorMode(HSB);
        stroke(255);
        float half = height / 2;
        for(int i = 0 ; i < ab.size() ; i ++)
        {
            stroke(map(i, 0, ab.size(), 0, 255), 255, 255);
            lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.05f);
            float f = abs(lerpedBuffer[i] * half * 2.0f);
            line(i, half + f, i, half - f);
        }

        fft.forward(ab);
        stroke(255);

        int highestIndex = 0;
        for(int i = 0 ;i < fft.specSize() / 2 ; i ++)
        {
            line(i * 2.0f, height, i * 2.0f, height - fft.getBand(i) * 5.0f);

            if (fft.getBand(i) > fft.getBand(highestIndex))
            {
                highestIndex = i;
            }
        }

        float freq = fft.indexToFreq(highestIndex);
        fill(255);
        textSize(20);
        text("Freq: " + freq, 100, 100);

        float y = map(freq, 1000.0f, 2500.0f, height, 0);
        lerpedY = lerp(lerpedY, y, 0.1f);
        circle(200, y, 50);
        circle(300, lerpedY, 50);
        



        //println(map(5, 2, 10, 1000, 2000));
        //println(map1(5, 2, 10, 1000, 2000));
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
