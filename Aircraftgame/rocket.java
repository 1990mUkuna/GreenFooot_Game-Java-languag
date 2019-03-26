import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Actor
{
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mover();    // Add your action code here.
        collectObject();
        
    }  
      
    public void mover()
    {
      World w = getWorld();
      move(5);
      
    if(isAtEdge())
    setLocation(41,214 );
    
    }
    public void collectObject()
    
    {
       if(isTouching(man.class))
        {
            removeTouching(man.class);
        }  
    }
}
