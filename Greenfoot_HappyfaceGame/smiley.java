import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class smiley here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class smiley extends Actor
{
    /**
     * Act - do whatever the smiley wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();// Add your action code here.
    }    
    public void move()
    {
        move(3);
        if(isAtEdge())
        {
           setLocation(5, Greenfoot.getRandomNumber(395));
        }
    }
    
}
