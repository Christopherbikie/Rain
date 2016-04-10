package rain.entity.mob;

import rain.entity.Entity;
import rain.graphics.Sprite;

public abstract class Mob extends Entity {
	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move(int xa, int ya) {
		if (xa > 0) dir = 1;
		if (xa < 0) dir = 3;
		if (ya > 0) dir = 2;
		if (ya < 0) dir = 0;
		
		if (!collision()) {
			x += xa;
			y += ya;
		}
	}
	
	public void update() {
		
	}
	
	private boolean collision() {
		return false;
	}
	
	public void render() {
		
	}
	
	public int getXTile() {
		return x / 16;
	}
	
	public int getYTile() {
		return y / 16;
	}
}
