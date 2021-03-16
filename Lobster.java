import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
     public void act()
    {
          turnAtEdge();
          randomTurn();
          move();
          LookForCrab();
       
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * crab code for eating and finding crabs
     */
    public void LookForCrab()
    {
         if (isTouching(Crab.class))
        {
            removeTouching(Crab.class);
        }
    }
    
    
    /*
     * make the lobster turn randomly between 0 and 45 degrees 
     */
    public void randomTurn() 
    {
         if ( Greenfoot.getRandomNumber(100) < 10 ) 
            {
              turn ( Greenfoot.getRandomNumber (91)-45);
            }
    }  
    
    /*
     * turn at edge
     */
    public void turnAtEdge()
    {
        if( isAtEdge( ) )
        {
            turn(17);
        }
    }
}
