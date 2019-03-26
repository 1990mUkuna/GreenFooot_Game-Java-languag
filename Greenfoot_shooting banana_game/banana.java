import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class banana extends Actor
{
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mover();// Add your action code here.
    }
    public void mover()// methode definition
    {
        World w=getWorld();
        move(-3);
        if(isAtEdge())
        {
         //w.removeObject(this);
         setLocation(590,getY());
        }else
       if(isTouching(Rocket.class))
          removeTouching(Rocket.class);
        
    }
}
