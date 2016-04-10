package rain.level.tile.buildings;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.tile.Tile;

public class Window extends Tile {
	
	public static final int TEXTURE_NUMBER_NORMAL = 0;
	public static final int TEXTURE_NUMBER_ORANGE = 1;
	public static final int TEXTURE_NUMBER_GREEN = 2;
	public static final int TEXTURE_NUMBER_BLUE = 3;
	public static final int TEXTURE_NUMBER_METAL = 4;
	public static final int TEXTURE_NUMBER_BARRED = 5;
	public static final int MAP_COLOUR_NORMAL = 0xFF8F673F;
	public static final int MAP_COLOUR_ORANGE = 0xFF8F6740;
	public static final int MAP_COLOUR_GREEN = 0xFF8F6741;
	public static final int MAP_COLOUR_BLUE = 0xFF8F6742;
	public static final int MAP_COLOUR_METAL = 0xFF8F6743;
	public static final int MAP_COLOUR_BARRED = 0xFF8F6744;

	public Window(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
}
