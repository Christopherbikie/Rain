package rain.level.tile;

import rain.graphics.Screen;
import rain.graphics.Sprite;

public class VoidTile extends Tile {

	public static final int MAP_COLOUR = 0xFFFF00FF;

	public VoidTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
	
	public boolean isSolid() { 
		return true;
	}
}
