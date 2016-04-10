package rain.level.tile.buildings;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.Level;
import rain.level.tile.Tile;

public class NormalWall extends Tile {

	public static final int TEXTURE_NUMBER = 0;
	public static final int MAP_COLOUR = 0xFFD9CAA9;

	public NormalWall(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}

	public static Tile getTile(int colour, int layer, int x, int y, Level level) {
		if (level.isColour(colour, layer, x + 1, y) || level.isColour(NormalWallTop.MAP_COLOUR, layer, x + 1, y)) {
			if (level.isColour(colour, layer, x - 1, y) || level.isColour(NormalWallTop.MAP_COLOUR, layer, x - 1, y))
				return normalWall;
			return normalWallLeftEdge;
		}
		if (level.isColour(colour, layer, x - 1, y) || level.isColour(NormalWallTop.MAP_COLOUR, layer, x - 1, y))
			return normalWallRightEdge;
		return normalWallBothEdge;
	}
}
