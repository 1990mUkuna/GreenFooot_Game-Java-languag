import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author junior mukuna 
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
        addObject(rocket,56,289);
        man man = new man();
        addObject(man,78,81);
        man.setLocation(76,93);
        man.setLocation(125,127);
        ball ball = new ball();
        addObject(ball,227,163);
        ball ball2 = new ball();
        addObject(ball2,292,160);
        ball ball3 = new ball();
        addObject(ball3,238,264);
        ball ball4 = new ball();
        addObject(ball4,342,286);
        ball ball5 = new ball();
        addObject(ball5,240,332);
        ball ball6 = new ball();
        addObject(ball6,462,348);
        ball ball7 = new ball();
        addObject(ball7,486,243);
        ball ball8 = new ball();
        addObject(ball8,408,196);
        ball ball9 = new ball();
        addObject(ball9,514,171);
        rocket.setLocation(75,258);
        man.setLocation(273,256);
        man.setLocation(148,95);
        rocket.setLocation(32,256);
    }
}
