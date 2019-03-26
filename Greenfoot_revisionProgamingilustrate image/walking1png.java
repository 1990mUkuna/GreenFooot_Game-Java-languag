import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class walking1png here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class walking1png extends Actor
{
    /**
     * Act - do whatever the walking1png wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // declaring the image variable
    private GreenfootImage img1, img2, img3, img4, img5;
    private int timer;
    
    public  walking1png()
    { // assiged the image into the variable  their also constructore
      img1 = new GreenfootImage("walking1.png");
      img2 = new GreenfootImage("walking2.png");
      img3 = new GreenfootImage("walking3.png");
      img4 = new GreenfootImage("walking4.png");
      img5 = new GreenfootImage("walking5.png");
      
      setImage(img1);
      timer = 0;
      
    }
    public void act() 
    {
        // Add your action code here.
        move();
       
    }    
    void move()
    {
        move(1);
        int delay = 10;
        timer++;
        if(getImage() == img1 && timer%delay == 0)
        setImage(img2);
        else if (getImage() == img2 && timer%delay == 0)
        setImage(img3);
        else if (getImage() == img3 && timer%delay == 0)
        setImage(img4);
        else if (getImage() == img4 && timer%delay == 0)
        setImage(img5);
        else if (getImage() == img5 && timer%delay == 0)
        setImage(img1);
        
        if(isAtEdge())
        {
            turn(90);
        }
        
        
        
        
    }
}
