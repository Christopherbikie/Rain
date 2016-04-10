package rain.graphics;

import rain.level.tile.buildings.Door;
import rain.level.tile.buildings.NormalWall;
import rain.level.tile.buildings.Window;
import rain.level.tile.buildings.WindowTall;
import rain.level.tile.path.DirtPathTile;
import rain.level.tile.path.GravelPathTile;

public class Sprite {
	public final int WIDTH;
	public final int HEIGHT;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	//Tiles
	public static Sprite grass = new Sprite(16, 16, 0, 0, SpriteSheet.tiles);
	
	public static Sprite water = new Sprite(16, 16, 3, 1, SpriteSheet.water);
	public static Sprite waterGrassNorth = new Sprite(16, 16, 3, 0, SpriteSheet.water);
	public static Sprite waterGrassEast = new Sprite(16, 16, 4, 1, SpriteSheet.water);
	public static Sprite waterGrassSouth = new Sprite(16, 16, 3, 2, SpriteSheet.water);
	public static Sprite waterGrassWest = new Sprite(16, 16, 2, 1, SpriteSheet.water);
	public static Sprite waterGrassNorthAndSouth = new Sprite(16, 16, 4, 4, SpriteSheet.water);
	public static Sprite waterGrassEastAndWest = new Sprite(16, 16, 4, 3, SpriteSheet.water);
	public static Sprite waterGrassNorthAndEast = new Sprite(16, 16, 4, 0, SpriteSheet.water);
	public static Sprite waterGrassSouthAndEast = new Sprite(16, 16, 4, 2, SpriteSheet.water);
	public static Sprite waterGrassSouthAndWest = new Sprite(16, 16, 2, 2, SpriteSheet.water);
	public static Sprite waterGrassNorthAndWest = new Sprite(16, 16, 2, 0, SpriteSheet.water);
	public static Sprite waterGrassNorthAndSouthEastAndSouthWest = new Sprite(16, 16, 3, 5, SpriteSheet.water);
	public static Sprite waterGrassEastAndSouthWestAndNorthWest = new Sprite(16, 16, 3, 6, SpriteSheet.water);
	public static Sprite waterGrassSouthAndNorthWestAndNorthEast = new Sprite(16, 16, 2, 6, SpriteSheet.water);
	public static Sprite waterGrassWestAndNorthEastAndSouthEast = new Sprite(16, 16, 2, 5, SpriteSheet.water);
	public static Sprite waterGrassNorthAndSouthWest = new Sprite(16, 16, 5, 7, SpriteSheet.water);
	public static Sprite waterGrassEastAndNorthWest = new Sprite(16, 16, 5, 8, SpriteSheet.water);
	public static Sprite waterGrassSouthAndNorthEast = new Sprite(16, 16, 4, 8, SpriteSheet.water);
	public static Sprite waterGrassWestAndSouthEast = new Sprite(16, 16, 4, 7, SpriteSheet.water);
	public static Sprite waterGrassNorthAndSouthEast = new Sprite(16, 16, 3, 7, SpriteSheet.water);
	public static Sprite waterGrassEastAndSouthWest = new Sprite(16, 16, 3, 8, SpriteSheet.water);
	public static Sprite waterGrassSouthAndNorthWest = new Sprite(16, 16, 2, 8, SpriteSheet.water);
	public static Sprite waterGrassWestAndNorthEast = new Sprite(16, 16, 2, 7, SpriteSheet.water);
	public static Sprite waterGrassNorthAndEastAndSouthWest = new Sprite(16, 16, 3, 3, SpriteSheet.water);
	public static Sprite waterGrassSouthAndEastAndNorthWest = new Sprite(16, 16, 3, 4, SpriteSheet.water);
	public static Sprite waterGrassSouthAndWestAndNorthEast = new Sprite(16, 16, 2, 4, SpriteSheet.water);
	public static Sprite waterGrassNorthAndWestAndSouthEast = new Sprite(16, 16, 2, 3, SpriteSheet.water);
	public static Sprite waterGrassNorthEast = new Sprite(16, 16, 0, 2, SpriteSheet.water);
	public static Sprite waterGrassSouthEast = new Sprite(16, 16, 0, 1, SpriteSheet.water);
	public static Sprite waterGrassSouthWest = new Sprite(16, 16, 1, 1, SpriteSheet.water);
	public static Sprite waterGrassNorthWest = new Sprite(16, 16, 1, 2, SpriteSheet.water);
	public static Sprite waterGrassNorthEastAndSouthWest = new Sprite(16, 16, 4, 5, SpriteSheet.water);
	public static Sprite waterGrassSouthEastAndNorthWest = new Sprite(16, 16, 4, 6, SpriteSheet.water);
	public static Sprite waterGrassNorthEastAndSouthEast = new Sprite(16, 16, 0, 3, SpriteSheet.water);
	public static Sprite waterGrassSouthEastAndSouthWest = new Sprite(16, 16, 1, 3, SpriteSheet.water);
	public static Sprite waterGrassSouthWestAndNorthWest = new Sprite(16, 16, 1, 4, SpriteSheet.water);
	public static Sprite waterGrassNorthEastAndNorthWest = new Sprite(16, 16, 0, 4, SpriteSheet.water);
	public static Sprite waterGrassAllSidesNotNorth = new Sprite(16, 16, 0, 7, SpriteSheet.water);
	public static Sprite waterGrassAllSidesNotEast = new Sprite(16, 16, 1, 7, SpriteSheet.water);
	public static Sprite waterGrassAllSidesNotSouth = new Sprite(16, 16, 1, 8, SpriteSheet.water);
	public static Sprite waterGrassAllSidesNotWest = new Sprite(16, 16, 0, 8, SpriteSheet.water);
	public static Sprite waterGrassAllCornersNotNorthEast = new Sprite(16, 16, 1, 5, SpriteSheet.water);
	public static Sprite waterGrassAllCornersNotSouthEast = new Sprite(16, 16, 1, 6, SpriteSheet.water);
	public static Sprite waterGrassAllCornersNotSouthWest = new Sprite(16, 16, 0, 6, SpriteSheet.water);
	public static Sprite waterGrassAllCornersNotNorthWest = new Sprite(16, 16, 0, 5, SpriteSheet.water);
	public static Sprite waterGrassAllSides = new Sprite(16, 16, 0, 0, SpriteSheet.water);
	public static Sprite waterGrassAllCorners = new Sprite(16, 16, 1, 0, SpriteSheet.water);
	
