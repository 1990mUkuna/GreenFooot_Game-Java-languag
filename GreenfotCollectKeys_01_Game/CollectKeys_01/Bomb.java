import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * Full Name Mukuna Mukuna Junior
 * Student N* 217082831
 * @version 20/05/2017
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //if the bomb is touching the boy
           //play the bank sound
           //remove the boy
           //stop the game
        Touching();
    }    
    public void Touching ()
    {
        if(isTouching(Boy.class))
        {
            removeTouching(Boy.class);
            Greenfoot.playSound("bang.wav");
            Greenfoot.stop();
        }
        
    }
}
