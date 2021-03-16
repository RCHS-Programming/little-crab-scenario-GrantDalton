import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
          turnAtEdge();
          randomTurn();
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
        }
    }
    
    /*
     * make the crab turn randomly between 0 and 45 degrees 
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

 