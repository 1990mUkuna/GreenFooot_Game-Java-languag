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
        Beetle beetle = new Beetle();
        addObject(beetle,202,164);
        Shot shot = new Shot();
        addObject(shot,161,100);
        Shot shot2 = new Shot();
        addObject(shot2,161,99);
        Shot shot3 = new Shot();
        addObject(shot3,51,309);
        Food food = new Food();
        addObject(food,450,129);
        Food food2 = new Food();
        addObject(food2,470,265);
        Food food3 = new Food();
        addObject(food3,225,258);
        shot2.setLocation(250,100);
        Food food4 = new Food();
        addObject(food4,383,323);
        Food food5 = new Food();
        addObject(food5,415,73);
        Food food6 = new Food();
        addObject(food6,515,69);
        Food food7 = new Food();
        addObject(food7,388,208);
        Food food8 = new Food();
        addObject(food8,78,75);
        Food food9 = new Food();
        addObject(food9,241,47);
        Food food10 = new Food();
        addObject(food10,342,157);
        Food food11 = new Food();
        addObject(food11,225,344);
        Food food12 = new Food();
        addObject(food12,135,249);
        Food food13 = new Food();
        addObject(food13,74,178);
        Food food14 = new Food();
        addObject(food14,547,315);
        beetle.setLocation(198,225);
        beetle.setLocation(275,241);
        beetle.setLocation(283,275);
    }
}
