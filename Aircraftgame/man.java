import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man extends Actor
{
    /**
     * Act - do whatever the man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // add your action code here 
        mover(); // call to the method
        collectObject(); // call the method
    }    
    
    public void mover() // Define the method
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        if(Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("Down"))
        {
           setLocation(getX(), getY()+4); 
        }
    }
    
    public void collectObject()
    {   World w;
        w = getWorld();
        if(isTouching(ball.class))
        {
            removeTouching(ball.class);
            w.showText("Eaten",50,20);
        }
        
    }
   
}
