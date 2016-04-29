import ecs100.UI;
import java.awt.Image;

public class Player extends Entity{
	private boolean isDead;
	private double xpos, ypos;
	
	private final int HEALTH = 5;
	private final double SPEED = 30;
	private final int DAMAGE = 2;
	private final int RADIUS = 50;
	
	private Leg leg;
	private Arm arm;
	private Head head;
	
	// attributes speed, damage, attack radius, health

	public Player(Leg leg, Arm arm, Head head){
		super();
		this.isDead = false;
		this.xpos = 0;
		this.ypos = 0;
		this.arm = arm;
		this.leg = leg;
		this.head = head;
	}
	
	public double getXpos() {
		return xpos;
	}
	
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}

	public double getYpos() {
		return ypos;
	}

	void setYpos(double ypos) {
		this.ypos = ypos;
	}


	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	@Override
	public void draw(Image img, Direction dir) {
		UI.drawImage(img, xpos, ypos);
	}

	@Override
	// not used for drawing player
	public void move(Level level) {
		double distance = SPEED + leg.getMoveDistance();
		if(!super.canMove(level, x, y))return; // if player can't move
		
		
		
	}

	@Override
	public boolean isDead() {
		return new Boolean(isDead);
	}
	

}
