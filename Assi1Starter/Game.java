
/**
 * Game class creates a game for user, and provide a playGame method to start the game.
 * 
 * @author 
 * @version
 */
public class Game
{
    // suggested Game constants
    public static final int NUMBER_OF_TRIES = 6; // number of tries the user is given

    // suggested instance variables
    private Grid targetGrid;                       // the grid that holds the targets
    private Grid displayGrid;                      // the grid that displays hits and misses
    private InputReader reader;                    // input reader to get user coordinate choices
    private CoordinatePair currentCoordinate;       //used for holding the new coordinate from user
    private int hitNum;                             //used for tracing the total number of hits
    private int turnNum;                            //used for tracing the number of the current turn

    //switch cases
    private final int NOT_VALID_INPUT = 0;
    private final int NOT_GUESS_ALL = 1;
    private final int GUESS_ALL = 2;
    private final int TRY = 3;
    private final int START = 4;

    //used for clearing hitNum and turnNum to zero
    private final int ZERO = 0;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialize instance variables

    }

    /**
     * Play the game - this method contains the game logic
     */
    public void playGame()
    {
        
    }

    /**
     * tests if the coordinate is valid
     * @return true if the coordinate is valid
     *         false if the coordinate is not valid
     */
    private boolean isValid(){
       
    }

    /**
     * Provides instructions to the user
     * @param swithNum that indicates which case to go
     */
    private void showInstructions(int switchNum)
    {
        
    }

}
