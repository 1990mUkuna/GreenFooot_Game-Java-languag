import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Girl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Girl extends Actor
{
    /**
     * Act - do whatever the Girl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         moveGirl();   //method call
       lookForFlowers();//method call
    }    
    public void moveGirl()
    {
         //if the left arrow key is pressed
            //move the Girl 6 units backwards
         //if the right arrow key is pressed
            //move the Girl 6 units forwards
         //if the up arrow key is pressed
            //move the Girl 6 units upwards 
         //if the down arrow key is pressed
            //move the Girl 6 units upwards 
          if(Greenfoot.isKeyDown("left"))
          {
              move(-6);
          }
          if(Greenfoot.isKeyDown("right"))
          {
              move(+6);
          }
          if(Greenfoot.isKeyDown("up"))
          {
              setLocation(getX(), getY()-6);
          }
          if(Greenfoot.isKeyDown("Down"))
          {
              setLocation(getX(), getY()+6);
          }
    }
    public void lookForFlowers()
    {
          if(isTouching(Flowers.class))
          removeTouching(Flowers.class);//if the Girl touches a Flower
            //remove the Flower
    }
}
