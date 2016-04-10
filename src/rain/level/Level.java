package rain.level;

import java.util.ArrayList;
import java.util.List;

import rain.entity.Entity;
import rain.entity.mob.Player;
import rain.graphics.Screen;
import rain.level.tile.BlueFlowerTile;
import rain.level.tile.GrassTile;
import rain.level.tile.PurpleFlowerTile;
import rain.level.tile.RedFlowerTile;
import rain.level.tile.Tile;
import rain.level.tile.WaterTile;
import rain.level.tile.WhiteFlowerTile;
import rain.level.tile.buildings.Door;
import rain.level.tile.buildings.NormalWall;
import rain.level.tile.buildings.NormalWallBase;
import rain.level.tile.buildings.NormalWallTop;
import rain.level.tile.buildings.Window;
import rain.level.tile.buildings.WindowTall;
import rain.level.tile.floor.DirtFloorTile;
import rain.level.tile.floor.SandFloorTile;
import rain.level.tile.floor.StoneFloorTile;
import rain.level.tile.path.DirtPathTile;
import rain.level.tile.path.GravelPathTile;

public class Level {
	protected int width, height, layers = 0;
	protected int[] tilesInt;
	protected int[] tiles1;
	protected int[] tiles2;
	protected int[] tiles3;
	protected int[] tiles4;
	
	private List<Entity> entities = new ArrayList<Entity>();
	
