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
        wombat wombat = new wombat();
        addObject(wombat,63,97);
        wombat wombat2 = new wombat();
        addObject(wombat2,62,210);
        wombat wombat3 = new wombat();
        addObject(wombat3,68,343);
        wombat wombat4 = new wombat();
        addObject(wombat4,262,77);
        wombat wombat5 = new wombat();
        addObject(wombat5,268,234);
        leaf leaf = new leaf();
        addObject(leaf,228,338);
        leaf leaf2 = new leaf();
        addObject(leaf2,175,192);
        leaf leaf3 = new leaf();
        addObject(leaf3,402,153);
        leaf leaf4 = new leaf();
        addObject(leaf4,137,67);
        leaf leaf5 = new leaf();
        addObject(leaf5,91,279);
        leaf leaf6 = new leaf();
        addObject(leaf6,404,327);
        wombat5.setLocation(434,227);
        wombat5.isAtEdge();
        wombat5.getRotation();
        wombat2.act();
        wombat2.act();
        wombat2.getRotation();
        wombat3.getX();
        wombat2.act();
        wombat2.act();
        wombat2.act();
        wombat2.act();
        wombat2.setRotation(5);
    }
}
