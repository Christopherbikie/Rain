package rain.level.tile;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.Level;

public class WaterTile extends Tile {

	public static final int MAP_COLOUR = 0xFF0000FF;
	
	public WaterTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}

	public static Tile getTile(int colour, int layer, int x, int y, Level level) {
		if (!level.isColour(0xFF0000FF, layer, x, y - 1)) {
			if (!level.isColour(0xFF0000FF, layer, x + 1, y)) {
				if (!level.isColour(0xFF0000FF, layer, x - 1, y)) {
					if (!level.isColour(0xFF0000FF, layer, x, y + 1))
						return Tile.waterGrassAllSides;
					return Tile.waterGrassAllSidesNotSouth;
				}
				if (!level.isColour(0xFF0000FF, layer, x, y + 1))
					return Tile.waterGrassAllSidesNotWest;
				if (!level.isColour(0xFF0000FF, layer, x - 1, y + 1))
					return Tile.waterGrassNorthAndEastAndSouthWest;
				return Tile.waterGrassNorthAndEast;
			}
			if (!level.isColour(0xFF0000FF, layer, x, y + 1)) {
				if (!level.isColour(0xFF0000FF, layer, x - 1, y))
					return Tile.waterGrassAllSidesNotEast;
				return Tile.waterGrassNorthAndSouth;
			}
			if (!level.isColour(0xFF0000FF, layer, x - 1, y)) {
				if (!level.isColour(0xFF0000FF, layer, x + 1, y + 1))
					return Tile.waterGrassNorthAndWestAndSouthEast;
				return Tile.waterGrassNorthAndWest;
			}
			if (!level.isColour(0xFF0000FF, layer, x + 1, y + 1)) {
				if (!level.isColour(0xFF0000FF, layer, x - 1, y + 1))
					return Tile.waterGrassNorthAndSouthEastAndSouthWest;
				return Tile.waterGrassNorthAndSouthEast;
			}
			if (!level.isColour(0xFF0000FF, layer, x - 1, y + 1))
				return Tile.waterGrassNorthAndSouthWest;
			return Tile.waterGrassNorth;
		}
		if (!level.isColour(0xFF0000FF, layer, x + 1, y)) {
			if (!level.isColour(0xFF0000FF, layer, x, y + 1)) {
				if (!level.isColour(0xFF0000FF, layer, x - 1, y))
					return Tile.waterGrassAllSidesNotNorth;
				if(!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
					return Tile.waterGrassSouthAndEastAndNorthWest;
				return Tile.waterGrassSouthAndEast;
			}
			if (!level.isColour(0xFF0000FF, layer, x - 1, y))
				return Tile.waterGrassEastAndWest;
			if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1)) {
				if (!level.isColour(0xFF0000FF, layer, x - 1, y + 1))
					return Tile.waterGrassEastAndSouthWestAndNorthWest;
				return Tile.waterGrassEastAndNorthWest;
			}
			if (!level.isColour(0xFF0000FF, layer, x - 1, y + 1))
				return Tile.waterGrassEastAndSouthWest;
			return Tile.waterGrassEast;
		}
		if (!level.isColour(0xFF0000FF, layer, x, y + 1)) {
			if (!level.isColour(0xFF0000FF, layer, x - 1, y)) {
				if (!level.isColour(0xFF0000FF, layer, x + 1, y - 1))
					return Tile.waterGrassSouthAndWestAndNorthEast;
				return Tile.waterGrassSouthAndWest;
			}
			if (!level.isColour(0xFF0000FF, layer, x + 1, y - 1)) {
				if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
					return Tile.waterGrassSouthAndNorthWestAndNorthEast;
				return Tile.waterGrassSouthAndNorthEast;
			}
			if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
				return Tile.waterGrassSouthAndNorthWest;
			
			return Tile.waterGrassSouth;
		}
		if (!level.isColour(0xFF0000FF, layer, x - 1, y)) {
			if (!level.isColour(0xFF0000FF, layer, x + 1, y - 1)) {
				if (!level.isColour(0xFF0000FF, layer, x + 1, y + 1))
					return Tile.waterGrassWestAndNorthEastAndSouthEast;
				return Tile.waterGrassWestAndNorthEast;
			}
			if (!level.isColour(0xFF0000FF, layer, x + 1, y + 1))
				return Tile.waterGrassWestAndSouthEast;
			return Tile.waterGrassWest;
		}
		if (!level.isColour(0xFF0000FF, layer, x + 1, y - 1)) {
			if (!level.isColour(0xFF0000FF, layer, x + 1, y + 1)) {
				if (!level.isColour(0xFF0000FF, layer, x - 1, y + 1)) {
					if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
						return Tile.waterGrassAllCorners;
					return Tile.waterGrassAllCornersNotNorthWest;
				}
				if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
					return Tile.waterGrassAllCornersNotSouthWest;
				return Tile.waterGrassNorthEastAndSouthEast;
			}
			if (!level.isColour(0xFF0000FF, layer, x - 1, y + 1)) {
				if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
					return Tile.waterGrassAllCornersNotSouthEast;
				return Tile.waterGrassNorthEastAndSouthWest;
			}
			if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1)) {
				if (!level.isColour(0xFF0000FF, layer, x + 1, y + 1))
					return Tile.waterGrassAllCornersNotSouthWest;
				return Tile.waterGrassNorthEastAndNorthWest;
			}
			return Tile.waterGrassNorthEast;
		}
		if (!level.isColour(0xFF0000FF, layer, x + 1, y + 1)) {
			if (!level.isColour(0xFF0000FF, layer, x - 1, y + 1)) {
				if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
					return Tile.waterGrassAllCornersNotNorthEast;
				return Tile.waterGrassSouthEastAndSouthWest;
			}
			if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
				return Tile.waterGrassSouthEastAndNorthWest;
			return Tile.waterGrassSouthEast;
		}
		if (!level.isColour(0xFF0000FF, layer, x - 1, y + 1)) {
			if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
				return Tile.waterGrassSouthWestAndNorthWest;
			return Tile.waterGrassSouthWest;
		}
		if (!level.isColour(0xFF0000FF, layer, x - 1, y - 1))
			return Tile.waterGrassNorthWest;
		return Tile.water;
	}
	
	public boolean isSolid() { 
		return true;
	}
}
