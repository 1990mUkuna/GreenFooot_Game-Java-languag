import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pizza_cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pizza_cheese extends Actor
{
    /**
     * Act - do whatever the pizza_cheese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
       mover(); //action method
    }    
    public void mover()
    
    {
        move(-5);
        World w = getWorld();
        if(isAtEdge())
        {
        //if(isAtEdge())
        //w.removeObject(this);
        //if(isAtEdge())
        //setLocation(600,getY());
        setLocation(590,getY());}
        // methode definition
    }
}
