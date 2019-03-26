import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class beeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class beeper extends Actor
{
    /**
     * Act - do whatever the beeper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("Space"));
        move(4);
        // Add your action code here.
        if(isTouching(pizza_cheese.class))
        removeTouching(pizza_cheese.class);
    }    
}
