/**
 * Created by Marc on 29/04/2016.
 */
public interface Tile {

	/**
	 * Draw the tile at the specified position
	 */
	void draw(double x, double y);

	/**
	 * @return true if this tile cannot be passed through
	 */
	boolean isSolid();
}
