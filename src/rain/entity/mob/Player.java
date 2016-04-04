package rain.entity.mob;

import rain.graphics.Screen;
import rain.graphics.Sprite;
import rain.input.Keyboard;

public class Player extends Mob {
	private Keyboard input;
	private Sprite sprite;
	public int anim = 0;
	public boolean walking = false;
	
	public Player(Keyboard input) {
		this.input = input;
		sprite = Sprite.playerUp;
	}
	
	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
	}
	
	public void update() {
		int xa = 0, ya = 0;
		if (anim < 7500) anim++;
		else anim = 0;
		if (input.up) ya--;
		if (input.down) ya++;
		if (input.left) xa--;
		if (input.right) xa++;
		
		if (xa != 0 || ya != 0) {
			move(xa, ya);
			walking = true;
		} else
			walking = false;
	}
	
	public void render(Screen screen) {
		if (dir == 0) {
			sprite = Sprite.playerUp;
			if (walking)
				if (anim % 20 > 10)
					sprite = Sprite.playerUp1;
				else
					sprite = Sprite.playerUp2;
		}
		if (dir == 1 || dir == 3) {
			sprite = Sprite.playerSide;
			if (walking)
				if (anim % 20 > 10)
					sprite = Sprite.playerSide1;
				else
					sprite = Sprite.playerSide2;
		}
		if (dir == 2) {
			sprite = Sprite.playerDown;
			if (walking)
				if (anim % 20 > 10)
					sprite = Sprite.playerDown1;
				else
					sprite = Sprite.playerDown2;
		}
		int flip = dir == 3 ? 1 : 0;
		screen.renderPlayer(x - 16, y - 16, sprite, flip);
	}
}
