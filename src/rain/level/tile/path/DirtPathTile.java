package rain.level.tile.path;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.Level;
import rain.level.tile.Tile;

public class DirtPathTile extends Path {
	
	public static final int TEXTURE_NUMBER = 0;
	public static final int MAP_COLOUR = 0xFF663300;

	public static Tile Normal = new DirtPathTile(Sprite.dirtPath);
	public static Tile North = new DirtPathTile(Sprite.dirtPathNorth);
	public static Tile East = new DirtPathTile(Sprite.dirtPathEast);
	public static Tile South = new DirtPathTile(Sprite.dirtPathSouth);
	public static Tile West = new DirtPathTile(Sprite.dirtPathWest);
	public static Tile NorthSouth = new DirtPathTile(Sprite.dirtPathNorthSouth);
	public static Tile EastWest = new DirtPathTile(Sprite.dirtPathEastWest);
	public static Tile NorthEast = new DirtPathTile(Sprite.dirtPathNorthEast);
	public static Tile EastSouth = new DirtPathTile(Sprite.dirtPathEastSouth);
	public static Tile WestSouth = new DirtPathTile(Sprite.dirtPathWestSouth);
	public static Tile NorthWest = new DirtPathTile(Sprite.dirtPathNorthWest);
	public static Tile NorthEastSouth = new DirtPathTile(Sprite.dirtPathNorthEastSouth);
	public static Tile EastSouthWest = new DirtPathTile(Sprite.dirtPathEastSouthWest);
	public static Tile NorthSouthWest = new DirtPathTile(Sprite.dirtPathNorthSouthWest);
	public static Tile NorthEastWest = new DirtPathTile(Sprite.dirtPathNorthEastWest);
	public static Tile NorthEastSouthWest = new DirtPathTile(Sprite.dirtPathNorthEastSouthWest);
	public static Tile AllSides = new DirtPathTile(Sprite.dirtPathAllSides);
	public static Tile NotNorth = new DirtPathTile(Sprite.dirtPathNotNorth);
	public static Tile NotEast = new DirtPathTile(Sprite.dirtPathNotEast);
	public static Tile NotSouth = new DirtPathTile(Sprite.dirtPathNotSouth);
	public static Tile NotWest = new DirtPathTile(Sprite.dirtPathNotWest);
	public static Tile NotNorthOrEast = new DirtPathTile(Sprite.dirtPathNotNorthOrEast);
	public static Tile NotEastOrSouth = new DirtPathTile(Sprite.dirtPathNotEastOrSouth);
	public static Tile NotSouthOrWest = new DirtPathTile(Sprite.dirtPathNotSouthOrWest);
	public static Tile NotNorthOrWest = new DirtPathTile(Sprite.dirtPathNotNorthOrWest);
	public static Tile NotNorthEast = new DirtPathTile(Sprite.dirtPathNotNorthEast);
	public static Tile NotSouthEast = new DirtPathTile(Sprite.dirtPathNotSouthEast);
	public static Tile NotSouthWest = new DirtPathTile(Sprite.dirtPathNotSouthWest);
	public static Tile NotNorthWest = new DirtPathTile(Sprite.dirtPathNotNorthWest);
	public static Tile NotNorthEastOrSouthWest = new DirtPathTile(Sprite.dirtPathNotNorthEastOrSouthWest);
	public static Tile NotSouthEastOrNorthWest = new DirtPathTile(Sprite.dirtPathNotSouthEastOrNorthWest);
	public static Tile NotNorthEastOrSouthEast = new DirtPathTile(Sprite.dirtPathNotNorthEastOrSouthEast);
	public static Tile NotSouthEastOrSouthWest = new DirtPathTile(Sprite.dirtPathNotSouthEastOrSouthWest);
	public static Tile NotSouthWestOrNorthWest = new DirtPathTile(Sprite.dirtPathNotSouthWestOrNorthWest);
	public static Tile NotNorthEastOrNorthWest = new DirtPathTile(Sprite.dirtPathNotNorthEastOrNorthWest);
	public static Tile OnlyCornerNorthEast = new DirtPathTile(Sprite.dirtPathOnlyCornerNorthEast);
	public static Tile OnlyCornerSouthEast = new DirtPathTile(Sprite.dirtPathOnlyCornerSouthEast);
	public static Tile OnlyCornerSouthWest = new DirtPathTile(Sprite.dirtPathOnlyCornerSouthWest);
	public static Tile OnlyCornerNorthWest = new DirtPathTile(Sprite.dirtPathOnlyCornerNorthWest);
	public static Tile NotNorthOrSouthWest = new DirtPathTile(Sprite.dirtPathNotNorthOrSouthWest);
	public static Tile NotEastOrNorthWest = new DirtPathTile(Sprite.dirtPathNotEastOrNorthWest);
	public static Tile NotSouthOrNorthEast = new DirtPathTile(Sprite.dirtPathNotSouthOrNorthEast);
	public static Tile NotWestOrSouthEast = new DirtPathTile(Sprite.dirtPathNotWestOrSouthEast);
	public static Tile NotNorthOrSouthEast = new DirtPathTile(Sprite.dirtPathNotNorthOrSouthEast);
	public static Tile NotEastOrSouthWest = new DirtPathTile(Sprite.dirtPathNotEastOrSouthWest);
	public static Tile NotSouthOrNorthWest = new DirtPathTile(Sprite.dirtPathNotSouthOrNorthWest);
	public static Tile NotWestOrNorthEast = new DirtPathTile(Sprite.dirtPathNotWestOrNorthEast);
	
