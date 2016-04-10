package rain.level.tile.floor;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.tile.Tile;

public class SandFloorTile extends Tile {

	public static final int MAP_COLOUR = 0xFFE6DABF;

	public SandFloorTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
}
