package ie.tudublin;

public class Main
{

	public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }
	
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		Dog penny = new Dog();
		penny.setName("Penny");
		penny.speak();


		Cat ginger = new Cat();
		ginger.setName("Gucci");
		ginger.speak();
		while(ginger.getLives()>0)
		{
			ginger.kill();
		}
	}
	
}