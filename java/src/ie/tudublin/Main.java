package ie.tudublin;

public class Main
{

	public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

	public static void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }

	public static void ifLoops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new IfLoops());
    }
	
	public static void main(String[] args)
	{
		ifLoops();
	}
	
}