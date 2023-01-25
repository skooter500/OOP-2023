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
		System.out.println("-- Dog executing -- \n");
		Dog penny = new Dog();
		penny.setName("Penny");
		penny.speak();

		System.out.println("-- Cat executing -- \n");
		Cat ginger = new Cat("Ginger");
		for(int i = 0; i<9; i++){
			ginger.kill();
		}


		helloProcessing();

	}
	
}