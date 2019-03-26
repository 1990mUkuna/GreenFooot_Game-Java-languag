import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (Mukun Mukuna Freeman) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage FW,img2,img3,img4, BK,img6,img7,img8, LW,img10,img11,img12,img13, RW,img15,img16,img17,img18;
    private int timer;
    public Mario()// Addind constructor to Initializing the variable into the images
    {
        FW = new GreenfootImage("FrontWalk1.png");
        img2 = new GreenfootImage("FrontWalk2.png");
        img3 = new GreenfootImage("FrontWalk3.png");
        img4 = new GreenfootImage("FrontWalk4.png");
        
        BK = new GreenfootImage("BackWalk1.png");
        img6 = new GreenfootImage("BackWalk2.png");
        img7 = new GreenfootImage("BackWalk3.png");
        img8 = new GreenfootImage("BackWalk4.png");
        
        LW  = new GreenfootImage("LeftWalk1.png");
        img10 = new GreenfootImage("LeftWalk2.png");
        img11 = new GreenfootImage("LeftWalk3.png");
        img12 = new GreenfootImage("LeftWalk4.png");
        img13 = new GreenfootImage("LeftWalk5.png");
        
        RW = new GreenfootImage("RightWalk1.png");
        img15 = new GreenfootImage("RightWalk2.png");
        img16 = new GreenfootImage("RightWalk3.png");
        img17 = new GreenfootImage("RightWalk4.png");
        img18 = new GreenfootImage("RightWalk5.png");
        
        setImage(FW); 
        timer = 0;
    }   
    public void act() 
    {
        // Add your action code here.
        mover();
        
        
        
    } 
    
    public void mover()
    {
        //int delay = 10;
       // timer++;
       //&& timer%delay == 0
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() -1, getY());
            
            if ((getImage() == FW ) || (getImage() == LW ))
            {
                setImage(img10);
            }
            else if ( getImage() == img10)
            {
                setImage(img11);
            }
            else if (getImage() == img11)
            {
                setImage(img12);
            }
            else if (getImage() == img12)
             {setImage(img13);
             }
             else if (getImage() == img13)
             {
                setImage(LW);
             }
            
            
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() +1,getY());
            
            if ((getImage() == FW) || (getImage() == RW))
            {
                setImage(img15);
            }
            else if ( getImage() == img15)
            {
                setImage(img16);
            }
            else if (getImage() == img16)
            {
                setImage(img17);
            }
            else if (getImage() == img17)
             {
                setImage(img18);
             }
            else if (getImage() == img18)
               {
                setImage(RW);
               }
        }
        
       
        else if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY() -2);
            
            if ((getImage() == FW) || (getImage() == BK))
            {
                setImage(img6);
            }
            else if ( getImage() == img6)
            {
                setImage(img7);
            }
            else if (getImage() == img7)
            {
                setImage(img8);
            }
            else if (getImage() == img8)
             {
                setImage(BK);
             }
            
        }
         else if(Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(), getY() +2);
            
            if ((getImage() == FW ) || (getImage() == FW))
            {
                setImage(img2);
            }
            else if ( getImage() == img2)
            {
                setImage(img3);
            }
            else if (getImage() == img3)
            {
                setImage(img4);
            }
            else if (getImage() == img8)
             {
                setImage(FW);
             }
            
        }
    }
    
    
   
}
