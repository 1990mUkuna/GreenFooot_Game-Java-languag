import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flowers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flowers extends Actor
{
    /**
     * Act - do whatever the Flowers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();// Add your action code here.
    }
    public void move()
    {
        move(4);
        if(isAtEdge())
        {
           setLocation(5, Greenfoot.getRandomNumber(395));
        }
    }
}
