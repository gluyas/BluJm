package crackson4.blujm.level;

import ecs100.*;

/**
 * Created by Marc on 29/04/2016.
 */
public class Floor implements Tile{

	private static final String imgPath = "assets/tiledirty.png";

	@Override
	public void draw(double x, double y) {
		UI.drawImage(imgPath, x, y);
	}

	@Override
	public boolean isSolid() {
		return false;
	}
}
