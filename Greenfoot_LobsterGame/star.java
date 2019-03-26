import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class star extends Actor
{
    /**
     * Act - do whatever the star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isAtEdge())
        {
            turn(15);
        }
        if (Greenfoot.getRandomNumber(50)<15)
        {
            turn(5);
        }
        move(4);
        {
            if(isTouching(lobster.class))
            removeTouching(lobster.class);
        }
    } 
   }
