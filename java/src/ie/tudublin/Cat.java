package ie.tudublin;

public class Cat
{
    private int numLives;
    String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
        this.numLives = 9;
    }

    void  kill(){
        if(numLives >0 ){
            this.numLives--;
        }
        if(numLives > 0){
            System.out.println("Ouch");
        } else {
            System.out.println("Dead");
        }
    }
}

