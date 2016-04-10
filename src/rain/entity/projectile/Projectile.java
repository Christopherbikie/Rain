package rain.entity.projectile;

import rain.entity.Entity;
import rain.graphics.Sprite;

public abstract class Projectile extends Entity {
	
	protected final int xOrigin, yOrigin;
	protected double angle;
	protected Sprite sprite;
	protected double nx, ny;
	protected double speed, rateOfFire, range, damage;

	public Projectile(int x, int y, double dir) {
		this.x = x;
		this.y = y;
		xOrigin = x;
		yOrigin = y;
		angle = dir;
	}
	
	public Sprite getSprite() {
		return sprite;
	}

	public void update() {

	}

	protected void move() {
		
	}
}
