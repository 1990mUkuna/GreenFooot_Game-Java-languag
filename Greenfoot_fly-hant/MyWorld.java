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
        ant ant = new ant();
        addObject(ant,36,33);
        ant ant2 = new ant();
        addObject(ant2,313,183);
        ant ant3 = new ant();
        addObject(ant3,104,133);
        ant ant4 = new ant();
        addObject(ant4,66,248);
        ant ant5 = new ant();
        addObject(ant5,225,312);
        ant ant6 = new ant();
        addObject(ant6,321,54);
        fly fly = new fly();
        addObject(fly,30,107);
    }
}
