package rain.entity.mob;

import rain.entity.Entity;
import rain.graphics.Sprite;
import rain.level.Level;

public abstract class Mob extends Entity {
	protected Sprite sprite;
	protected Level level;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move(int xa, int ya) {
		if (xa != 0 && ya != 0) {
			move(xa, 0);
			move(0, ya);
			return;
		}
		
		if (xa > 0) dir = 1;
		if (xa < 0) dir = 3;
		if (ya > 0) dir = 2;
		if (ya < 0) dir = 0;
		                    
		if (!collision(xa, ya)) {
			x += xa;
			y += ya;
		}
	}
	
	public void update() {
		
	}
	
	private boolean collision(int xa, int ya) {
		for (int c = 0; c < 4; c++) {
			int xt = ((x + xa) + c % 2 * 15 - 16) / 16;
			int yt = ((y + ya) + c / 2 * 3 - 4) / 16;
			if (level.getTile(xt, yt, 0).isSolid())
				return true;
		}
		return false;
	}
	
	public void render() {
		
	}
	
	public void init(Level level) {
		this.level = level;
	}
	
	public int getXTile() {
		return x / 16;
	}
	
	public int getYTile() {
		return y / 16;
	}
}
