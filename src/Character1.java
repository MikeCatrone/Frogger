


public class Character1 extends Sprite {

	//Character 1 will be the frog.
	

	// defaults to not alive until the start button is pressed
	private boolean isAlive = false;
	
	
	
	public Character1() {
		super(100, 300, 100, 200, "frogger1.png");
		
	}
	
	public void display() {
		super.display();
	}
	
	
	
	public boolean getAlive() {
		return this.isAlive;
	}
	
	
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	
	
	

}
