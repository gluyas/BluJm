package crackson4.blujm.entity;

import crackson4.blujm.Direction;
import crackson4.blujm.level.Level;
import ecs100.UI;

public class Enemy extends Entity{
	private boolean isDead = false;
	private double xpos, ypos;
	
	
	
	public Enemy(boolean isDead, double xpos, double ypos) {
		this.isDead = isDead;
		this.xpos = xpos;
		this.ypos = ypos;
	}

	@Override
	public void draw(Direction dir) {
		UI.drawImage(img, xpos, ypos);
	}

	@Override
	public void move(Level level, double x, double y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDead() {
		return new Boolean(isDead);
	}
	
	
	
}
