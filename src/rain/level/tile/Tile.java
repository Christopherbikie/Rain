package rain.level.tile;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.tile.buildings.Door;
import rain.level.tile.buildings.NormalWallBase;
import rain.level.tile.buildings.NormalWallTop;
import rain.level.tile.buildings.Window;
import rain.level.tile.buildings.WindowTall;
import rain.level.tile.floor.DirtFloorTile;
import rain.level.tile.floor.SandFloorTile;
import rain.level.tile.floor.StoneFloorTile;

public class Tile {
	public int x, y;
	public Sprite sprite;
	
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	public static Tile grass = new GrassTile(Sprite.grass);
	
	public static Tile water = new WaterTile(Sprite.water);
	public static Tile waterGrassNorth = new WaterTile(Sprite.waterGrassNorth);
	public static Tile waterGrassEast = new WaterTile(Sprite.waterGrassEast);
	public static Tile waterGrassSouth = new WaterTile(Sprite.waterGrassSouth);
	public static Tile waterGrassWest = new WaterTile(Sprite.waterGrassWest);
	public static Tile waterGrassNorthAndSouth = new WaterTile(Sprite.waterGrassNorthAndSouth);
	public static Tile waterGrassEastAndWest = new WaterTile(Sprite.waterGrassEastAndWest);
	public static Tile waterGrassNorthAndEast = new WaterTile(Sprite.waterGrassNorthAndEast);
	public static Tile waterGrassSouthAndEast = new WaterTile(Sprite.waterGrassSouthAndEast);
	public static Tile waterGrassSouthAndWest = new WaterTile(Sprite.waterGrassSouthAndWest);
	public static Tile waterGrassNorthAndWest = new WaterTile(Sprite.waterGrassNorthAndWest);
	public static Tile waterGrassNorthAndSouthEastAndSouthWest = new WaterTile(Sprite.waterGrassNorthAndSouthEastAndSouthWest);
	public static Tile waterGrassEastAndSouthWestAndNorthWest = new WaterTile(Sprite.waterGrassEastAndSouthWestAndNorthWest);
	public static Tile waterGrassSouthAndNorthWestAndNorthEast = new WaterTile(Sprite.waterGrassSouthAndNorthWestAndNorthEast);
	public static Tile waterGrassWestAndNorthEastAndSouthEast = new WaterTile(Sprite.waterGrassWestAndNorthEastAndSouthEast);
	public static Tile waterGrassNorthAndSouthWest = new WaterTile(Sprite.waterGrassNorthAndSouthWest);
	public static Tile waterGrassEastAndNorthWest = new WaterTile(Sprite.waterGrassEastAndNorthWest);
	public static Tile waterGrassSouthAndNorthEast = new WaterTile(Sprite.waterGrassSouthAndNorthEast);
	public static Tile waterGrassWestAndSouthEast = new WaterTile(Sprite.waterGrassWestAndSouthEast);
	public static Tile waterGrassNorthAndSouthEast = new WaterTile(Sprite.waterGrassNorthAndSouthEast);
	public static Tile waterGrassEastAndSouthWest = new WaterTile(Sprite.waterGrassEastAndSouthWest);
	public static Tile waterGrassSouthAndNorthWest = new WaterTile(Sprite.waterGrassSouthAndNorthWest);
	public static Tile waterGrassWestAndNorthEast = new WaterTile(Sprite.waterGrassWestAndNorthEast);
	public static Tile waterGrassNorthAndEastAndSouthWest = new WaterTile(Sprite.waterGrassNorthAndEastAndSouthWest);
	public static Tile waterGrassSouthAndEastAndNorthWest = new WaterTile(Sprite.waterGrassSouthAndEastAndNorthWest);
	public static Tile waterGrassSouthAndWestAndNorthEast = new WaterTile(Sprite.waterGrassSouthAndWestAndNorthEast);
	public static Tile waterGrassNorthAndWestAndSouthEast = new WaterTile(Sprite.waterGrassNorthAndWestAndSouthEast);
	public static Tile waterGrassNorthEast = new WaterTile(Sprite.waterGrassNorthEast);
	public static Tile waterGrassSouthEast = new WaterTile(Sprite.waterGrassSouthEast);
	public static Tile waterGrassSouthWest = new WaterTile(Sprite.waterGrassSouthWest);
	public static Tile waterGrassNorthWest = new WaterTile(Sprite.waterGrassNorthWest);
	public static Tile waterGrassNorthEastAndSouthWest = new WaterTile(Sprite.waterGrassNorthEastAndSouthWest);
	public static Tile waterGrassSouthEastAndNorthWest = new WaterTile(Sprite.waterGrassSouthEastAndNorthWest);
	public static Tile waterGrassNorthEastAndSouthEast = new WaterTile(Sprite.waterGrassNorthEastAndSouthEast);
	public static Tile waterGrassSouthEastAndSouthWest = new WaterTile(Sprite.waterGrassSouthEastAndSouthWest);
	public static Tile waterGrassSouthWestAndNorthWest = new WaterTile(Sprite.waterGrassSouthWestAndNorthWest);
	public static Tile waterGrassNorthEastAndNorthWest = new WaterTile(Sprite.waterGrassNorthEastAndNorthWest);
	public static Tile waterGrassAllSidesNotNorth = new WaterTile(Sprite.waterGrassAllSidesNotNorth);
	public static Tile waterGrassAllSidesNotEast = new WaterTile(Sprite.waterGrassAllSidesNotEast);
	public static Tile waterGrassAllSidesNotSouth = new WaterTile(Sprite.waterGrassAllSidesNotSouth);
	public static Tile waterGrassAllSidesNotWest = new WaterTile(Sprite.waterGrassAllSidesNotWest);
	public static Tile waterGrassAllCornersNotNorthEast = new WaterTile(Sprite.waterGrassAllCornersNotNorthEast);
	public static Tile waterGrassAllCornersNotSouthEast = new WaterTile(Sprite.waterGrassAllCornersNotSouthEast);
	public static Tile waterGrassAllCornersNotSouthWest = new WaterTile(Sprite.waterGrassAllCornersNotSouthWest);
	public static Tile waterGrassAllCornersNotNorthWest = new WaterTile(Sprite.waterGrassAllCornersNotNorthWest);
	public static Tile waterGrassAllSides = new WaterTile(Sprite.waterGrassAllSides);
	public static Tile waterGrassAllCorners = new WaterTile(Sprite.waterGrassAllCorners);
	
