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
	}
	
	public void render(Screen screen) {
		screen.renderProjectile(x, y, this);
	}
}
