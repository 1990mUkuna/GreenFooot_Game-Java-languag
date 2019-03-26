import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author 1A Mukuna Mukuna Junior Student Number:217082831 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    /**
     * Act - do whatever the Shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moveShot();
        lookForBeetle();
               
    }
    public void moveShot()
    {
       move(2);
       if(Greenfoot.getRandomNumber(100)<20)
       turn(20);
      
       
       
           
        
        
    }
    
    public void lookForBeetle()
    {
        if(isTouching(Beetle.class))
        Greenfoot.stop();
        removeTouching(Beetle.class);
        System.out.print("Game Over");
        
        
        
        
    }
    
}
