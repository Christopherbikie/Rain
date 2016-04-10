package rain.level.tile;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.tile.Tile;

public class WhiteFlowerTile extends Tile {

	public static final int MAP_COLOUR = 0xFFDFDFDF;

	public WhiteFlowerTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
}
