import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grab extends Actor
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       // Add your action code here.
       // move by 4 units
       //if touching the edge
           //turn by 90 degrees
      
       //if touching the Boy
         //play bang sound
         //remove the Boy actor
         //stop the game
        move(4);
        if(isAtEdge())
        {
            turn(90);
        }
        if(isTouching(Boy.class))
        removeTouching(Boy.class);
    }    
}