	public DirtPathTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
	
	public static Tile getTile(int colour, int layer, int x, int y, Level level) {
		if (level.isColour(colour, layer, x, y - 1)) {
			if (level.isColour(colour, layer, x + 1, y)) {
				if (level.isColour(colour, layer, x, y + 1)) {
					if (level.isColour(colour, layer, x - 1, y)) {
						if (level.isColour(colour, layer, x + 1, y - 1)) {
							if (level.isColour(colour, layer, x + 1, y + 1)) {
								if (level.isColour(colour, layer, x - 1, y + 1)) {
									if (level.isColour(colour, layer, x - 1, y - 1))
										return AllSides;
									return NotNorthWest;
								}
								if (level.isColour(colour, layer, x - 1, y - 1))
									return NotSouthWest;
								return NotSouthWestOrNorthWest;
							}
							if (level.isColour(colour, layer, x - 1, y + 1)) {
								if (level.isColour(colour, layer, x - 1, y - 1))
									return NotSouthEast;
								return NotSouthEastOrNorthWest;
							}
							if (level.isColour(colour, layer, x - 1, y - 1))
								return NotSouthEastOrSouthWest;
							return OnlyCornerNorthEast;
						}
						if (level.isColour(colour, layer, x + 1, y + 1)) {
							if (level.isColour(colour, layer, x - 1, y + 1)) {
								if (level.isColour(colour, layer, x - 1, y - 1))
									return NotNorthEast;
								return NotSouthEastOrSouthWest;
							}
							if (level.isColour(colour, layer, x - 1, y - 1))
								return NotNorthEastOrSouthWest;
							return OnlyCornerSouthEast;
						}
						if (level.isColour(colour, layer, x - 1, y + 1)) {
							if (level.isColour(colour, layer, x - 1, y - 1))
								return NotNorthEastOrSouthEast;
							return NotNorthEastOrSouthEast;
						}
						if (level.isColour(colour, layer, x - 1, y - 1))
							return OnlyCornerNorthWest;
						return NorthEastSouthWest;
					}
					if (level.isColour(colour, layer, x + 1, y - 1)) {
						if (level.isColour(colour, layer, x + 1, y + 1))
							return NotWest;
						return NotWestOrSouthEast;
					}
					if (level.isColour(colour, layer, x + 1, y + 1))
						return NotWestOrNorthEast;
					return NorthEastSouth;
				}
				if (level.isColour(colour, layer, x - 1, y)) {
					if (level.isColour(colour, layer, x + 1, y - 1)) {
						if (level.isColour(colour, layer, x - 1, y - 1))
							return NotSouth;
						return NotSouthEastOrNorthWest;
					}
					if (level.isColour(colour, layer, x - 1, y - 1))
						return NotSouthOrNorthEast;
					return NorthEastWest;
				}
				if (level.isColour(colour, layer, x + 1, y - 1))
					return NotSouthOrWest;
				return NorthEast;
			}
			if (level.isColour(colour, layer, x, y + 1)) {
				if (level.isColour(colour, layer, x - 1, y)) {
					if (level.isColour(colour, layer, x - 1, y + 1)) {
						if (level.isColour(colour, layer, x - 1, y - 1))
							return NotEast;
						return NotEastOrNorthWest;
					}
					if (level.isColour(colour, layer, x - 1, y - 1))
						return NotEastOrSouthWest;
					return NorthSouthWest;
				}
				return NorthSouth;
			}
			if (level.isColour(colour, layer, x - 1, y)) {
				if (level.isColour(colour, layer, x - 1, y - 1))
					return NotEastOrSouth;
				return NorthWest;
			}
			return North;
		}
		if ((level.isColour(colour, layer, x + 1, y))) {
			if (level.isColour(colour, layer, x, y + 1)) {
				if (level.isColour(colour, layer, x - 1, y))
					return NotNorth;
				if (level.isColour(colour, layer, x + 1, y + 1))
					return NotNorthOrWest;
				return EastSouth;
			}
			if (level.isColour(colour, layer, x - 1, y))
				return EastWest;
			return East;
		}
		if (level.isColour(colour, layer, x, y + 1)) {
			if (level.isColour(colour, layer, x - 1, y)) {
				if (level.isColour(colour, layer, x - 1, y + 1))
					return NotNorthOrEast;
				return WestSouth;
			}
			return South;
		}
		if (level.isColour(colour, layer, x - 1, y)) {
			return West;
		}
		return Normal;
	}
}
