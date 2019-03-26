import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * Full Name Mukuna Mukuna Junior
 * Student N* 217082831
 * @version 20/05/2017
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
        move();
        Touching();
    }    
    public void move()
    {
        if(isAtEdge())
        {
            turn(90);
        }
        move(4);
    }
    public void Touching()
    {
        if(isTouching(Boy.class))
        {
            removeTouching(Boy.class);
            Greenfoot.playSound("bang.wav");
            Greenfoot.stop();
        }
    
    
    
    }
}
