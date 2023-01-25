package ie.tudublin;

public class Cat {

    String name;
    private int numLives;  

    public void setName(String name)
    {
        this.name = name;
    }

    public Cat()
    {

    }

    public Cat(String name)
    {
        this.numLives = 9;
    }

    public void speak()
    {
        System.out.println("Meow!");
    }

    
    

    public int getLives() {  
        return numLives;  
    }  


    public void numLives(int numLives)
	{
		this.numLives = numLives;
	}



    public void kill() {

        if(numLives > 0)
        {
            System.out.println("Ouch!");
            numLives -=1;
        }
        else
        {
            System.out.println("Dead!");
        }

        
     
    }
}