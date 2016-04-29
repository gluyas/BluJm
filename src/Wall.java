import ecs100.*;

import java.awt.*;

/**
 * Created by Marc on 29/04/2016.
 */
public class Wall implements Tile {

	/**
	 * Creates a wall, with adjacent walls on each of the specified sides
	 * @param N North side
	 * @param E East side
	 * @param S South side
	 * @param W West side
	 */
	public Wall(boolean N, boolean E, boolean S, boolean W) {

	}

	@Override
	public void draw(double x, double y) {
		UI.drawImage(new Image())
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
