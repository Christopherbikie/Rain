package rain.level.tile.buildings;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.level.tile.Tile;

public class Door extends Tile {
	
	public static enum State {CLOSED, OPEN, LOCKED};
	
	private State state = State.CLOSED;
	
	public static final int TEXTURE_NUMBER_WOOD = 0;
	public static final int MAP_COLOUR_CLOSED_WOOD = 0xFFB98B5E;
	public static final int MAP_COLOUR_OPEN_WOOD = 0xFFB98B5F;
	public static final int MAP_COLOUR_LOCKED_WOOD = 0xFFB98B60;
	
	public static final int TEXTURE_NUMBER_WOOD_WINDOW = 1;
	public static final int MAP_COLOUR_CLOSED_WOOD_WINDOW = 0xFFB98B61;
	public static final int MAP_COLOUR_OPEN_WOOD_WINDOW = 0xFFB98B62;
	public static final int MAP_COLOUR_LOCKED_WOOD_WINDOW = 0xFFB98B63;
	
	public static final int TEXTURE_NUMBER_METAL = 2;
	public static final int MAP_COLOUR_CLOSED_METAL = 0xFFB98B64;
	public static final int MAP_COLOUR_OPEN_METAL = 0xFFB98B65;
	public static final int MAP_COLOUR_LOCKED_METAL = 0xFFB98B66;
	
	public static final int TEXTURE_NUMBER_METAL_WINDOW = 3;
	public static final int MAP_COLOUR_CLOSED_METAL_WINDOW = 0xFFB98B67;
	public static final int MAP_COLOUR_OPEN_METAL_WINDOW = 0xFFB98B68;
	public static final int MAP_COLOUR_LOCKED_METAL_WINDOW = 0xFFB98B69;
	
	public static final int TEXTURE_NUMBER_BARRED = 4;
	public static final int MAP_COLOUR_CLOSED_BARRED = 0xFFB98B6A;
	public static final int MAP_COLOUR_OPEN_BARRED = 0xFFB98B6B;
	
	public static final int TEXTURE_NUMBER_BARRED_SLIDING = 5;
	public static final int MAP_COLOUR_CLOSED_BARRED_SLIDING = 0xFFB98B6C;
	public static final int MAP_COLOUR_OPEN_BARRED_SLIDING = 0xFFB98B6D;

	public Door(Sprite sprite) {
		super(sprite);
	}

	public Door(Sprite sprite, State state) {
		super(sprite);
		this.state = state;
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << screen.TILE_WIDTH, y << screen.TILE_HEIGHT, this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
}
