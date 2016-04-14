package rain.entity.projectile;

import rain.graphics.Screen;
import rain.graphics.Sprite;

public class Arrow extends Projectile{

	public Arrow(int x, int y, double dir) {
		super(x, y, dir);
		range = 200;
		damage = 20;
		speed = 4;
		rateOfFire = 15;
		sprite = Sprite.arrow;
		nx = speed * Math.cos(angle);
		ny = speed * Math.sin(angle);
	}
	
	public void update() {
		move();
	}

	protected void move() {
		x += nx;
		y += ny;
		if (distance() > range)
			remove();
	}

	private double distance() {
		double distance = 0;
		distance = Math.sqrt(Math.abs((xOrigin - x) * (xOrigin - x)) + Math.abs((yOrigin - y) * (yOrigin - y)));
		return distance;
	}

	public void render(Screen screen) {
		screen.renderProjectile((int) x - 16, (int) y - 16, this);
	}
}
