    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beetle here.
 * 
 * @author 1A Mukuna Mukuna Junior Student Number:217082831
 * @version (a version number or a date)
 */
public class Beetle extends Actor
{
    /**
     * Act - do whatever the Beetle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moveBeetle();
        lookForFood();
    }    
    
    public void moveBeetle()
    {if(Greenfoot.isKeyDown("lEFT"))
        turn(-5);
        if(Greenfoot.isKeyDown("right"))
        turn(5);
        if(Greenfoot.isKeyDown("space"))
        move(3);
        
    }
    
    public void lookForFood()
    {
        if(isTouching(Food.class))
        removeTouching(Food.class);
    }
}
