/**
 * For moving objects on the screen
 * @author Daniel
 *
 */
public abstract class Entity {
	
	/**
	 * Draws the entity.
	 * @param the file name of the image
	 * @param The x position of the image
	 * @param The y position of the image.
	 */
	abstract void draw(java.awt.Image img, Direction dir);
	
	
	/**
	 * Moves the entity in the given direction
	 * @param The direction for the entity to move.
	 */
	abstract void move(Level level, double x, double y);
	
	
	public boolean canMove(Level level, double x, double y){
		return !level.isSolid(x, y);
	}
	
	/**
	 * Ascertains whether the enitity is "dead"
	 * @return Boolean where true is dead, and false is alive.
	 */
	abstract boolean isDead();
}