	public static Level spawn = new SpawnLevel("/levels/level1.png", "/levels/level2.png", "/levels/level3.png", "/levels/level4.png");

	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tilesInt = new int[width * height];
		generateLevel();
	}

	public Level(String path1, String path2, String path3, String path4) {
		loadLevel(path1, path2, path3, path4);
		generateLevel();
	}

	protected void generateLevel() {

	}

	protected void loadLevel(String path1, String path2, String path3, String path4) {

	}

	public void update() {
		for (Entity e : entities)
			e.update();
	}
	
	public void add(Entity e) {
		entities.add(e);
	}

	public void render(int xScroll, int yScroll, int layer, Screen screen, Player player) {
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> screen.TILE_WIDTH;
		int x1 = (xScroll + screen.width + 16) >> screen.TILE_WIDTH;
		int y0 = yScroll - 16 >> screen.TILE_HEIGHT;
		int y1 = (yScroll + screen.height + 16) >> screen.TILE_HEIGHT;

		for (int y = y0; y < y1; y++) {
			if (layer == 2 && player.getYTile() == y && !(getTile(player.getXTile(), y, layer) instanceof NormalWallBase ||
														  getTile(player.getXTile(), y, layer) instanceof NormalWall))
				player.render(screen);
			
			if (layer == 2 && player.getYTile() == y && (getTile(player.getXTile(), y, layer) instanceof NormalWallTop)) {
				getTile(player.getXTile() - 1, y - 1, layer).render(player.getXTile() - 1, y - 1, screen);
				getTile(player.getXTile(), y - 1, layer).render(player.getXTile(), y - 1, screen);
			}

			if (layer == 2 && player.getYTile() == y && (getTile(player.getXTile() - 1, y, layer) instanceof NormalWallTop)) {
				getTile(player.getXTile() - 1, y - 1, layer).render(player.getXTile() - 1, y - 1, screen);
				getTile(player.getXTile(), y - 1, layer).render(player.getXTile(), y - 1, screen);
			}
			
			if (layer == 3 && player.getYTile() == y && getTile(player.getXTile(), y - 1, layer) instanceof Door)
				player.render(screen);

			if (layer == 3 && player.getYTile() == y && getTile(player.getXTile() - 1, y - 1, layer) instanceof Door)
				player.render(screen);
			
			for (int x = x0; x < x1; x++)
				getTile(x, y, layer).render(x, y, screen);

			for (Entity e : entities)
				e.render(screen);
		}
	}
	
	public Tile getTile(int x, int y, int layer) {
		if (x < 0 || y < 0 || x >= width || y >= height)
			return Tile.voidTile;
		switch (layer) {
			case 0:
				switch (tiles1[x + y * width]) {
					case GrassTile.MAP_COLOUR: //0xFF00FF00
						return Tile.grass;
					case WaterTile.MAP_COLOUR: // 0xFF0000FF
						return WaterTile.getTile(WaterTile.MAP_COLOUR, layer, x, y, this);
					default:
						return Tile.voidTile;
				}
				
			case 1:
				switch (tiles2[x + y * width]) {
					case DirtPathTile.MAP_COLOUR: //0xFF663300
						return DirtPathTile.getTile(DirtPathTile.MAP_COLOUR, layer, x, y, this);
					case GravelPathTile.MAP_COLOUR: //0xFF888888
						return GravelPathTile.getTile(GravelPathTile.MAP_COLOUR, layer, x, y, this);
						
					case DirtFloorTile.MAP_COLOUR: //0xFFB98B5E
						return Tile.dirtFloorTile;
					case StoneFloorTile.MAP_COLOUR: //0xFFC2C2C2
						return Tile.stoneFloorTile;
					case SandFloorTile.MAP_COLOUR: //0xFFE6DABF
						return Tile.sandFloorTile;
						
					case BlueFlowerTile.MAP_COLOUR: //0xFF37AAA5
						return Tile.flowerBlue;
					case RedFlowerTile.MAP_COLOUR: //0xFFC66527
						return Tile.flowerRed;
					case PurpleFlowerTile.MAP_COLOUR: //0xFFAE72C2
						return Tile.flowerPurple;
					case WhiteFlowerTile.MAP_COLOUR: //0xFFDFDFDF
						return Tile.flowerWhite;
						
					default:
						return Tile.voidTile;
				}
				
			case 2:
				switch (tiles3[x + y * width]) {
					case NormalWallBase.MAP_COLOUR: //0xFF908570
						return NormalWallBase.getTile(NormalWallBase.MAP_COLOUR, layer, x, y, this);
					case NormalWall.MAP_COLOUR: //0xFFD9CAA9
						return NormalWall.getTile(NormalWall.MAP_COLOUR, layer, x, y, this);
					case NormalWallTop.MAP_COLOUR: //0xFFC4B79B
						return NormalWallTop.getTile(NormalWallTop.MAP_COLOUR, layer, x, y, this);
					default:
						return Tile.voidTile;
				}
				
			case 3:
				switch (tiles4[x + y * width]) {
					case Door.MAP_COLOUR_CLOSED_WOOD: //0xFFB98B5E
						return Tile.doorWoodClosed;
					case Door.MAP_COLOUR_OPEN_WOOD: //0xFFB98B5F
						return Tile.doorWoodOpen;
					case Door.MAP_COLOUR_LOCKED_WOOD: //0xFFB98B60
						return Tile.doorWoodLocked;
						
					case Door.MAP_COLOUR_CLOSED_WOOD_WINDOW: //0xFFB98B61
						return Tile.doorWoodWindowClosed;
					case Door.MAP_COLOUR_OPEN_WOOD_WINDOW: //0xFFB98B62
						return Tile.doorWoodWindowOpen;
					case Door.MAP_COLOUR_LOCKED_WOOD_WINDOW: //0xFFB98B63
						return Tile.doorWoodWindowLocked;
						
					case Door.MAP_COLOUR_CLOSED_METAL: //0xFFB98B64
						return Tile.doorMetalClosed;
					case Door.MAP_COLOUR_OPEN_METAL: //0xFFB98B65
						return Tile.doorMetalOpen;
					case Door.MAP_COLOUR_LOCKED_METAL: //0xFFB98B66
						return Tile.doorMetalLocked;
						
					case Door.MAP_COLOUR_CLOSED_METAL_WINDOW: //0xFFB98B67
						return Tile.doorMetalWindowClosed;
					case Door.MAP_COLOUR_OPEN_METAL_WINDOW: //0xFFB98B68
						return Tile.doorMetalWindowOpen;
					case Door.MAP_COLOUR_LOCKED_METAL_WINDOW: //0xFFB98B69
						return Tile.doorMetalWindowLocked;
						
					case Door.MAP_COLOUR_CLOSED_BARRED: //0xFFB98B6A
						return Tile.doorBarredClosed;
					case Door.MAP_COLOUR_OPEN_BARRED: //0xFFB98B6B
						return Tile.doorBarredOpen;
						
					case Door.MAP_COLOUR_CLOSED_BARRED_SLIDING: //0xFFB98B6C
						return Tile.doorBarredSlidingClosed;
					case Door.MAP_COLOUR_OPEN_BARRED_SLIDING: //0xFFB98B6D
						return Tile.doorBarredSlidingOpen;
						
					case WindowTall.MAP_COLOUR_NORMAL: //0xFFC8A480
						return Tile.windowTall;
					case WindowTall.MAP_COLOUR_ORANGE: //0xFFC8A481
						return Tile.windowTallOrange;
					case WindowTall.MAP_COLOUR_GREEN: //0xFFC8A482
						return Tile.windowTallGreen;
					case WindowTall.MAP_COLOUR_BLUE: //0xFFC8A483
						return Tile.windowTallBlue;

					case Window.MAP_COLOUR_NORMAL: //0xFF8F673F
						return Tile.window;
					case Window.MAP_COLOUR_ORANGE: //0xFF8F6740
						return Tile.windowOrange;
					case Window.MAP_COLOUR_GREEN: //0xFF8F6741
						return Tile.windowGreen;
					case Window.MAP_COLOUR_BLUE: //0xFF8F6742
						return Tile.windowBlue;
					case Window.MAP_COLOUR_METAL: //0xFF8F6743
						return Tile.windowMetal;
					case Window.MAP_COLOUR_BARRED: //0xFF8F6744
						return Tile.windowBarred;
						
					default:
						return Tile.voidTile;
				}
		}
		return Tile.voidTile;
	}
	
	//returns true if out of map bounds
	public boolean isColour(int colour, int layer, int x, int y) {
		if (x < 0 || x >= width || y < 0 || y >= height) {
			return true;
		}
		switch (layer){
			case 0:
				return tiles1[x + y * width] == colour;
			case 1:
				return tiles2[x + y * width] == colour;
			case 2:
				return tiles3[x + y * width] == colour;
			case 3:
				return tiles4[x + y * width] == colour;
		}
		return true;
	}
}
