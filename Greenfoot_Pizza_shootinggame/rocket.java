import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Actor
{
    /*
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mover();// add method
        beeper();// add method
        
    }    
    public void mover() // methode definition 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-10);
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(),getY()+10);
        }
       
        
    }
    public void beeper() // methode definition 
    {
        World w = getWorld();
        if(Greenfoot.isKeyDown("A"))
        w.addObject(new beeper (), getX()+27, getY());
        
        
    }        
    
    
    
}
