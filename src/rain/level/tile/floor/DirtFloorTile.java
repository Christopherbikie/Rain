package rain.level.tile.floor;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.tile.Tile;

public class DirtFloorTile extends Tile {

	public static final int MAP_COLOUR = 0xFFB98B5E;

	public DirtFloorTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
}
