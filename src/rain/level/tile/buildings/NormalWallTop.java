package rain.level.tile.buildings;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.Level;
import rain.level.tile.Tile;

public class NormalWallTop extends Tile {

	public static final int MAP_COLOUR = 0xFFC4B79B;

	public NormalWallTop(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}

	public static Tile getTile(int colour, int layer, int x, int y, Level level) {
		if (level.isColour(colour, layer, x, y - 1)) {
			if (level.isColour(colour, layer, x + 1, y)) {
				if (level.isColour(colour, layer, x, y + 1)) {
					if (level.isColour(colour, layer, x - 1, y))
						return normalWallTopAll;
					return normalWallTopNorthEastSouth;
				}
				if (level.isColour(colour, layer, x - 1, y))
					return normalWallTopWestNorthEast;
				return normalWallTopNorthEast;
			}
			if (level.isColour(colour, layer, x, y + 1)) {
				if (level.isColour(colour, layer, x - 1, y)) {
					return normalWallTopSouthWestNorth;
				}
				return normalWallTopNorthSouth;
			}
			if (level.isColour(colour, layer, x - 1, y))
				return normalWallTopWestNorth;
			return normalWallTopNorth;
		}
		if (level.isColour(colour, layer, x + 1, y)) {
			if (level.isColour(colour, layer, x, y + 1)) {
				if (level.isColour(colour, layer, x - 1, y))
					return normalWallTopEastSouthWest;
				return normalWallTopEastSouth;
			}
			if (level.isColour(colour, layer, x - 1, y))
				return normalWallTopEastWest;
			return normalWallTopEast;
		}
		if (level.isColour(colour, layer, x, y + 1)) {
			if (level.isColour(colour, layer, x - 1, y))
				return normalWallTopSouthWest;
			return normalWallTopSouth;
		}
		if (level.isColour(colour, layer, x - 1, y))
			return normalWallTopWest;
		return normalWallTop;
	}
}
