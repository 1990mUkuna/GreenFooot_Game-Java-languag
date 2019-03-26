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

        Flowers flowers = new Flowers();
        addObject(flowers,65,61);
        Flowers flowers2 = new Flowers();
        addObject(flowers2,109,155);
        Flowers flowers3 = new Flowers();
        addObject(flowers3,56,216);
        Flowers flowers4 = new Flowers();
        addObject(flowers4,51,358);
        Flowers flowers5 = new Flowers();
        addObject(flowers5,180,367);
        Flowers flowers6 = new Flowers();
        addObject(flowers6,233,219);
        Flowers flowers7 = new Flowers();
        addObject(flowers7,341,303);
        Flowers flowers8 = new Flowers();
        addObject(flowers8,360,158);
        Flowers flowers9 = new Flowers();
        addObject(flowers9,279,47);
        Flowers flowers10 = new Flowers();
        addObject(flowers10,445,48);
        Flowers flowers11 = new Flowers();
        addObject(flowers11,567,62);
        Flowers flowers12 = new Flowers();
        addObject(flowers12,529,162);
        Flowers flowers13 = new Flowers();
        addObject(flowers13,523,336);
        Girl girl = new Girl();
        addObject(girl,238,336);
        Flowers flowers14 = new Flowers();
        addObject(flowers14,219,124);
        Flowers flowers15 = new Flowers();
        addObject(flowers15,439,258);
        Car car = new Car();
        addObject(car,77,106);
        Car car2 = new Car();
        addObject(car2,79,311);
        Car car3 = new Car();
        addObject(car3,280,124);
        Car car4 = new Car();
        addObject(car4,360,311);
        girl.setLocation(166,189);
        girl.setLocation(166,189);
        girl.setLocation(166,189);
        girl.setLocation(166,189);
        girl.setLocation(166,189);
        girl.setLocation(166,189);
        girl.setLocation(166,189);
        girl.setLocation(166,189);
        girl.setLocation(166,189);
        girl.setLocation(166,189);
        girl.setLocation(252,389);
        girl.setLocation(220,332);
        girl.setLocation(191,242);
        car3.setLocation(356,111);
        car4.setLocation(411,313);
        girl.setLocation(260,375);
        smiley smiley = new smiley();
        addObject(smiley,54,272);
        smiley smiley2 = new smiley();
        addObject(smiley2,56,172);
        smiley smiley3 = new smiley();
        addObject(smiley3,190,181);
        smiley smiley4 = new smiley();
        addObject(smiley4,415,183);
        smiley smiley5 = new smiley();
        addObject(smiley5,146,85);
        smiley smiley6 = new smiley();
        addObject(smiley6,508,85);
        smiley smiley7 = new smiley();
        addObject(smiley7,268,305);
        smiley smiley8 = new smiley();
        addObject(smiley8,497,300);
    }
}
