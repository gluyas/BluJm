package crackson4.blujm;

import crackson4.blujm.entity.Player;
import crackson4.blujm.level.Level;
import ecs100.*;
import java.awt.*;

public class Game {

    //this change should affect my test branch

	private Player player = null;
    private Level level = null;
	
    /** Construct a new crackson4.blujm.Game object:
     * - draw the game state
     * - create the player
     * - set up the GUI (the buttons)
     *     whatever the buttons do
     * - begins the game loop
     */
    public Game(){
        UI.setKeyListener(this::doKey);
    	//draw immediate game state
    	//create immediate game object
       //Gui buttons made easy with ECS100
    	//UI.setMouseListener(this::doMouse);
       // UI.addButton("Hop",  this::doHop);
        //UI.addButton("Back", this::doHopBack);
        //UI.addButton("New crackson4.blujm.Game", this::doNewGame);
    	//UI.addButton("Line",()->{this.currentAction = "Line";});  lambda example. can place multiple statements in block
        //UI.addSlider("Car Speed", 1, 25, 3, this::doSpeedControl);  //adds a slider to control car speed
        //UI.addButton("Quit", UI::quit);

        //initialise default stats
 
        //begins game loop 
        this.runGame();
    }

    private void doKey(String key) {
        switch (key) {
            case "W":
                player.move(level, Direction.NORTH);
        }
    }

    /*
     * Resets the game
     */
    public void doNewGame(){
    	//better option might be to end this object ? and create new from main
    	
    	
       //reset gamestats
    	//draw game state
        drawState();
        //reintiialise basically
        this.player = new Player();
        runGame();
    }


    /**
     * Draw the current game state.
     * Use the constants defined above.
     */
    public static void drawState(){
        double y;
     // UI.clearGraphics();
        UI.setColor(Color.gray);	//set background colour
        
        //do actual drawing from object draw methods
        //UI.repaintGraphics();
        
    }


    public void runGame(){
    	boolean playing = true;
    	//initial game fields, depends on type of game

        //Creates the objects
      
       // Set text size for stats UI.setFontSize(20);
        while (playing){	//some condition
            //Moves the cars

           //In game objects defined
        	

            UI.sleep(50);       //Animation sleeps for a time so cars are not too fast
        }

    }


    
    public static void main(String[] arguments){
    	UI.setDivider(0.0);	//removes divider
    	//GUI stuff ?
    	
        new Game();
    }   

}