	public static Tile dirtFloorTile = new DirtFloorTile(Sprite.dirtFloorTile);	
	public static Tile stoneFloorTile = new StoneFloorTile(Sprite.stoneFloorTile);	
	public static Tile sandFloorTile = new SandFloorTile(Sprite.sandFloorTile);	
	
	public static Tile normalWallBase = new NormalWallBase(Sprite.normalWallBase);
	public static Tile normalWallBaseLeftEdge = new NormalWallBase(Sprite.normalWallBaseLeftEdge);
	public static Tile normalWallBaseRightEdge = new NormalWallBase(Sprite.normalWallBaseRightEdge);
	public static Tile normalWallBaseBothEdge = new NormalWallBase(Sprite.normalWallBaseBothEdge);
	public static Tile normalWall = new NormalWallBase(Sprite.normalWall);
	public static Tile normalWallLeftEdge = new NormalWallBase(Sprite.normalWallLeftEdge);
	public static Tile normalWallRightEdge = new NormalWallBase(Sprite.normalWallRightEdge);
	public static Tile normalWallBothEdge = new NormalWallBase(Sprite.normalWallBothEdge);
	public static Tile normalWallTop = new NormalWallTop(Sprite.normalWallTop);
	public static Tile normalWallTopNorth = new NormalWallTop(Sprite.normalWallTopNorth);
	public static Tile normalWallTopEast = new NormalWallTop(Sprite.normalWallTopEast);
	public static Tile normalWallTopSouth = new NormalWallTop(Sprite.normalWallTopSouth);
	public static Tile normalWallTopWest = new NormalWallTop(Sprite.normalWallTopWest);
	public static Tile normalWallTopNorthEast = new NormalWallTop(Sprite.normalWallTopNorthEast);
	public static Tile normalWallTopNorthSouth = new NormalWallTop(Sprite.normalWallTopNorthSouth);
	public static Tile normalWallTopEastSouth = new NormalWallTop(Sprite.normalWallTopEastSouth);
	public static Tile normalWallTopEastWest = new NormalWallTop(Sprite.normalWallTopEastWest);
	public static Tile normalWallTopSouthWest = new NormalWallTop(Sprite.normalWallTopSouthWest);
	public static Tile normalWallTopWestNorth = new NormalWallTop(Sprite.normalWallTopWestNorth);
	public static Tile normalWallTopNorthEastSouth = new NormalWallTop(Sprite.normalWallTopNorthEastSouth);
	public static Tile normalWallTopEastSouthWest = new NormalWallTop(Sprite.normalWallTopEastSouthWest);
	public static Tile normalWallTopSouthWestNorth = new NormalWallTop(Sprite.normalWallTopSouthWestNorth);
	public static Tile normalWallTopWestNorthEast = new NormalWallTop(Sprite.normalWallTopWestNorthEast);
	public static Tile normalWallTopAll = new NormalWallTop(Sprite.normalWallTopAll);

