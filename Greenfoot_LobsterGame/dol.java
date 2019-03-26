import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dol extends Actor
{
    /**
     * Act - do whatever the dol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        if (isAtEdge())
        turn(15);
        {
            if(Greenfoot.getRandomNumber(50)<15);
        }
        turn(5);
        {
            if(isTouching(star.class))
            removeTouching(star.class);
        }
        
        
    
   
    

 }
}
