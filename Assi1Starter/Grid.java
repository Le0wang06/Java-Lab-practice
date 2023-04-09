import java.util.Random;

/**
 * Grid - holds a two-dimensional array of String objects to use in a game.
 * 
 * @author 
 * @version
 */
public class Grid
{
    // suggested Grid constants public
    //ROWS = 5;           // number of rows
    //COLUMNS = 5;        // number of columns
    //HIDDEN = "$ ";   // default string to display

    //constants moved from Game class public
    //TARGET = "T";          
    // HIT = "*";             
    //MISS = "-"; 
    // NUMBER_OF_TARGETS = 6; // number of targets hidden in the game grid

    // suggested Grid instance variables
    // String[][] grid;                // the grid itself, a 2-D array of String
    // Random random;                  // random number generator

    /**
     * The Grid constructor creates a new grid using public constants ROWS and COLUMNS. 
     * Constructor also creates a new random number generator. 
     */
    public Grid()
    {

    }

    /**
     * sets all items in grid to be "$" symbol, used to create a display grid
     * for DISPLAY grid use ONLY
     */
    public void setDisplayGrid(){

    }

    /**
     * marks random coordinates as target coordinate, with a symbol "T"
     * for TARGET grid use ONLY
     */
    public void setTargetGrid(){
   
    }

    /**
     * set a coordinate in display grid as hit, with a symbol of "*"
     * for DISPLAY grid use ONLY
     * @param coord coordinate object
     */
    public void setHit(CoordinatePair coord){
     
    }

    /**
     * set a coordinate in display grid as miss, with a symbol of "-"
     * for DISPLAY grid use ONLY
     * @param coord coordinate object
     */
    public void setMiss(CoordinatePair coord){
      
    }

    /**
     * a private method that return a random coordinate object
     * @return CoordinatePair object with random coordinates
     */
    private CoordinatePair getRandomCoordinate(){
    
    }

    /**
     * shows the whole grid
     * for DISPLAY grid use ONLY
     */
    public void showGrid(){
     
    }

    /**
     * returns the content of a coordinate in a grid
     * @param coord coordinate object
     */
    public String getContent(CoordinatePair coord){
        
    }
}
