import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wombat extends Actor
{
    /**
     * Act - do whatever the wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
        turn();
        remove();
        
    }    
    
    public void move()
    {
        move(5);
    }
    
    void turn()
    {
        if(isAtEdge())
        {
            turn(3);
        }
    }
    
    void remove()
    {
        if(isTouching(leaf.class))
        {
        removeTouching(leaf.class);
        }
    }
}
