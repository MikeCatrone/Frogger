import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Character2 extends Sprite implements Runnable {
	
	
	// 2 new attributes
	
	private Boolean moving;
	private Boolean visible;
	
	private Thread t;
	
	
	
	// for adjusting different speeds 
	private int sleepTime = 200; // default delay

	
	public int getSleepTime() {
	    return sleepTime;
	}

	public void setSleepTime(int sleepTime) {
	    this.sleepTime = sleepTime;
	}
	
	
	
	// Link to the JLabel from GamePrep
	private JLabel character2Label;
	private JButton startButton;
	
	
	
	// Link to character1 for collision logic below
	private Character1 character1;
	
	
	// Link to character 1 label
	private JLabel character1Label;
	
	
	
	
	


	// Getters and Setters for moving and visibility 
	public Boolean getMoving() {
		return moving;
	}


	public void setMoving(Boolean moving) {
		this.moving = moving;
	}





	public Boolean getVisible() {
		return visible;
	}


	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	
	
	
	
	// Display function
	public void display() {
		super.display();
		System.out.println("moving: " + moving);
		System.out.println("visible: " + visible);
		
	}
	
	
	
	// Show and hide methods for Tardis
	
	public void hide() {
		this.visible = false;
	}
	
	
	public void show() {
		this.visible = true;
		
	}
	
	
	
	
	// Get and set character 2 label
	public JLabel getCharacter2Label() {
		return character2Label;
	}


	public void setCharacter2Label(JLabel character2Label) {
		this.character2Label = character2Label;
	}


	
	
	
	// For start button
	public JButton getStartButton() {
		return startButton;
	}


	public void setStartButton(JButton startButton) {
		this.startButton = startButton;
	}
	
	
	
	
	
	// For character 1
	public Character1 getCharacter1() {
		return character1;
	}


	public void setCharacter1(Character1 character1) {
		this.character1 = character1;
	}
	
	
	
	// JLabel for character 1. Needed for collisions 
	public JLabel getCharacter1label() {
		return character1Label;
	}


	public void setCharacter1label(JLabel character1Label) {
		this.character1Label = character1Label;
	}
	


	
	
	// Constructor

	public Character2() {
		super(0, 0, 124, 200, "car1.png");
		this.moving = false;
		this.visible = true;
		
		
//		this.character2Label = new JLabel();
		this.character2Label = null;
		
		this.startButton = null;
		
	}


	
	


	public void startThread() {
		
		if(!this.moving) {
			
			this.moving = true;
			t = new Thread(this, "Character2Movement");
			t.start();
			
			
		}
		
	}
	
	
	
	public void stopThread() {
		this.moving = false;
		
	}
	
	
	
	
	
	// For Threads
	
	@Override
	public void run() {
		
		//character 2 moving on the screen
		this.moving = true;
		
		if (startButton != null) {
            startButton.setText("STOP");
        }
		
		
	
		
		this.character2Label.setIcon(
				new ImageIcon(getClass().getResource("images/" + this.getSpriteImage()))
		);
		
		
		
		// make character 1 red
		this.character1.setSpriteImage("frogger1.png");
		this.character1Label.setIcon(
			new ImageIcon(getClass().getResource("images/" + this.character1.getSpriteImage()))
		);
		
		
		
		
		
		
		// start moving x coordinate. Keep moving until something sets moving to false
		while(this.moving) {
			
			// movement routine //
			
			
			// Get coordinates
			int x = this.spriteX;
			int y = this.spriteY;
			
			
			
			// Step to the right(boundary loop)
			
			x += GameProperties.CHARACTER_STEP;
			
			if (x > GameProperties.SCREEN_WIDTH) {
				x = -1 * this.spriteWidth;
				
			}
			
			
			// Update character2's x and y
			this.setSpriteX(x);
			this.setSpriteY(y);
			
			
			
			// Update the character 2 label on the screen
			character2Label.setLocation(this.spriteX, this.spriteY);
			
			
			
			// Detect collision with character1. Need to define attribute above (no NEW)
			this.detectCollision();
			
			
			
			
		
			
			// Pause operations for 500ms
			
			try {
				Thread.sleep(this.sleepTime);
				
			} catch (InterruptedException e) {
				
				//prints error in console
				e.printStackTrace();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
				
			} finally {
				
				
			}
			
			
			
		}
		
		startButton.setText("START");
		
		
	}
	
	
	
	private void detectCollision() {
		
		if (this.r.intersects(this.character1.getRectangle() )) {
			
			
			// If interacting with the log, Frogger will be safe
			
			if(this.getSpriteImage().contains("log")) {
				
				
				int frogX = this.character1.getSpriteX() + GameProperties.CHARACTER_STEP;
	            
	            // Update the frog's state and on-screen label location
	            this.character1.setSpriteX(frogX);
	            this.character1Label.setLocation(frogX, this.character1.getSpriteY());
	            
	            this.character1.setOnLog(true);
	            
				
			} else {
				
				this.character1.setOnLog(false);
				
				// Make graphic for character2 red
				this.setSpriteImage("car1.png");
				this.character2Label.setIcon(
						new ImageIcon(getClass().getResource("images/" + this.getSpriteImage()))
				);
				
				this.stopThread();
				
			
				
				
				
				// Make graphic for character1 red
				this.character1.setSpriteImage("frogger1.png");
				this.character1Label.setIcon(
						new ImageIcon(getClass().getResource("images/" + this.character1.getSpriteImage()))
				);
				
				
				// Moves from to the beginning after being hit
				this.character1.setSpriteX(345);
				this.character1.setSpriteY(920);
				
				this.character1Label.setLocation(345,920);
				
				
				
			}
			
			
	
			
		}
	}

}
