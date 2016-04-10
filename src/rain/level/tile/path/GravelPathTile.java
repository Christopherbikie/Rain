package rain.level.tile.path;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.Level;
import rain.level.tile.Tile;

public class GravelPathTile extends Path {
	
	public static final int TEXTURE_NUMBER = 1;
	public static final int MAP_COLOUR = 0xFF888888;

	public static Tile Normal = new GravelPathTile(Sprite.gravelPath);
	public static Tile North = new GravelPathTile(Sprite.gravelPathNorth);
	public static Tile East = new GravelPathTile(Sprite.gravelPathEast);
	public static Tile South = new GravelPathTile(Sprite.gravelPathSouth);
	public static Tile West = new GravelPathTile(Sprite.gravelPathWest);
	public static Tile NorthSouth = new GravelPathTile(Sprite.gravelPathNorthSouth);
	public static Tile EastWest = new GravelPathTile(Sprite.gravelPathEastWest);
	public static Tile NorthEast = new GravelPathTile(Sprite.gravelPathNorthEast);
	public static Tile EastSouth = new GravelPathTile(Sprite.gravelPathEastSouth);
	public static Tile WestSouth = new GravelPathTile(Sprite.gravelPathWestSouth);
	public static Tile NorthWest = new GravelPathTile(Sprite.gravelPathNorthWest);
	public static Tile NorthEastSouth = new GravelPathTile(Sprite.gravelPathNorthEastSouth);
	public static Tile EastSouthWest = new GravelPathTile(Sprite.gravelPathEastSouthWest);
	public static Tile NorthSouthWest = new GravelPathTile(Sprite.gravelPathNorthSouthWest);
	public static Tile NorthEastWest = new GravelPathTile(Sprite.gravelPathNorthEastWest);
	public static Tile NorthEastSouthWest = new GravelPathTile(Sprite.gravelPathNorthEastSouthWest);
	public static Tile AllSides = new GravelPathTile(Sprite.gravelPathAllSides);
	public static Tile NotNorth = new GravelPathTile(Sprite.gravelPathNotNorth);
	public static Tile NotEast = new GravelPathTile(Sprite.gravelPathNotEast);
	public static Tile NotSouth = new GravelPathTile(Sprite.gravelPathNotSouth);
	public static Tile NotWest = new GravelPathTile(Sprite.gravelPathNotWest);
	public static Tile NotNorthOrEast = new GravelPathTile(Sprite.gravelPathNotNorthOrEast);
	public static Tile NotEastOrSouth = new GravelPathTile(Sprite.gravelPathNotEastOrSouth);
	public static Tile NotSouthOrWest = new GravelPathTile(Sprite.gravelPathNotSouthOrWest);
	public static Tile NotNorthOrWest = new GravelPathTile(Sprite.gravelPathNotNorthOrWest);
	public static Tile NotNorthEast = new GravelPathTile(Sprite.gravelPathNotNorthEast);
	public static Tile NotSouthEast = new GravelPathTile(Sprite.gravelPathNotSouthEast);
	public static Tile NotSouthWest = new GravelPathTile(Sprite.gravelPathNotSouthWest);
	public static Tile NotNorthWest = new GravelPathTile(Sprite.gravelPathNotNorthWest);
	public static Tile NotNorthEastOrSouthWest = new GravelPathTile(Sprite.gravelPathNotNorthEastOrSouthWest);
	public static Tile NotSouthEastOrNorthWest = new GravelPathTile(Sprite.gravelPathNotSouthEastOrNorthWest);
	public static Tile NotNorthEastOrSouthEast = new GravelPathTile(Sprite.gravelPathNotNorthEastOrSouthEast);
	public static Tile NotSouthEastOrSouthWest = new GravelPathTile(Sprite.gravelPathNotSouthEastOrSouthWest);
	public static Tile NotSouthWestOrNorthWest = new GravelPathTile(Sprite.gravelPathNotSouthWestOrNorthWest);
	public static Tile NotNorthEastOrNorthWest = new GravelPathTile(Sprite.gravelPathNotNorthEastOrNorthWest);
	public static Tile OnlyCornerNorthEast = new GravelPathTile(Sprite.gravelPathOnlyCornerNorthEast);
	public static Tile OnlyCornerSouthEast = new GravelPathTile(Sprite.gravelPathOnlyCornerSouthEast);
	public static Tile OnlyCornerSouthWest = new GravelPathTile(Sprite.gravelPathOnlyCornerSouthWest);
	public static Tile OnlyCornerNorthWest = new GravelPathTile(Sprite.gravelPathOnlyCornerNorthWest);
	public static Tile NotNorthOrSouthWest = new GravelPathTile(Sprite.gravelPathNotNorthOrSouthWest);
	public static Tile NotEastOrNorthWest = new GravelPathTile(Sprite.gravelPathNotEastOrNorthWest);
	public static Tile NotSouthOrNorthEast = new GravelPathTile(Sprite.gravelPathNotSouthOrNorthEast);
	public static Tile NotWestOrSouthEast = new GravelPathTile(Sprite.gravelPathNotWestOrSouthEast);
	public static Tile NotNorthOrSouthEast = new GravelPathTile(Sprite.gravelPathNotNorthOrSouthEast);
	public static Tile NotEastOrSouthWest = new GravelPathTile(Sprite.gravelPathNotEastOrSouthWest);
	public static Tile NotSouthOrNorthWest = new GravelPathTile(Sprite.gravelPathNotSouthOrNorthWest);
	public static Tile NotWestOrNorthEast = new GravelPathTile(Sprite.gravelPathNotWestOrNorthEast);

	public GravelPathTile(Sprite sprite) {
		super(sprite);
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
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}

}
