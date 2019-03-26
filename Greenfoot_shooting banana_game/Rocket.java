import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mover(); // calling methode 
        Shooter();// calling methode
    }    
    public void mover()
    {
        if(Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-10);
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(),getY()+10);
        }
    }
    public void Shooter()
    {
        World w= getWorld();
        if(Greenfoot.isKeyDown("Space"))
        w.addObject(new Short(),getX() +50,getY());
        
        
    }
}
