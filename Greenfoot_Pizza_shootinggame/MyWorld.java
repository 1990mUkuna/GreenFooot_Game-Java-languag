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
        rocket rocket = new rocket();
        addObject(rocket,47,204);
        pizza_cheese pizza_cheese = new pizza_cheese();
        addObject(pizza_cheese,548,57);
        pizza_cheese.setLocation(544,45);
        pizza_cheese pizza_cheese2 = new pizza_cheese();
        addObject(pizza_cheese2,548,139);
        pizza_cheese pizza_cheese3 = new pizza_cheese();
        addObject(pizza_cheese3,553,236);
        pizza_cheese pizza_cheese4 = new pizza_cheese();
        addObject(pizza_cheese4,559,355);
        pizza_cheese pizza_cheese5 = new pizza_cheese();
        addObject(pizza_cheese5,456,54);
        pizza_cheese pizza_cheese6 = new pizza_cheese();
        addObject(pizza_cheese6,485,148);
        pizza_cheese pizza_cheese7 = new pizza_cheese();
        addObject(pizza_cheese7,477,248);
        pizza_cheese pizza_cheese8 = new pizza_cheese();
        addObject(pizza_cheese8,469,364);
        beeper beeper = new beeper();
        addObject(beeper,61,24);
        rocket.setLocation(26,200);
        removeObject(beeper);
    }
}
