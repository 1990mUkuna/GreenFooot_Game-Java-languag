import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ant extends Actor
{
    /**
     * Act - do whatever the ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        if(isAtEdge())
        turn(4);
        if(Greenfoot.getRandomNumber(35) < 34)
        turn(10);
        if(Greenfoot.getRandomNumber(20)<5)
        turn(-15);
    }    
}
