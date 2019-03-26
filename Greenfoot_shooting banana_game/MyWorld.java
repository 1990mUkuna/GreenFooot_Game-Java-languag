import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        banana banana = new banana();
        addObject(banana,553,50);
        banana banana2 = new banana();
        addObject(banana2,557,65);
        banana banana3 = new banana();
        addObject(banana3,552,145);
        banana banana4 = new banana();
        addObject(banana4,559,276);
        banana banana5 = new banana();
        addObject(banana5,540,385);
        banana banana6 = new banana();
        addObject(banana6,500,153);
        banana banana7 = new banana();
        addObject(banana7,480,252);
        banana banana8 = new banana();
        addObject(banana8,494,339);
        banana banana9 = new banana();
        addObject(banana9,450,104);
        Rocket rocket = new Rocket();
        addObject(rocket,62,202);
        Short xshort = new Short();
        addObject(xshort,136,53);
        removeObject(xshort);
    }
}
