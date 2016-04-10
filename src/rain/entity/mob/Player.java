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
		sprite = Sprite.player;
	}
	
	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
		sprite = Sprite.player;
		//enum enum enum
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
		//Code for rendering 32p directional sprite
//		if (dir == 0) {
//			sprite = Sprite.playerUp;
//			if (walking)
//				if (anim % 20 > 10)
//					sprite = Sprite.playerUp1;
//				else
//					sprite = Sprite.playerUp2;
//		}
//		if (dir == 1 || dir == 3) {
//			sprite = Sprite.playerSide;
//			if (walking)
//				if (anim % 20 > 10)
//					sprite = Sprite.playerSide1;
//				else
//					sprite = Sprite.playerSide2;
//		}
//		if (dir == 2) {
//			sprite = Sprite.playerDown;
//			if (walking)
//				if (anim % 20 > 10)
//					sprite = Sprite.playerDown1;
//				else
//					sprite = Sprite.playerDown2;
//		}
//		int flip = dir == 3 ? 1 : 0;
		sprite = Sprite.player;
		if (walking)
			if (anim % 40 < 10)
				sprite = Sprite.playerWalking1;
			else if (anim % 40 > 10 && anim % 40 < 20)
				sprite = Sprite.player;
			else if (anim % 40 > 20 && anim % 40 < 30)
				sprite = Sprite.playerWalking2;
			else
				sprite = Sprite.player;
		screen.renderPlayer(x - 16, y - 16, sprite/*, flip*/);
	}
}
