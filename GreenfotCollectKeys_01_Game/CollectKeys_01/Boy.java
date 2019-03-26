import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boy here.
 * 
 * Full Name Mukuna Mukuna Junior
 * Student N* 217082831
 * @version 20/05/2017
 */
public class Boy extends Actor
{
    /**
     * Act - do whatever the Boy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mover();
        lookForKeys();
        
      
    }    
    
    public void mover()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
         if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
         if(Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(),getY()+3);
        }
         if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-3);
        }
        if(isTouching(BrickWall.class))
        {
            Greenfoot.playSound("spring.wav");
            setLocation(153,375);
        }
        
        
    }
    
    public void lookForKeys()
    {
        if(isTouching(Key.class))
        {
            removeTouching(Key.class);
        }
    }
}
