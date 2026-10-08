

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;





public class GamePrep extends JFrame implements KeyListener, ActionListener{
	
	
	// Character variables
	private Character1 character1;  // The Frog
	
	private Character2 car1; // car 1
	private Character2 car2; // car 2
	
	private Character2 log1; // log 1
	private Character2 log2; // log 2
	
	
	
	//GUI variables
	private Container content;
	
	private JLabel character1Label, car1Label, log1Label, car2Label, log2Label;
	private ImageIcon character1Image, car1Image, log1Image, car2Image, log2Image;
	
	
	// Background Frogger Image
	private JLabel backgroundLabel;
	private ImageIcon backgroundImage;
	
	
	// Buttons to control game
	private JButton startButton, visibilityButton;
	
	
	
	
	
	
	// Set up GUI
	public GamePrep() {
		
		super("Box Chase");
		
		character1 = new Character1();
		
		car1 = new Character2();
		car2 = new Character2();
		
		
		log1 = new Character2();
		log2 = new Character2();
		
	
		
		// the default window does not support custom colors
		// we will use a content pane to fill the content window
		
		
		content = getContentPane();
		
		
		setSize(GameProperties.SCREEN_WIDTH, GameProperties.SCREEN_HEIGHT);
		
		content.setBackground(Color.GRAY);
		
		setLayout(null);
		
		
		
		
		// Displaying the Characters //
		
		
		
		/////// Frogger //////////////
		
		
		character1.setSpriteX(345);
		character1.setSpriteY(920);
		character1.setSpriteWidth(50);
		character1.setSpriteHeight(50);
		character1.setSpriteImage("frogger1.png");
		
		
		character1Label = new JLabel();
		
		// Frogger image
		character1Image = new ImageIcon(
		getClass().getResource("images/" + character1.getSpriteImage()));
		
		
		// Frogger set size and icon
		character1Label.setIcon(character1Image);
		character1Label.setSize(character1.getSpriteWidth(), character1.getSpriteHeight());
		
		
		// Set location of Frogger
		character1Label.setLocation(
		character1.getSpriteX(), character1.getSpriteY()
				
		);
		
		
		
		
		
		/////// Car 1 /////////
		
		car1.setSpriteX(100);
		car1.setSpriteY(840);
		car1.setSpriteWidth(50);
		car1.setSpriteHeight(50);
		car1.setSpriteImage("car1.png");
		car1.setMoving(false);
		car1.setVisible(true);
		
		
		// Car1 label
		car1Label = new JLabel();
		
		
		// Car1 image
		car1Image = new ImageIcon(
		getClass().getResource("images/" + car1.getSpriteImage()));
		
		
		// Car1 set icon and size
		car1Label.setIcon(car1Image);
		car1Label.setSize(car1.getSpriteWidth(), car1.getSpriteHeight());
		
		
		
		// Set location for the Car 1
		
		car1Label.setLocation(
		car1.getSpriteX(), car1.getSpriteY()
			
		);
		
		
		
		// Set Car1 label
		car1.setCharacter2Label(car1Label);
		
		
		// Car1 needs to know the location of the frog
		car1.setCharacter1(character1);
		car1.setCharacter1label(character1Label);
			
		
		
		
		
		////// Car 2 ///////////////////
		
		car2.setSpriteX(380);
		car2.setSpriteY(690);
		car2.setSpriteWidth(50);
		car2.setSpriteHeight(50);
		car2.setSpriteImage("car1.png");
		car2.setMoving(false);
		car2.setVisible(true);
		
		
		// Car2 label
		car2Label = new JLabel();
		
		
		// Car2 image
		car2Image = new ImageIcon(
		getClass().getResource("images/" + car2.getSpriteImage()));
		
		
		// Car2 set icon and size
		car2Label.setIcon(car2Image);
		car2Label.setSize(car2.getSpriteWidth(), car2.getSpriteHeight());
		
		
		
		// Set location for the Car 2
		
		car2Label.setLocation(
		car2.getSpriteX(), car2.getSpriteY()
			
		);
		
		
		
		// Set Car2 label
		car2.setCharacter2Label(car2Label);
		
		
		// Car1 needs to know the location of the frog
		car2.setCharacter1(character1);
		car2.setCharacter1label(character1Label);
		
		
		
		
		///// Log 1 //////////////////
		
		log1.setSpriteX(500);
		log1.setSpriteY(400);
		log1.setSpriteWidth(150);
		log1.setSpriteHeight(50);
		log1.setSpriteImage("log1.png");
		log1.setMoving(false);
		log1.setVisible(true);
		
		log1.setSleepTime(400);
		
		log1Label = new JLabel();
		
		log1Image = new ImageIcon(
		getClass().getResource("images/log1.png" ));
		
		log1Label.setIcon(log1Image);
		log1Label.setSize(log1.getSpriteWidth(), log1.getSpriteHeight());
		
		log1Label.setLocation(log1.getSpriteX(), log1.getSpriteY());
		
		
		// Wire up the labels and character references
	    log1.setCharacter2Label(log1Label);
	    log1.setCharacter1(character1);
	    log1.setCharacter1label(character1Label);
	    
	    
	    
	    
	    
	    ///// Log 2 ///////////////////////
	    
	    log2.setSpriteX(220);
		log2.setSpriteY(345);
		log2.setSpriteWidth(150);
		log2.setSpriteHeight(50);
		log2.setSpriteImage("log1.png");
		log2.setMoving(false);
		log2.setVisible(true);
		
		
		log2.setSleepTime(120);
		
		
		log2Label = new JLabel();
		
		log2Image = new ImageIcon(
		getClass().getResource("images/log1.png" ));
		
		log2Label.setIcon(log2Image);
		log2Label.setSize(log2.getSpriteWidth(), log2.getSpriteHeight());
		
		log2Label.setLocation(log2.getSpriteX(), log2.getSpriteY());
		
		
		// Wire up the labels and character references
	    log2.setCharacter2Label(log2Label);
	    log2.setCharacter1(character1);
	    log2.setCharacter1label(character1Label);
	    
	    
	    
	    
	    
	    
		
		
		////// Adding Background ///////////////////////////
		
		backgroundLabel = new JLabel();
		
		backgroundImage = new ImageIcon(
		getClass().getResource("images/froggerBackground2.png"));
		
		backgroundLabel.setIcon(backgroundImage);
		backgroundLabel.setSize(824, 977);
		
		backgroundLabel.setLocation(0, 0);
				
			
		
			
		
		// Set Buttons //
	
		startButton = new JButton("START");
		startButton.setSize(100, 100);
		startButton.setLocation(GameProperties.SCREEN_WIDTH - 100, GameProperties.SCREEN_HEIGHT - 130);
		
		startButton.setFocusable(false);
		
		
		
		visibilityButton = new JButton("HIDE");
		visibilityButton.setSize(100, 50);
		visibilityButton.setLocation(GameProperties.SCREEN_WIDTH - 100, GameProperties.SCREEN_HEIGHT - 180);
		
		visibilityButton.setFocusable(false);
		
		
		
		
		// Add action listeners to the buttons
		startButton.addActionListener(this);
		visibilityButton.addActionListener(this);
		
		
		// Send button into character 2
		car1.setStartButton(startButton);
		car2.setStartButton(startButton);
		
		log1.setStartButton(startButton);
		log2.setStartButton(startButton);
		
		
		
		
		// Populate screen //
	
		content.add(character1Label);
		
		content.add(car1Label);
		content.add(car2Label);
		
		content.add(log1Label);
		content.add(log2Label);
		
		
		
		content.add(startButton);
		content.add(visibilityButton);
		
		content.add(backgroundLabel);
		
		
		content.addKeyListener(this);
		content.setFocusable(true);
		
		
//		character2.startThread();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		GamePrep myGame = new GamePrep();
		myGame.setVisible(true);

	}


	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// Not needed for this example
		
	}


	

	// Only using this keypress one
	@Override
	public void keyPressed(KeyEvent e) {
		
		// get current position and create local variables to change
		int x = character1.getSpriteX();
		int y = character1.getSpriteY();
		
		
		
		// determine direction based on 4 arrow keys
		// e.getKeyCode();
		// VK_DOWN, VK_UP, VK_RIGHT, VK_LEFT
		
		
		switch(e.getKeyCode()) {
		
		
		
		// KEY UP //
		case KeyEvent.VK_UP: 
			
			y -= GameProperties.CHARACTER_STEP; 
			
			
			if(y + character1.getSpriteHeight() <= 0) {
				y = GameProperties.SCREEN_HEIGHT;
			}
			
			
		
			// Checks is frog is in the water. The water's y value is between 440 and 60
			
			if(character1.getSpriteY() < 435 && character1.getSpriteY() > 40 && character1.getOnLog() == false) {
				System.out.println("Frog dead!");
				
				x=345;
				y=920;
			
			}
			
			character1.setOnLog(false);
			
			
			break;
			
			
		// KEY DOWN	//
		case KeyEvent.VK_DOWN:
			y += GameProperties.CHARACTER_STEP;
			
			if(y > GameProperties.SCREEN_HEIGHT) {
				y = -1 * character1.getSpriteHeight();
			}
			
			System.out.println(character1.getSpriteY());
			
			
			// Checks is frog is in the water. The water's y value is between 440 and 60
			if(character1.getSpriteY() < 408 && character1.getSpriteY() > 40 && character1.getOnLog() == false) {
				System.out.println("Frog dead");
				
				x=345;
				y=920;
				
				
			}
			
			
			character1.setOnLog(false);
			
			
			break;
			
			
		// KEY LEFT //	
		case KeyEvent.VK_LEFT:
			x -= GameProperties.CHARACTER_STEP;
			
			if(x + character1.getSpriteWidth() <= 0) {
				x = GameProperties.SCREEN_WIDTH;
			}
			
			
			// Checks is frog is in the water. The water's y value is between 440 and 60
			if(character1.getSpriteY() < 440 && character1.getSpriteY() > 60 && character1.getOnLog() == false) {
				System.out.println("Frog dead");
				
				x=345;
				y=920;
				
			}
			
	
			character1.setOnLog(false);
			
			break;
			
			
		// KEY RIGHT //	
		case KeyEvent.VK_RIGHT:
			x += GameProperties.CHARACTER_STEP;
			
			if(x > GameProperties.SCREEN_WIDTH) {
				x = -1 * character1.getSpriteWidth();
			}
			
			
			// Checks is frog is in the water. The water's y value is between 440 and 60
			if(character1.getSpriteY() < 440 && character1.getSpriteY() > 60 && character1.getOnLog() == false) {
				System.out.println("Frog dead");
				
				x=345;
				y=920;
				
			}
			
			
			character1.setOnLog(false);
			
			
			break;
			
		default:
			System.out.println("Unknown key pressed");
			
		}
		
		
	
		// update character state data after the keypress changes the information
		character1.setSpriteX(x);
		character1.setSpriteY(y);
		
		
		
		// move character graphic based on the new data
		character1Label.setLocation(character1.getSpriteX(), character1.getSpriteY());
		
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// Not needed for this example
		
	}



	// Event listener
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == visibilityButton) {
			
			
			if(car1.getVisible()) {
				
				car1.hide();
				car1Label.setVisible(car1.getVisible());
				visibilityButton.setText("SHOW");
				
			} else {
				
				car1.show();
				car1Label.setVisible(car1.getVisible());
				visibilityButton.setText("HIDE");
				
			}
			
			
			
			
			
		} else if(e.getSource() == startButton) {
			
			if(!car1.getMoving() && !car2.getMoving()) {
				
				car1.startThread();
				car2.startThread();
				log1.startThread();
				log2.startThread();
				
				
				
				
			} else {
				car1.stopThread();
				car2.stopThread();
				
				
			}
			
			
			// For the log1 movement
			if(!log1.getMoving()) {
				log1.startThread();
				log2.startThread();
				
			
				
				
			} else if(!car1.getMoving()) {
				log1.stopThread();
				log2.stopThread();
				
			}
			

			
			
			
		} else {
			System.out.println("Unknown command");
			
		}
		
	}
	

}
