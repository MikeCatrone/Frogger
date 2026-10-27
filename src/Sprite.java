

//.1 class skeleton

import java.awt.Rectangle;

public class Sprite {
	
	
	// Private Attributes

	protected int spriteX, spriteY; // Upper Left coordinates
	protected int spriteWidth, spriteHeight;
	protected String spriteImage;
	
	protected int customSpeed = 75;
	
	protected boolean onLog = false;
	
	
	
	// For collision
	protected Rectangle r;
	
	
	
	// Getters and Setters //
	
	
	
	public boolean getOnLog() {
		return onLog;
	}



	public void setOnLog(boolean onLog) {
		this.onLog = onLog;
	}
	
	
	
	public int getCustomSpeed() {
		return customSpeed;
	}
	
	public void setCustomSpeed(int customSpeed) {
		this.customSpeed = customSpeed;
	}
	
	
	
	
	
	public int getSpriteX() {
		return spriteX;
	}
	
	
	

	public void setSpriteX(int spriteX) {
		this.spriteX = spriteX;
		this.r.x = this.spriteX;
	}
	
	
	
	public int getSpriteY() {
		return spriteY;
	}
	
	
	
	public void setSpriteY(int spriteY) {
		this.spriteY = spriteY;
		this.r.y = this.spriteY;
	}
	
	
	
	public int getSpriteWidth() {
		return spriteWidth;
	}
	
	
	
	
	public void setSpriteWidth(int spriteWidth) {
		this.spriteWidth = spriteWidth;
		this.r.width = this.spriteWidth;
	}
	
	
	
	public int getSpriteHeight() {
		return spriteHeight;
	}
	
	
	
	
	public void setSpriteHeight(int spriteHeight) {
		this.spriteHeight = spriteHeight;
		this.r.height = this.spriteHeight;
	}
	
	
	
	public String getSpriteImage() {
		return spriteImage;
	}
	
	
	
	
	public void setSpriteImage(String spriteImage) {
		this.spriteImage = spriteImage;
	}

	
	
	
	// Gets and sets rectangle
	public Rectangle getRectangle() {
		return r;
	}
	
	

	public void setRectangle(Rectangle r) {
		this.r = r;
	}

	
	
	
	
	// Default Constructor
	public Sprite() {
		super();
		
		r = new Rectangle(this.spriteX, this.spriteY, this.spriteWidth, this.spriteHeight);
		
		
	}

	
	
	
	// Secondary Constructor
	public Sprite(int spriteX, int spriteY, int spriteWidth, int spriteHeight, String spriteImage) {
		super();
		this.spriteX = spriteX;
		this.spriteY = spriteY;
		this.spriteWidth = spriteWidth;
		this.spriteHeight = spriteHeight;
		this.spriteImage = spriteImage;
		
		r = new Rectangle(this.spriteX, this.spriteY, this.spriteWidth, this.spriteHeight);
		
		
	}
	
	
	

	
	
	// Display Function
	
	public void display() {
		System.out.println("x, y: " + this.spriteX + ", " + this.spriteY);
		System.out.println("w, h" + this.spriteWidth + ", " + this.spriteHeight);
		
	}
	
	
	
	
	
	
	
	
}
