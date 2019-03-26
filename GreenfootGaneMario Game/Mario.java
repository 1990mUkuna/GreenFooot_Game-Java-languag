import greenfoot.*; 

/**
* Write a description of class Mario here.
* This Mario Game is a test of controling the keyboard and representing the Mario face in a difference derection 
* 
*
* @author MUKUNA MUKUNA JUNIOR
* @ Date 14.08.2017
*/

public class Mario extends Actor
{
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1,img2,img3,img4;
    
    public Mario()
    {
        img1 = new GreenfootImage("FrontWalk1.png");
        img2 = new GreenfootImage("BackWalk1.png");
        img3 = new GreenfootImage("LeftWalk1.png");
        img4 = new GreenfootImage("RightWalk1.png");
        setImage(img1);
        
   }
    
    public void act() 
    {
        // Add your action code here.
        mover();
    }
    public void mover()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setImage(img3);
            move(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setImage(img4);
            move(4);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setImage(img2);
            setLocation(getX(),getY()-4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setImage(img1);
            setLocation(getX(),getY()+4);
        }
    }
}