	public static Tile doorWoodClosed = new Door(Sprite.doorWoodClosed, Door.State.CLOSED);
	public static Tile doorWoodOpen = new Door(Sprite.doorWoodOpen, Door.State.OPEN);
	public static Tile doorWoodLocked = new Door(Sprite.doorWoodLocked, Door.State.LOCKED);

	public static Tile doorWoodWindowClosed = new Door(Sprite.doorWoodWindowClosed, Door.State.CLOSED);
	public static Tile doorWoodWindowOpen = new Door(Sprite.doorWoodWindowOpen, Door.State.OPEN);
	public static Tile doorWoodWindowLocked = new Door(Sprite.doorWoodWindowLocked, Door.State.LOCKED);

	public static Tile doorMetalClosed = new Door(Sprite.doorMetalClosed, Door.State.CLOSED);
	public static Tile doorMetalOpen = new Door(Sprite.doorMetalOpen, Door.State.OPEN);
	public static Tile doorMetalLocked = new Door(Sprite.doorMetalLocked, Door.State.LOCKED);

	public static Tile doorMetalWindowClosed = new Door(Sprite.doorMetalWindowClosed, Door.State.CLOSED);
	public static Tile doorMetalWindowOpen = new Door(Sprite.doorMetalWindowOpen, Door.State.OPEN);
	public static Tile doorMetalWindowLocked = new Door(Sprite.doorMetalWindowLocked, Door.State.LOCKED);

	public static Tile doorBarredClosed = new Door(Sprite.doorBarredClosed, Door.State.CLOSED);
	public static Tile doorBarredOpen = new Door(Sprite.doorBarredOpen, Door.State.OPEN);

	public static Tile doorBarredSlidingClosed = new Door(Sprite.doorBarredSlidingClosed, Door.State.CLOSED);
	public static Tile doorBarredSlidingOpen = new Door(Sprite.doorBarredSlidingOpen, Door.State.OPEN);

	public static Tile windowTall = new WindowTall(Sprite.windowTall);
	public static Tile windowTallOrange = new WindowTall(Sprite.windowTallOrange);
	public static Tile windowTallGreen = new WindowTall(Sprite.windowTallGreen);
	public static Tile windowTallBlue = new WindowTall(Sprite.windowTallBlue);

	public static Tile window = new Window(Sprite.window);
	public static Tile windowOrange = new Window(Sprite.windowOrange);
	public static Tile windowGreen = new Window(Sprite.windowGreen);
	public static Tile windowBlue = new Window(Sprite.windowBlue);
	public static Tile windowMetal = new Window(Sprite.windowMetal);
	public static Tile windowBarred = new Window(Sprite.windowBarred);
	
	public static Tile flowerBlue = new BlueFlowerTile(Sprite.flowerBlue);
	public static Tile flowerRed = new RedFlowerTile(Sprite.flowerRed);
	public static Tile flowerPurple = new RedFlowerTile(Sprite.flowerPurple);
	public static Tile flowerWhite = new RedFlowerTile(Sprite.flowerWhite);
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
		
	}
	
	public boolean isSolid() { 
		return false;
	}
}
