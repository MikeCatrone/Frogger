

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
	
	
	
	//GUI variables
	private Container content;
	
	
	private JLabel character1Label, car1Label, log1Label, car2Label, log2Label, car3Label, car4Label, car5Label, car6Label, car7Label, car8Label, car9Label, car10Label, car11Label, car12Label,
	log3Label, log4Label, log5Label, log6Label, log7Label, log8Label, log9Label, log10Label, log11Label, log12Label;
	
	private ImageIcon character1Image, car1Image, log1Image, car2Image, log2Image, car3Image, car4Image, car5Image, car6Image, car7Image, car8Image, car9Image, car10Image, car11Image, car12Image,
	log3Image, log4Image, log5Image, log6Image, log7Image, log8Image, log9Image, log10Image, log11Image, log12Image;
	
	
	
	// Background Frogger Image
	private JLabel backgroundLabel;
	private ImageIcon backgroundImage;
	
	
	// Buttons to control game
	private JButton startButton, visibilityButton;
	
	
	// Array variables
	private Character2[] carRow1;
	private Character2[] carRow2;
	private Character2[] carRow3;
	
	
	private Character2[] logRow1;
	private Character2[] logRow2;
	private Character2[] logRow3;
	
	
	
	
	// Set up GUI
	public GamePrep() {
		super("Box Chase");
		
		
		// Car Arrays //
		carRow1 = new Character2[4];
		carRow2 = new Character2[4];
		carRow3 = new Character2[4];
		
		
		
		carRow1[0] = new Character2();
		carRow1[1] = new Character2();
		carRow1[2] = new Character2();
		carRow1[3] = new Character2();

		carRow2[0] = new Character2();
		carRow2[1] = new Character2();
		carRow2[2] = new Character2();
		carRow2[3] = new Character2();
		
		carRow3[0] = new Character2();
		carRow3[1] = new Character2();
		carRow3[2] = new Character2();
		carRow3[3] = new Character2();
		
		
		
		// Log Arrays //
		logRow1 = new Character2[4];
		logRow2 = new Character2[4];
		logRow3 = new Character2[4];
		
		

		logRow1[0] = new Character2();
		logRow1[1] = new Character2();
		logRow1[2] = new Character2();
		logRow1[3] = new Character2();
		
		logRow2[0] = new Character2();
		logRow2[1] = new Character2();
		logRow2[2] = new Character2();
		logRow2[3] = new Character2();
		
		logRow3[0] = new Character2();
		logRow3[1] = new Character2();
		logRow3[2] = new Character2();
		logRow3[3] = new Character2();
		
		
		
		
		
		// Frogger
		character1 = new Character1();
		
		
	
		
		// Content Pane
		
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
		
		
		
		

		
		////////////////////////////////////////////////////////////////////////////////////
		
		// Cars - Row 1
		
		carRow1[0].setSpriteX(15); carRow1[0].setSpriteY(840);
		carRow1[0].setSpriteWidth(50); carRow1[0].setSpriteHeight(50); 
		carRow1[0].setSpriteImage("car1.png"); carRow1[0].setMoving(false); carRow1[0].setVisible(true); car1Label = new JLabel(); 
		car1Image = new ImageIcon(getClass().getResource("images/" + carRow1[0].getSpriteImage()));
		car1Label.setIcon(car1Image); car1Label.setSize(carRow1[0].getSpriteWidth(), carRow1[0].getSpriteHeight());
		car1Label.setLocation(carRow1[0].getSpriteX(), carRow1[0].getSpriteY());
		carRow1[0].setCharacter2Label(car1Label); carRow1[0].setCharacter1(character1); 
		carRow1[0].setCharacter1label(character1Label);
		
		
		
		//2nd car
		carRow1[1].setSpriteX(180); carRow1[1].setSpriteY(840);
		carRow1[1].setSpriteWidth(50); carRow1[1].setSpriteHeight(50); 
		carRow1[1].setSpriteImage("car1.png"); carRow1[1].setMoving(false); carRow1[1].setVisible(true); car2Label = new JLabel(); 
		car2Image = new ImageIcon(getClass().getResource("images/" + carRow1[1].getSpriteImage()));
		car2Label.setIcon(car2Image); car2Label.setSize(carRow1[1].getSpriteWidth(), carRow1[1].getSpriteHeight());
		car2Label.setLocation(carRow1[1].getSpriteX(), carRow1[1].getSpriteY());
		carRow1[1].setCharacter2Label(car2Label); carRow1[1].setCharacter1(character1); 
		carRow1[1].setCharacter1label(character1Label);
		
		
		//3rd car
		carRow1[2].setSpriteX(360); carRow1[2].setSpriteY(840);
		carRow1[2].setSpriteWidth(50); carRow1[2].setSpriteHeight(50); 
		carRow1[2].setSpriteImage("car1.png"); carRow1[2].setMoving(false); carRow1[2].setVisible(true); car3Label = new JLabel(); 
		car3Image = new ImageIcon(getClass().getResource("images/" + carRow1[2].getSpriteImage()));
		car3Label.setIcon(car3Image); car3Label.setSize(carRow1[2].getSpriteWidth(), carRow1[2].getSpriteHeight());
		car3Label.setLocation(carRow1[2].getSpriteX(), carRow1[2].getSpriteY());
		carRow1[2].setCharacter2Label(car3Label); carRow1[2].setCharacter1(character1); 
		carRow1[2].setCharacter1label(character1Label);
		
		
		// 4th car
		carRow1[3].setSpriteX(620); carRow1[3].setSpriteY(840);
		carRow1[3].setSpriteWidth(50); carRow1[3].setSpriteHeight(50); 
		carRow1[3].setSpriteImage("car1.png"); carRow1[3].setMoving(false); carRow1[3].setVisible(true); car4Label = new JLabel(); 
		car4Image = new ImageIcon(getClass().getResource("images/" + carRow1[3].getSpriteImage()));
		car4Label.setIcon(car4Image); car4Label.setSize(carRow1[3].getSpriteWidth(), carRow1[3].getSpriteHeight());
		car4Label.setLocation(carRow1[3].getSpriteX(), carRow1[3].getSpriteY());
		carRow1[3].setCharacter2Label(car4Label); carRow1[3].setCharacter1(character1); 
		carRow1[3].setCharacter1label(character1Label);
		
		
		
		////////////////////////////////////////////////
		// Cars - Row 2
		
		// 5th
		carRow2[0].setSpriteX(620); carRow2[0].setSpriteY(690);
		carRow2[0].setSpriteWidth(50); carRow2[0].setSpriteHeight(50); 
		carRow2[0].setSpriteImage("car1.png"); carRow2[0].setMoving(false); carRow2[0].setVisible(true); car5Label = new JLabel(); 
		car5Image = new ImageIcon(getClass().getResource("images/" + carRow2[0].getSpriteImage()));
		car5Label.setIcon(car5Image); car5Label.setSize(carRow2[0].getSpriteWidth(), carRow2[0].getSpriteHeight());
		car5Label.setLocation(carRow2[0].getSpriteX(), carRow2[0].getSpriteY());
		carRow2[0].setCharacter2Label(car5Label); carRow2[0].setCharacter1(character1); 
		carRow2[0].setCharacter1label(character1Label);
		carRow2[0].setReverse(true);
		
		
		
		// 6th
		carRow2[1].setSpriteX(440); carRow2[1].setSpriteY(690);
		carRow2[1].setSpriteWidth(50); carRow2[1].setSpriteHeight(50); 
		carRow2[1].setSpriteImage("car1.png"); carRow2[1].setMoving(false); carRow2[1].setVisible(true); car6Label = new JLabel(); 
		car6Image = new ImageIcon(getClass().getResource("images/" + carRow2[1].getSpriteImage()));
		car6Label.setIcon(car6Image); car6Label.setSize(carRow2[1].getSpriteWidth(), carRow2[1].getSpriteHeight());
		car6Label.setLocation(carRow2[1].getSpriteX(), carRow2[1].getSpriteY());
		carRow2[1].setCharacter2Label(car6Label); carRow2[1].setCharacter1(character1); 
		carRow2[1].setCharacter1label(character1Label);
		carRow2[1].setReverse(true);
		
		
		
		// 7th
		carRow2[2].setSpriteX(260); carRow2[2].setSpriteY(690);
		carRow2[2].setSpriteWidth(50); carRow2[2].setSpriteHeight(50); 
		carRow2[2].setSpriteImage("car1.png"); carRow2[2].setMoving(false); carRow2[2].setVisible(true); car7Label = new JLabel(); 
		car7Image = new ImageIcon(getClass().getResource("images/" + carRow2[2].getSpriteImage()));
		car7Label.setIcon(car7Image); car7Label.setSize(carRow2[2].getSpriteWidth(), carRow2[2].getSpriteHeight());
		car7Label.setLocation(carRow2[2].getSpriteX(), carRow2[2].getSpriteY());
		carRow2[2].setCharacter2Label(car7Label); carRow2[2].setCharacter1(character1); 
		carRow2[2].setCharacter1label(character1Label);
		carRow2[2].setReverse(true);
		
				
		
		// 8th
		carRow2[3].setSpriteX(60); carRow2[3].setSpriteY(690);
		carRow2[3].setSpriteWidth(50); carRow2[3].setSpriteHeight(50); 
		carRow2[3].setSpriteImage("car1.png"); carRow2[3].setMoving(false); carRow2[3].setVisible(true); car8Label = new JLabel(); 
		car8Image = new ImageIcon(getClass().getResource("images/" + carRow2[3].getSpriteImage()));
		car8Label.setIcon(car8Image); car8Label.setSize(carRow2[3].getSpriteWidth(), carRow2[3].getSpriteHeight());
		car8Label.setLocation(carRow2[3].getSpriteX(), carRow2[3].getSpriteY());
		carRow2[3].setCharacter2Label(car8Label); carRow2[3].setCharacter1(character1); 
		carRow2[3].setCharacter1label(character1Label);
		carRow2[3].setReverse(true);
		
				
				
		
		//////////////////////////////////////////////////////////////////////////////
		/// Cars - Row 3
		
		
		// 9th
		carRow3[0].setSpriteX(60); carRow3[0].setSpriteY(530);
		carRow3[0].setSpriteWidth(50); carRow3[0].setSpriteHeight(50); 
		carRow3[0].setSpriteImage("car1.png"); carRow3[0].setMoving(false); carRow3[0].setVisible(true); car9Label = new JLabel(); 
		car9Image = new ImageIcon(getClass().getResource("images/" + carRow3[0].getSpriteImage()));
		car9Label.setIcon(car9Image); car9Label.setSize(carRow3[0].getSpriteWidth(), carRow3[0].getSpriteHeight());
		car9Label.setLocation(carRow3[0].getSpriteX(), carRow3[0].getSpriteY());
		carRow3[0].setCharacter2Label(car9Label); carRow3[0].setCharacter1(character1); 
		carRow3[0].setCharacter1label(character1Label);
		
		
		

		// 10th
		carRow3[1].setSpriteX(220); carRow3[1].setSpriteY(530);
		carRow3[1].setSpriteWidth(50); carRow3[1].setSpriteHeight(50); 
		carRow3[1].setSpriteImage("car1.png"); carRow3[1].setMoving(false); carRow3[1].setVisible(true); car10Label = new JLabel(); 
		car10Image = new ImageIcon(getClass().getResource("images/" + carRow3[1].getSpriteImage()));
		car10Label.setIcon(car10Image); car10Label.setSize(carRow3[1].getSpriteWidth(), carRow3[1].getSpriteHeight());
		car10Label.setLocation(carRow3[1].getSpriteX(), carRow3[1].getSpriteY());
		carRow3[1].setCharacter2Label(car10Label); carRow3[1].setCharacter1(character1); 
		carRow3[1].setCharacter1label(character1Label);
		
		
		// 11th
		carRow3[2].setSpriteX(410); carRow3[2].setSpriteY(530);
		carRow3[2].setSpriteWidth(50); carRow3[2].setSpriteHeight(50); 
		carRow3[2].setSpriteImage("car1.png"); carRow3[2].setMoving(false); carRow3[2].setVisible(true); car11Label = new JLabel(); 
		car11Image = new ImageIcon(getClass().getResource("images/" + carRow3[2].getSpriteImage()));
		car11Label.setIcon(car11Image); car11Label.setSize(carRow3[2].getSpriteWidth(), carRow3[2].getSpriteHeight());
		car11Label.setLocation(carRow3[2].getSpriteX(), carRow3[2].getSpriteY());
		carRow3[2].setCharacter2Label(car11Label); carRow3[2].setCharacter1(character1); 
		carRow3[2].setCharacter1label(character1Label);
		
		
		// 12th
		carRow3[3].setSpriteX(620); carRow3[3].setSpriteY(530);
		carRow3[3].setSpriteWidth(50); carRow3[3].setSpriteHeight(50); 
		carRow3[3].setSpriteImage("car1.png"); carRow3[3].setMoving(false); carRow3[3].setVisible(true); car12Label = new JLabel(); 
		car12Image = new ImageIcon(getClass().getResource("images/" + carRow3[3].getSpriteImage()));
		car12Label.setIcon(car12Image); car12Label.setSize(carRow3[3].getSpriteWidth(), carRow3[3].getSpriteHeight());
		car12Label.setLocation(carRow3[3].getSpriteX(), carRow3[3].getSpriteY());
		carRow3[3].setCharacter2Label(car12Label); carRow3[3].setCharacter1(character1); 
		carRow3[3].setCharacter1label(character1Label);
		
		
		
	    
	    ///////////////////////////////////////////////////////////////////////////
	    
	    // Log Array 1
	    
	    
	    // Log 1
	    logRow1[0].setSpriteX(650); logRow1[0].setSpriteY(400);
	    logRow1[0].setSpriteWidth(150); logRow1[0].setSpriteHeight(50); 
	    logRow1[0].setSpriteImage("log1.png"); logRow1[0].setMoving(false); logRow1[0].setVisible(true); 
	    logRow1[0].setSleepTime(400);
	    log1Label = new JLabel(); 
	    log1Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log1Label.setIcon(log1Image); log1Label.setSize(logRow1[0].getSpriteWidth(), logRow1[0].getSpriteHeight());
	    log1Label.setLocation(logRow1[0].getSpriteX(), logRow1[0].getSpriteY());
	    logRow1[0].setCharacter2Label(log1Label); logRow1[0].setCharacter1(character1); 
	    logRow1[0].setCharacter1label(character1Label);
	    
	    
	    // Log 2
	    logRow1[1].setSpriteX(420); logRow1[1].setSpriteY(400);
	    logRow1[1].setSpriteWidth(150); logRow1[1].setSpriteHeight(50); 
	    logRow1[1].setSpriteImage("log1.png"); logRow1[1].setMoving(false); logRow1[1].setVisible(true); 
	    logRow1[1].setSleepTime(400);
	    log2Label = new JLabel(); 
	    log2Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log2Label.setIcon(log2Image); log2Label.setSize(logRow1[1].getSpriteWidth(), logRow1[1].getSpriteHeight());
	    log2Label.setLocation(logRow1[1].getSpriteX(), logRow1[1].getSpriteY());
	    logRow1[1].setCharacter2Label(log2Label); logRow1[1].setCharacter1(character1); 
	    logRow1[1].setCharacter1label(character1Label);
	    
	    
	    // Log 3
	    logRow1[2].setSpriteX(220); logRow1[2].setSpriteY(400);
	    logRow1[2].setSpriteWidth(150); logRow1[2].setSpriteHeight(50); 
	    logRow1[2].setSpriteImage("log1.png"); logRow1[2].setMoving(false); logRow1[2].setVisible(true); 
	    logRow1[2].setSleepTime(400);
	    log3Label = new JLabel(); 
	    log3Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log3Label.setIcon(log3Image); log3Label.setSize(logRow1[2].getSpriteWidth(), logRow1[2].getSpriteHeight());
	    log3Label.setLocation(logRow1[2].getSpriteX(), logRow1[2].getSpriteY());
	    logRow1[2].setCharacter2Label(log3Label); logRow1[2].setCharacter1(character1); 
	    logRow1[2].setCharacter1label(character1Label);
	    
	    
	    // Log 4
	    logRow1[3].setSpriteX(20); logRow1[3].setSpriteY(400);
	    logRow1[3].setSpriteWidth(150); logRow1[3].setSpriteHeight(50); 
	    logRow1[3].setSpriteImage("log1.png"); logRow1[3].setMoving(false); logRow1[3].setVisible(true); 
	    logRow1[3].setSleepTime(400);
	    log4Label = new JLabel(); 
	    log4Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log4Label.setIcon(log4Image); log4Label.setSize(logRow1[3].getSpriteWidth(), logRow1[3].getSpriteHeight());
	    log4Label.setLocation(logRow1[3].getSpriteX(), logRow1[3].getSpriteY());
	    logRow1[3].setCharacter2Label(log4Label); logRow1[3].setCharacter1(character1); 
	    logRow1[3].setCharacter1label(character1Label);
	    
	    
	    
	    //////////////////////////////////////////////////////////////////////////////////////////////
	    /// Log row 2
	    
	    // Log 5
	    logRow2[0].setSpriteX(620); logRow2[0].setSpriteY(325);
	    logRow2[0].setSpriteWidth(150); logRow2[0].setSpriteHeight(50); 
	    logRow2[0].setSpriteImage("log1.png"); logRow2[0].setMoving(false); logRow2[0].setVisible(true); 
	    logRow2[0].setSleepTime(300);
	    log5Label = new JLabel(); 
	    log5Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log5Label.setIcon(log5Image); log5Label.setSize(logRow2[0].getSpriteWidth(), logRow2[0].getSpriteHeight());
	    log5Label.setLocation(logRow2[0].getSpriteX(), logRow2[0].getSpriteY());
	    logRow2[0].setCharacter2Label(log5Label); logRow2[0].setCharacter1(character1); 
	    logRow2[0].setCharacter1label(character1Label);
	    logRow2[0].setReverse(true);
	    
	    
	    // Log 6
	    logRow2[1].setSpriteX(420); logRow2[1].setSpriteY(325);
	    logRow2[1].setSpriteWidth(150); logRow2[1].setSpriteHeight(50); 
	    logRow2[1].setSpriteImage("log1.png"); logRow2[1].setMoving(false); logRow2[1].setVisible(true); 
	    logRow2[1].setSleepTime(300);
	    log6Label = new JLabel(); 
	    log6Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log6Label.setIcon(log6Image); log6Label.setSize(logRow2[1].getSpriteWidth(), logRow2[1].getSpriteHeight());
	    log6Label.setLocation(logRow2[1].getSpriteX(), logRow2[1].getSpriteY());
	    logRow2[1].setCharacter2Label(log6Label); logRow2[1].setCharacter1(character1); 
	    logRow2[1].setCharacter1label(character1Label);
	    logRow2[1].setReverse(true);
	    
	    
	    
	    // Log 7
	    logRow2[2].setSpriteX(220); logRow2[2].setSpriteY(325);
	    logRow2[2].setSpriteWidth(150); logRow2[2].setSpriteHeight(50); 
	    logRow2[2].setSpriteImage("log1.png"); logRow2[2].setMoving(false); logRow2[2].setVisible(true); 
	    logRow2[2].setSleepTime(300);
	    log7Label = new JLabel(); 
	    log7Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log7Label.setIcon(log7Image); log7Label.setSize(logRow2[2].getSpriteWidth(), logRow2[2].getSpriteHeight());
	    log7Label.setLocation(logRow2[2].getSpriteX(), logRow2[2].getSpriteY());
	    logRow2[2].setCharacter2Label(log7Label); logRow2[2].setCharacter1(character1); 
	    logRow2[2].setCharacter1label(character1Label);
	    logRow2[2].setReverse(true);
	    
	    
	    // Log 8
	    logRow2[3].setSpriteX(20); logRow2[3].setSpriteY(325);
	    logRow2[3].setSpriteWidth(150); logRow2[3].setSpriteHeight(50); 
	    logRow2[3].setSpriteImage("log1.png"); logRow2[3].setMoving(false); logRow2[3].setVisible(true); 
	    logRow2[3].setSleepTime(300);
	    log8Label = new JLabel(); 
	    log8Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log8Label.setIcon(log8Image); log8Label.setSize(logRow2[3].getSpriteWidth(), logRow2[3].getSpriteHeight());
	    log8Label.setLocation(logRow2[3].getSpriteX(), logRow2[3].getSpriteY());
	    logRow2[3].setCharacter2Label(log8Label); logRow2[3].setCharacter1(character1); 
	    logRow2[3].setCharacter1label(character1Label);
	    logRow2[3].setReverse(true);
	    
	    
	    ///////////////////////////////////////////////////////////////
	    /// Log Row 3
	    
	    // log 9
	    logRow3[0].setSpriteX(620); logRow3[0].setSpriteY(250);
	    logRow3[0].setSpriteWidth(150); logRow3[0].setSpriteHeight(50); 
	    logRow3[0].setSpriteImage("log1.png"); logRow3[0].setMoving(false); logRow3[0].setVisible(true); 
	    logRow3[0].setSleepTime(400);
	    log9Label = new JLabel(); 
	    log9Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log9Label.setIcon(log9Image); log9Label.setSize(logRow3[0].getSpriteWidth(), logRow3[0].getSpriteHeight());
	    log9Label.setLocation(logRow3[0].getSpriteX(), logRow3[0].getSpriteY());
	    logRow3[0].setCharacter2Label(log9Label); logRow3[0].setCharacter1(character1); 
	    logRow3[0].setCharacter1label(character1Label);
	    
	    
	    // log10
	    logRow3[1].setSpriteX(420); logRow3[1].setSpriteY(250);
	    logRow3[1].setSpriteWidth(150); logRow3[1].setSpriteHeight(50); 
	    logRow3[1].setSpriteImage("log1.png"); logRow3[1].setMoving(false); logRow3[1].setVisible(true); 
	    logRow3[1].setSleepTime(400);
	    log10Label = new JLabel(); 
	    log10Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log10Label.setIcon(log10Image); log10Label.setSize(logRow3[1].getSpriteWidth(), logRow3[1].getSpriteHeight());
	    log10Label.setLocation(logRow3[1].getSpriteX(), logRow3[1].getSpriteY());
	    logRow3[1].setCharacter2Label(log10Label); logRow3[1].setCharacter1(character1); 
	    logRow3[1].setCharacter1label(character1Label);
	    
	    
	    // log11
	    logRow3[2].setSpriteX(220); logRow3[2].setSpriteY(250);
	    logRow3[2].setSpriteWidth(150); logRow3[2].setSpriteHeight(50); 
	    logRow3[2].setSpriteImage("log1.png"); logRow3[2].setMoving(false); logRow3[2].setVisible(true); 
	    logRow3[2].setSleepTime(400);
	    log11Label = new JLabel(); 
	    log11Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log11Label.setIcon(log11Image); log11Label.setSize(logRow3[2].getSpriteWidth(), logRow3[2].getSpriteHeight());
	    log11Label.setLocation(logRow3[2].getSpriteX(), logRow3[2].getSpriteY());
	    logRow3[2].setCharacter2Label(log11Label); logRow3[2].setCharacter1(character1); 
	    logRow3[2].setCharacter1label(character1Label);
	    
	    
	    // log12
	    logRow3[3].setSpriteX(30); logRow3[3].setSpriteY(250);
	    logRow3[3].setSpriteWidth(150); logRow3[3].setSpriteHeight(50); 
	    logRow3[3].setSpriteImage("log1.png"); logRow3[3].setMoving(false); logRow3[3].setVisible(true); 
	    logRow3[3].setSleepTime(400);
	    log12Label = new JLabel(); 
	    log12Image = new ImageIcon(getClass().getResource("images/log1.png"));
	    log12Label.setIcon(log12Image); log12Label.setSize(logRow3[3].getSpriteWidth(), logRow3[3].getSpriteHeight());
	    log12Label.setLocation(logRow3[3].getSpriteX(), logRow3[3].getSpriteY());
	    logRow3[3].setCharacter2Label(log12Label); logRow3[3].setCharacter1(character1); 
	    logRow3[3].setCharacter1label(character1Label);
	    
	    
	    
		
		
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
		
		carRow1[0].setStartButton(startButton);
		carRow1[1].setStartButton(startButton);
		carRow1[2].setStartButton(startButton);
		carRow1[3].setStartButton(startButton);
		
		carRow2[0].setStartButton(startButton);
		carRow2[1].setStartButton(startButton);
		carRow2[2].setStartButton(startButton);
		carRow2[3].setStartButton(startButton);
		
		carRow3[0].setStartButton(startButton);
		carRow3[1].setStartButton(startButton);
		carRow3[2].setStartButton(startButton);
		carRow3[3].setStartButton(startButton);
		
		
		logRow1[0].setStartButton(startButton);
		logRow1[1].setStartButton(startButton);
		logRow1[2].setStartButton(startButton);
		logRow1[3].setStartButton(startButton);
		
		logRow2[0].setStartButton(startButton);
		logRow2[1].setStartButton(startButton);
		logRow2[2].setStartButton(startButton);
		logRow2[3].setStartButton(startButton);
		
		logRow3[0].setStartButton(startButton);
		logRow3[1].setStartButton(startButton);
		logRow3[2].setStartButton(startButton);
		logRow3[3].setStartButton(startButton);
		
		
		
		
		
		// Populate screen //////////////////////////////////////////////////////////////////////
	
		content.add(character1Label);
		
		
		// row 1 of cars
		content.add(car1Label); 
		content.add(car2Label);
		content.add(car3Label);
		content.add(car4Label);
		
		
		// row 2 of cars
		content.add(car5Label); 
		content.add(car6Label);
		content.add(car7Label);
		content.add(car8Label);
		
		
		// row 3 of cars
		content.add(car9Label); 
		content.add(car10Label);
		content.add(car11Label);
		content.add(car12Label);
		
		
		
		// row 1 of logs
		content.add(log1Label);
		content.add(log2Label);
		content.add(log3Label);
		content.add(log4Label);
		
		
		// row 2 of logs
		content.add(log5Label);
		content.add(log6Label);
		content.add(log7Label);
		content.add(log8Label);
		
		
		// row 3 of logs
		content.add(log9Label);
		content.add(log10Label);
		content.add(log11Label);
		content.add(log12Label);
		
		
		
		
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
		// Not needed for this application
		
	}


	

	// Keypress logic
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
			
			y -= character1.getCustomSpeed(); 
			
			
			if(y + character1.getSpriteHeight() <= 0) {
				y = GameProperties.SCREEN_HEIGHT;
			}
			
			
			// Win Logic
			if(y < 200 && character1.getOnLog() == true) {
				System.out.println("YOU WIN!");
				
				carRow1[0].setMoving(false);
				carRow1[1].setMoving(false);
				carRow1[2].setMoving(false);
				carRow1[3].setMoving(false);

				carRow2[0].setMoving(false);
				carRow2[1].setMoving(false);
				carRow2[2].setMoving(false);
				carRow2[3].setMoving(false);
				
				carRow3[0].setMoving(false);
				carRow3[1].setMoving(false);
				carRow3[2].setMoving(false);
				carRow3[3].setMoving(false);
				
				
				logRow1[0].setMoving(false);
				logRow1[1].setMoving(false);
				logRow1[2].setMoving(false);
				logRow1[3].setMoving(false);
				
				logRow2[0].setMoving(false);
				logRow2[1].setMoving(false);
				logRow2[2].setMoving(false);
				logRow2[3].setMoving(false);
				
				logRow3[0].setMoving(false);
				logRow3[1].setMoving(false);
				logRow3[2].setMoving(false);
				logRow3[3].setMoving(false);
				
				
				this.character1.setSpriteImage("froggerWin.png");
				this.character1Label.setIcon(
						new ImageIcon(getClass().getResource("images/" + this.character1.getSpriteImage()))
				);
					
				
			} else {
				
				System.out.println("You losee");
			}
			
			
			System.out.println(character1.getSpriteY());
			
			
		
			// Checks is frog is in the water. The water's y value is between 440 and 60
			
			if(character1.getSpriteY() < 440 && character1.getSpriteY() > 230 && character1.getOnLog() == false) {
				System.out.println("Frog dead!");
				
				x=345;
				y=920;
			
			}
			
			character1.setOnLog(false);
			
			
			break;
			
			
		// KEY DOWN	//
		case KeyEvent.VK_DOWN:
			y += character1.getCustomSpeed();
			
			if(y > GameProperties.SCREEN_HEIGHT) {
				y = -1 * character1.getSpriteHeight();
			}
			
			System.out.println(character1.getSpriteY());
			
			
			// Checks is frog is in the water. The water's y value is between 440 and 60
			if(character1.getSpriteY() < 440 && character1.getSpriteY() > 230 && character1.getOnLog() == false) {
				System.out.println("Frog dead");
				
				x=345;
				y=920;
				
				
			} 
			
			
			character1.setOnLog(false);
			
			
			break;
			
			
		// KEY LEFT //	
		case KeyEvent.VK_LEFT:
			x -= character1.getCustomSpeed();
			
			if(x + character1.getSpriteWidth() <= 0) {
				x = GameProperties.SCREEN_WIDTH;
			}
			
			
			// Checks is frog is in the water. The water's y value is between 440 and 60
			if(character1.getSpriteY() < 440 && character1.getSpriteY() > 230 && character1.getOnLog() == false) {
				System.out.println("Frog dead");
				
				x=345;
				y=920;
				
			}
			
	
			character1.setOnLog(false);
			
			break;
			
			
		// KEY RIGHT //	
		case KeyEvent.VK_RIGHT:
			x += character1.getCustomSpeed();
			
			if(x > GameProperties.SCREEN_WIDTH) {
				x = -1 * character1.getSpriteWidth();
			}
			
			
			// Checks is frog is in the water. The water's y value is between 440 and 60
			if(character1.getSpriteY() < 445 && character1.getSpriteY() > 230 && character1.getOnLog() == false) {
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
		
		content.repaint();
		
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// Not needed for this example
		
	}



	// Event listener
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// The Hide Button
		if(e.getSource() == visibilityButton) {
			
			
			if(carRow1[0].getVisible()) {
				
				carRow1[0].hide();
				car1Label.setVisible(carRow1[0].getVisible());
				visibilityButton.setText("SHOW");
				
			} else {
				
				carRow1[0].show();
				car1Label.setVisible(carRow1[0].getVisible());
				visibilityButton.setText("HIDE");
				
			}
			
			
			
			
		// The Start Button	
		} else if(e.getSource() == startButton) {
			
			
			
			if(startButton.getText().equals("START")){
				
				System.out.println("Start Pressed");
				System.out.println(character1.getAlive());
				
				character1.setAlive(true);
				
				character1.setSpriteX(345);
				character1.setSpriteY(920);
				
				character1Label.setLocation(345, 920);
				
				
				
				carRow1[0].stopThread();
				carRow1[1].stopThread();
				carRow1[2].stopThread();
				carRow1[3].stopThread();
				
				carRow2[0].stopThread();
				carRow2[1].stopThread();
				carRow2[2].stopThread();
				carRow2[3].stopThread();
				
				carRow3[0].stopThread();
				carRow3[1].stopThread();
				carRow3[2].stopThread();
				carRow3[3].stopThread();
				
				
				
				logRow1[0].stopThread();
				logRow1[1].stopThread();
				logRow1[2].stopThread();
				logRow1[3].stopThread();
				
				logRow2[0].stopThread();
				logRow2[1].stopThread();
				logRow2[2].stopThread();
				logRow2[3].stopThread();
				
				logRow3[0].stopThread();
				logRow3[1].stopThread();
				logRow3[2].stopThread();
				logRow3[3].stopThread();
				
				
				
				carRow1[0].startThread();
				carRow1[1].startThread();
				carRow1[2].startThread();
				carRow1[3].startThread();
				
				carRow2[0].startThread();
				carRow2[1].startThread();
				carRow2[2].startThread();
				carRow2[3].startThread();
				
				carRow3[0].startThread();
				carRow3[1].startThread();
				carRow3[2].startThread();
				carRow3[3].startThread();
				
				
				
				logRow1[0].startThread();
				logRow1[1].startThread();
				logRow1[2].startThread();
				logRow1[3].startThread();
				
				logRow2[0].startThread();
				logRow2[1].startThread();
				logRow2[2].startThread();
				logRow2[3].startThread();
				
				logRow3[0].startThread();
				logRow3[1].startThread();
				logRow3[2].startThread();
				logRow3[3].startThread();
				
				
				
				
			} else if(startButton.getText().equals("STOP")) {
						
				character1.setAlive(false);
				
				
				carRow1[0].stopThread();
				carRow1[1].stopThread();
				carRow1[2].stopThread();
				carRow1[3].stopThread();
				
				carRow2[0].stopThread();
				carRow2[1].stopThread();
				carRow2[2].stopThread();
				carRow2[3].stopThread();
				
				carRow3[0].stopThread();
				carRow3[1].stopThread();
				carRow3[2].stopThread();
				carRow3[3].stopThread();
				
				
				logRow1[0].stopThread();
				logRow1[1].stopThread();
				logRow1[2].stopThread();
				logRow1[3].stopThread();
				
				logRow2[0].stopThread();
				logRow2[1].stopThread();
				logRow2[2].stopThread();
				logRow2[3].stopThread();
				
				logRow3[0].stopThread();
				logRow3[1].stopThread();
				logRow3[2].stopThread();
				logRow3[3].stopThread();
				
				
		
			}
			
			
			
			
		} else {
			System.out.println("Unknown command");
			
		}
		
		
	}
	

}
