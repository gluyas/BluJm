/**
 * Created by Marc on 29/04/2016.
 */
public class Level {

	public static final int TILE_SIZE = 64;
	private Tile[][] tiles;

	public void draw() {
		for (int x = 0; x < tiles.length; x++) {
			for (int y = 0; y < tiles[x].length; x++) {
				tiles[x][y].draw(x*TILE_SIZE, y*TILE_SIZE);
			}
		}
	}

	/**
	 * Checks if a point is solid. ie: if an entity can pass through it
	 * @param x,y the position to check
	 * @return true if the tile at the specified position is solid or not
	 */
	public boolean isSolid(double x, double y) {
		return this.tiles[(int)x/TILE_SIZE][(int)y/TILE_SIZE].isSolid();
	}

}
