package rain.level.tile.buildings;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.tile.Tile;

public class WindowTall extends Tile {
	
	public static final int TEXTURE_NUMBER_NORMAL = 0;
	public static final int TEXTURE_NUMBER_ORANGE = 1;
	public static final int TEXTURE_NUMBER_GREEN = 2;
	public static final int TEXTURE_NUMBER_BLUE = 3;
	public static final int MAP_COLOUR_NORMAL = 0xFFC8A480;
	public static final int MAP_COLOUR_ORANGE = 0xFFC8A481;
	public static final int MAP_COLOUR_GREEN = 0xFFC8A482;
	public static final int MAP_COLOUR_BLUE = 0xFFC8A483;

	public WindowTall(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
}
