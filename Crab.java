import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 * march 16 verson 1
 */
public class Crab extends Actor
{
    public void act()
    {
          checkKeyPress();
          move();
          LookForWorm();
       
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * worm code for eating and finding worms
     */
    public void LookForWorm()
    {
         if (isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    /*
     * movement method
     */
    public void checkKeyPress()
    {
          if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
          if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
    }
}

 



