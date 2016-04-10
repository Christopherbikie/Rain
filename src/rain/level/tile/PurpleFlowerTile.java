package rain.level.tile;

import rain.graphics.Screen;
import rain.graphics.Sprite;

public class PurpleFlowerTile extends Tile {

	public static final int MAP_COLOUR = 0xFFAE72C2;

	public PurpleFlowerTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
}