	public static Sprite dirtPath = new Sprite(16, 16, 3 + 5 * DirtPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite dirtPathNorth = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite dirtPathEast = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite dirtPathSouth = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite dirtPathWest = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite dirtPathNorthSouth = new Sprite(16, 16, 4 + 5 * DirtPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite dirtPathEastWest = new Sprite(16, 16, 4 + 5 * DirtPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite dirtPathNorthEast = new Sprite(16, 16, 2 + 5 * DirtPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite dirtPathEastSouth = new Sprite(16, 16, 2 + 5 * DirtPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite dirtPathWestSouth = new Sprite(16, 16, 3 + 5 * DirtPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite dirtPathNorthWest = new Sprite(16, 16, 3 + 5 * DirtPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite dirtPathNorthEastSouth = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite dirtPathEastSouthWest = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite dirtPathNorthSouthWest = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite dirtPathNorthEastWest = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite dirtPathNorthEastSouthWest = new Sprite(16, 16, 2 + 5 * DirtPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite dirtPathAllSides = new Sprite(16, 16, 3 + 5 * DirtPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite dirtPathNotNorth = new Sprite(16, 16, 3 + 5 * DirtPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite dirtPathNotEast = new Sprite(16, 16, 4 + 5 * DirtPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite dirtPathNotSouth = new Sprite(16, 16, 3 + 5 * DirtPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite dirtPathNotWest = new Sprite(16, 16, 2 + 5 * DirtPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite dirtPathNotNorthOrEast = new Sprite(16, 16, 4 + 5 * DirtPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite dirtPathNotEastOrSouth = new Sprite(16, 16, 4 + 5 * DirtPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite dirtPathNotSouthOrWest = new Sprite(16, 16, 2 + 5 * DirtPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite dirtPathNotNorthOrWest = new Sprite(16, 16, 2 + 5 * DirtPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite dirtPathNotNorthEast = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite dirtPathNotSouthEast = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite dirtPathNotSouthWest = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite dirtPathNotNorthWest = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite dirtPathNotNorthEastOrSouthWest = new Sprite(16, 16, 4 + 5 * DirtPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite dirtPathNotSouthEastOrNorthWest = new Sprite(16, 16, 4 + 5 * DirtPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite dirtPathNotNorthEastOrSouthEast = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 7, SpriteSheet.paths);
	public static Sprite dirtPathNotSouthEastOrSouthWest = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite dirtPathNotSouthWestOrNorthWest = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite dirtPathNotNorthEastOrNorthWest = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 7, SpriteSheet.paths);
	public static Sprite dirtPathOnlyCornerNorthEast = new Sprite(16, 16, 3 + 5 * DirtPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite dirtPathOnlyCornerSouthEast = new Sprite(16, 16, 3 + 5 * DirtPathTile.TEXTURE_NUMBER, 7, SpriteSheet.paths);
	public static Sprite dirtPathOnlyCornerSouthWest = new Sprite(16, 16, 2 + 5 * DirtPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite dirtPathOnlyCornerNorthWest = new Sprite(16, 16, 2 + 5 * DirtPathTile.TEXTURE_NUMBER, 7, SpriteSheet.paths);
	public static Sprite dirtPathNotNorthOrSouthWest = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 8, SpriteSheet.paths);
	public static Sprite dirtPathNotEastOrNorthWest = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 9, SpriteSheet.paths);
	public static Sprite dirtPathNotSouthOrNorthEast = new Sprite(16, 16, 1 + 5 * DirtPathTile.TEXTURE_NUMBER, 9, SpriteSheet.paths);
	public static Sprite dirtPathNotWestOrSouthEast = new Sprite(16, 16, 0 + 5 * DirtPathTile.TEXTURE_NUMBER, 8, SpriteSheet.paths);
	public static Sprite dirtPathNotNorthOrSouthEast = new Sprite(16, 16, 3 + 5 * DirtPathTile.TEXTURE_NUMBER, 8, SpriteSheet.paths);
	public static Sprite dirtPathNotEastOrSouthWest = new Sprite(16, 16, 4 + 5 * DirtPathTile.TEXTURE_NUMBER, 8, SpriteSheet.paths);
	public static Sprite dirtPathNotSouthOrNorthWest = new Sprite(16, 16, 4 + 5 * DirtPathTile.TEXTURE_NUMBER, 9, SpriteSheet.paths);
	public static Sprite dirtPathNotWestOrNorthEast = new Sprite(16, 16, 2 + 5 * DirtPathTile.TEXTURE_NUMBER, 9, SpriteSheet.paths);

	public static Sprite gravelPath = new Sprite(16, 16, 3 + 5 * GravelPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite gravelPathNorth = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite gravelPathEast = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite gravelPathSouth = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite gravelPathWest = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite gravelPathNorthSouth = new Sprite(16, 16, 4 + 5 * GravelPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite gravelPathEastWest = new Sprite(16, 16, 4 + 5 * GravelPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite gravelPathNorthEast = new Sprite(16, 16, 2 + 5 * GravelPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite gravelPathEastSouth = new Sprite(16, 16, 2 + 5 * GravelPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite gravelPathWestSouth = new Sprite(16, 16, 3 + 5 * GravelPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite gravelPathNorthWest = new Sprite(16, 16, 3 + 5 * GravelPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite gravelPathNorthEastSouth = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite gravelPathEastSouthWest = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite gravelPathNorthSouthWest = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 0, SpriteSheet.paths);
	public static Sprite gravelPathNorthEastWest = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 1, SpriteSheet.paths);
	public static Sprite gravelPathNorthEastSouthWest = new Sprite(16, 16, 2 + 5 * GravelPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite gravelPathAllSides = new Sprite(16, 16, 3 + 5 * GravelPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite gravelPathNotNorth = new Sprite(16, 16, 3 + 5 * GravelPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite gravelPathNotEast = new Sprite(16, 16, 4 + 5 * GravelPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite gravelPathNotSouth = new Sprite(16, 16, 3 + 5 * GravelPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite gravelPathNotWest = new Sprite(16, 16, 2 + 5 * GravelPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite gravelPathNotNorthOrEast = new Sprite(16, 16, 4 + 5 * GravelPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite gravelPathNotEastOrSouth = new Sprite(16, 16, 4 + 5 * GravelPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite gravelPathNotSouthOrWest = new Sprite(16, 16, 2 + 5 * GravelPathTile.TEXTURE_NUMBER, 4, SpriteSheet.paths);
	public static Sprite gravelPathNotNorthOrWest = new Sprite(16, 16, 2 + 5 * GravelPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite gravelPathNotNorthEast = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite gravelPathNotSouthEast = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite gravelPathNotSouthWest = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 2, SpriteSheet.paths);
	public static Sprite gravelPathNotNorthWest = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 3, SpriteSheet.paths);
	public static Sprite gravelPathNotNorthEastOrSouthWest = new Sprite(16, 16, 4 + 5 * GravelPathTile.TEXTURE_NUMBER, 5, SpriteSheet.paths);
	public static Sprite gravelPathNotSouthEastOrNorthWest = new Sprite(16, 16, 4 + 5 * GravelPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite gravelPathNotNorthEastOrSouthEast = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 7, SpriteSheet.paths);
	public static Sprite gravelPathNotSouthEastOrSouthWest = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite gravelPathNotSouthWestOrNorthWest = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite gravelPathNotNorthEastOrNorthWest = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 7, SpriteSheet.paths);
	public static Sprite gravelPathOnlyCornerNorthEast = new Sprite(16, 16, 3 + 5 * GravelPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite gravelPathOnlyCornerSouthEast = new Sprite(16, 16, 3 + 5 * GravelPathTile.TEXTURE_NUMBER, 7, SpriteSheet.paths);
	public static Sprite gravelPathOnlyCornerSouthWest = new Sprite(16, 16, 2 + 5 * GravelPathTile.TEXTURE_NUMBER, 6, SpriteSheet.paths);
	public static Sprite gravelPathOnlyCornerNorthWest = new Sprite(16, 16, 2 + 5 * GravelPathTile.TEXTURE_NUMBER, 7, SpriteSheet.paths);
	public static Sprite gravelPathNotNorthOrSouthWest = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 8, SpriteSheet.paths);
	public static Sprite gravelPathNotEastOrNorthWest = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 9, SpriteSheet.paths);
	public static Sprite gravelPathNotSouthOrNorthEast = new Sprite(16, 16, 1 + 5 * GravelPathTile.TEXTURE_NUMBER, 9, SpriteSheet.paths);
	public static Sprite gravelPathNotWestOrSouthEast = new Sprite(16, 16, 0 + 5 * GravelPathTile.TEXTURE_NUMBER, 8, SpriteSheet.paths);
	public static Sprite gravelPathNotNorthOrSouthEast = new Sprite(16, 16, 3 + 5 * GravelPathTile.TEXTURE_NUMBER, 8, SpriteSheet.paths);
	public static Sprite gravelPathNotEastOrSouthWest = new Sprite(16, 16, 4 + 5 * GravelPathTile.TEXTURE_NUMBER, 8, SpriteSheet.paths);
	public static Sprite gravelPathNotSouthOrNorthWest = new Sprite(16, 16, 4 + 5 * GravelPathTile.TEXTURE_NUMBER, 9, SpriteSheet.paths);
	public static Sprite gravelPathNotWestOrNorthEast = new Sprite(16, 16, 2 + 5 * GravelPathTile.TEXTURE_NUMBER, 9, SpriteSheet.paths);
	
	public static Sprite dirtFloorTile = new Sprite(16, 16, 5, 0, SpriteSheet.tiles);
	public static Sprite stoneFloorTile = new Sprite(16, 16, 6, 0, SpriteSheet.tiles);
	public static Sprite sandFloorTile = new Sprite(16, 16, 7, 0, SpriteSheet.tiles);
	
	public static Sprite normalWallBase = new Sprite(16, 16, 0 + 7 * NormalWall.TEXTURE_NUMBER, 3, SpriteSheet.buildings);
	public static Sprite normalWallBaseLeftEdge = new Sprite(16, 16, 1 + 7 * NormalWall.TEXTURE_NUMBER, 3, SpriteSheet.buildings);
	public static Sprite normalWallBaseRightEdge = new Sprite(16, 16, 3 + 7 * NormalWall.TEXTURE_NUMBER, 3, SpriteSheet.buildings);
	public static Sprite normalWallBaseBothEdge = new Sprite(16, 16, 2 + 7 * NormalWall.TEXTURE_NUMBER, 3, SpriteSheet.buildings);
	public static Sprite normalWall = new Sprite(16, 16, 5 + 7 * NormalWall.TEXTURE_NUMBER, 3, SpriteSheet.buildings);
	public static Sprite normalWallLeftEdge = new Sprite(16, 16, 4 + 7 * NormalWall.TEXTURE_NUMBER, 3, SpriteSheet.buildings);
	public static Sprite normalWallRightEdge = new Sprite(16, 16, 6 + 7 * NormalWall.TEXTURE_NUMBER, 3, SpriteSheet.buildings);
	public static Sprite normalWallBothEdge = new Sprite(16, 16, 5 + 7 * NormalWall.TEXTURE_NUMBER, 12, SpriteSheet.buildings);
	public static Sprite normalWallTop = new Sprite(16, 16, 6 + 7 * NormalWall.TEXTURE_NUMBER, 12, SpriteSheet.buildings);
	public static Sprite normalWallTopNorth = new Sprite(16, 16, 0 + 7 * NormalWall.TEXTURE_NUMBER, 2, SpriteSheet.buildings);
	public static Sprite normalWallTopEast = new Sprite(16, 16, 0 + 7 * NormalWall.TEXTURE_NUMBER, 0, SpriteSheet.buildings);
	public static Sprite normalWallTopSouth = new Sprite(16, 16, 0 + 7 * NormalWall.TEXTURE_NUMBER, 1, SpriteSheet.buildings);
	public static Sprite normalWallTopWest = new Sprite(16, 16, 2 + 7 * NormalWall.TEXTURE_NUMBER, 0, SpriteSheet.buildings);
	public static Sprite normalWallTopNorthEast = new Sprite(16, 16, 3 + 7 * NormalWall.TEXTURE_NUMBER, 1, SpriteSheet.buildings);
	public static Sprite normalWallTopNorthSouth = new Sprite(16, 16, 2 + 7 * NormalWall.TEXTURE_NUMBER, 1, SpriteSheet.buildings);
	public static Sprite normalWallTopEastSouth = new Sprite(16, 16, 3 + 7 * NormalWall.TEXTURE_NUMBER, 0, SpriteSheet.buildings);
	public static Sprite normalWallTopEastWest = new Sprite(16, 16, 1 + 7 * NormalWall.TEXTURE_NUMBER, 0, SpriteSheet.buildings);
	public static Sprite normalWallTopSouthWest = new Sprite(16, 16, 4 + 7 * NormalWall.TEXTURE_NUMBER, 0, SpriteSheet.buildings);
	public static Sprite normalWallTopWestNorth = new Sprite(16, 16, 4 + 7 * NormalWall.TEXTURE_NUMBER, 1, SpriteSheet.buildings);
	public static Sprite normalWallTopNorthEastSouth = new Sprite(16, 16, 5 + 7 * NormalWall.TEXTURE_NUMBER, 0, SpriteSheet.buildings);
	public static Sprite normalWallTopEastSouthWest = new Sprite(16, 16, 6 + 7 * NormalWall.TEXTURE_NUMBER, 1, SpriteSheet.buildings);
	public static Sprite normalWallTopSouthWestNorth = new Sprite(16, 16, 5 + 7 * NormalWall.TEXTURE_NUMBER, 1, SpriteSheet.buildings);
	public static Sprite normalWallTopWestNorthEast = new Sprite(16, 16, 6 + 7 * NormalWall.TEXTURE_NUMBER, 0, SpriteSheet.buildings);
	public static Sprite normalWallTopAll = new Sprite(16, 16, 1 + 7 * NormalWall.TEXTURE_NUMBER, 1, SpriteSheet.buildings);

	public static Sprite doorWoodClosed = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_WOOD, 0, SpriteSheet.doors);
	public static Sprite doorWoodOpen = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_WOOD, 1, SpriteSheet.doors);
	public static Sprite doorWoodLocked = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_WOOD, 2, SpriteSheet.doors);
	
	public static Sprite doorWoodWindowClosed = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_WOOD_WINDOW, 0, SpriteSheet.doors);
	public static Sprite doorWoodWindowOpen = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_WOOD_WINDOW, 1, SpriteSheet.doors);
	public static Sprite doorWoodWindowLocked = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_WOOD_WINDOW, 2, SpriteSheet.doors);
	
	public static Sprite doorMetalClosed = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_METAL, 0, SpriteSheet.doors);
	public static Sprite doorMetalOpen = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_METAL, 1, SpriteSheet.doors);
	public static Sprite doorMetalLocked = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_METAL, 2, SpriteSheet.doors);
	
	public static Sprite doorMetalWindowClosed = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_METAL_WINDOW, 0, SpriteSheet.doors);
	public static Sprite doorMetalWindowOpen = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_METAL_WINDOW, 1, SpriteSheet.doors);
	public static Sprite doorMetalWindowLocked = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_METAL_WINDOW, 2, SpriteSheet.doors);
	
	public static Sprite doorBarredClosed = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_BARRED, 0, SpriteSheet.doors);
	public static Sprite doorBarredOpen = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_BARRED, 1, SpriteSheet.doors);
	
	public static Sprite doorBarredSlidingClosed = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_BARRED_SLIDING, 0, SpriteSheet.doors);
	public static Sprite doorBarredSlidingOpen = new Sprite(16, 16, 0 + Door.TEXTURE_NUMBER_BARRED_SLIDING, 1, SpriteSheet.doors);

	public static Sprite windowTall = new Sprite(16, 32, 0 + WindowTall.TEXTURE_NUMBER_NORMAL, 0, SpriteSheet.tallWindows);
	public static Sprite windowTallOrange = new Sprite(16, 32, 0 + WindowTall.TEXTURE_NUMBER_ORANGE, 0, SpriteSheet.tallWindows);
	public static Sprite windowTallGreen = new Sprite(16, 32, 0 + WindowTall.TEXTURE_NUMBER_GREEN, 0, SpriteSheet.tallWindows);
	public static Sprite windowTallBlue = new Sprite(16, 32, 0 + WindowTall.TEXTURE_NUMBER_BLUE, 0, SpriteSheet.tallWindows);

	public static Sprite window = new Sprite(16, 16, 0 + Window.TEXTURE_NUMBER_NORMAL, 0, SpriteSheet.windows);
	public static Sprite windowOrange = new Sprite(16, 16, 0 + Window.TEXTURE_NUMBER_ORANGE, 0, SpriteSheet.windows);
	public static Sprite windowGreen = new Sprite(16, 16, 0 + Window.TEXTURE_NUMBER_GREEN, 0, SpriteSheet.windows);
	public static Sprite windowBlue = new Sprite(16, 16, 0 + Window.TEXTURE_NUMBER_BLUE, 0, SpriteSheet.windows);
	public static Sprite windowMetal = new Sprite(16, 16, 0 + Window.TEXTURE_NUMBER_METAL, 0, SpriteSheet.windows);
	public static Sprite windowBarred = new Sprite(16, 16, 0 + Window.TEXTURE_NUMBER_BARRED, 0, SpriteSheet.windows);

	public static Sprite flowerBlue = new Sprite(16, 16, 1, 0, SpriteSheet.tiles);
	public static Sprite flowerRed = new Sprite(16, 16, 2, 0, SpriteSheet.tiles);
	public static Sprite flowerPurple = new Sprite(16, 16, 3, 0, SpriteSheet.tiles);
	public static Sprite flowerWhite = new Sprite(16, 16, 4, 0, SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16, 16, 0xFFFF00FF);
	
	//Player
	public static Sprite player = new Sprite(16, 16, 0, 13, SpriteSheet.tiles);
	public static Sprite playerWalking1 = new Sprite(16, 16, 0, 14, SpriteSheet.tiles);
	public static Sprite playerWalking2 = new Sprite(16, 16, 0, 15, SpriteSheet.tiles);
	
	//Projectiles
	public static Sprite arrow = new Sprite(16, 16, 0, 0, SpriteSheet.arrows);
	
//	Old King Cherno Sprite
//	public static Sprite playerUp = new Sprite(32, 0, 5, SpriteSheet.tiles);
//	public static Sprite playerSide = new Sprite(32, 1, 5, SpriteSheet.tiles);
//	public static Sprite playerDown = new Sprite(32, 2, 5, SpriteSheet.tiles);
//
//	public static Sprite playerUp1 = new Sprite(32, 0, 6, SpriteSheet.tiles);
//	public static Sprite playerUp2 = new Sprite(32, 0, 7, SpriteSheet.tiles);
//	
//	public static Sprite playerSide1 = new Sprite(32, 1, 6, SpriteSheet.tiles);
//	public static Sprite playerSide2 = new Sprite(32, 1, 7, SpriteSheet.tiles);
//	
//	public static Sprite playerDown1 = new Sprite(32, 2, 6, SpriteSheet.tiles);
//	public static Sprite playerDown2 = new Sprite(32, 2, 7, SpriteSheet.tiles);

	public Sprite(int width, int height, int x, int y, SpriteSheet sheet) {
		this.WIDTH = width;
		this.HEIGHT = height;
		pixels = new int[width * height];
		this.x = x * width;
		this.y = y * height;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int width, int height, int colour) {
		this.WIDTH = width;
		this.HEIGHT = height;
		pixels = new int[width * height];
		setColour(colour);
	}
	
	private void setColour(int colour) {
		for (int i = 0; i < pixels.length; i++)
			pixels[i] = colour;
	}

	private void load() {
		for (int y = 0; y < HEIGHT; y++)
			for (int x = 0; x < WIDTH; x++)
				pixels[x + y * WIDTH] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.WIDTH];
	}
}
