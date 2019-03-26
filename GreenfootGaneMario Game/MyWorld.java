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
        //addObject(new Mario(),15,15);
        grass grass = new grass();
        addObject(grass,66,79);
        grass grass2 = new grass();
        addObject(grass2,174,86);
        grass grass3 = new grass();
        addObject(grass3,293,88);
        grass grass4 = new grass();
        addObject(grass4,451,90);
        grass grass5 = new grass();
        addObject(grass5,32,215);
        grass grass6 = new grass();
        addObject(grass6,148,221);
        grass grass7 = new grass();
        addObject(grass7,299,225);
        grass grass8 = new grass();
        addObject(grass8,464,220);
        grass grass9 = new grass();
        addObject(grass9,421,328);
        grass grass10 = new grass();
        addObject(grass10,247,326);
        grass grass11 = new grass();
        addObject(grass11,116,329);
        grass grass12 = new grass();
        addObject(grass12,12,326);
        grass4.setLocation(507,87);
        grass8.setLocation(478,194);
        grass7.setLocation(313,197);
        grass6.setLocation(170,181);
        grass6.setLocation(167,194);
        grass5.setLocation(40,198);
        grass2.setLocation(179,72);
        grass3.setLocation(345,76);
        tree tree = new tree();
        addObject(tree,124,72);
        tree tree2 = new tree();
        addObject(tree2,255,75);
        tree tree3 = new tree();
        addObject(tree3,422,75);
        tree tree4 = new tree();
        addObject(tree4,106,198);
        tree tree5 = new tree();
        addObject(tree5,237,200);
        tree tree6 = new tree();
        addObject(tree6,396,198);
        tree tree7 = new tree();
        addObject(tree7,67,335);
        tree tree8 = new tree();
        addObject(tree8,190,336);
        tree tree9 = new tree();
        addObject(tree9,341,331);
        House house = new House();
        addObject(house,534,321);
        house2 house2 = new house2();
        addObject(house2,294,140);
        Mario mario = new Mario();
        addObject(mario,150,125);
    }
}
