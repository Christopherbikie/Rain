package rain.level.tile;

import rain.graphics.Screen;
import rain.graphics.Sprite;

public class GrassTile extends Tile {

	public static final int MAP_COLOUR = 0xFF00FF00;

	public GrassTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
}
