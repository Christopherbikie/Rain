package rain.graphics;

import rain.entity.projectile.Projectile;
import rain.level.tile.Tile;

//import java.util.Random;

public class Screen {
	public final int TILE_WIDTH = 4;
	public final int TILE_HEIGHT = 4;
	
	public int width, height, xOffset, yOffset;
	public int[] pixels;

//	private Random random = new Random();

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height]; // 50400

//		for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
//			tiles[i] = random.nextInt(0xffffff);
//		}
	}

	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void renderTile(int xp, int yp, Tile tile) {
		xp -= xOffset;
		yp -= yOffset;
		for (int y = 0; y < tile.sprite.HEIGHT; y++) {
			int ya = y + yp;
			for (int x = 0; x < tile.sprite.WIDTH; x++) {
				int xa = x + xp;
				if (xa < -tile.sprite.WIDTH || xa >= width || ya < 0 || ya >= height) break;
				if (xa < 0) xa = 0;
				if (tile.sprite.pixels[x + y * tile.sprite.WIDTH] != 0xffff00ff) pixels[xa + ya * width] = tile.sprite.pixels[x + y * tile.sprite.WIDTH];
			}
		}
	}
	
	public void renderProjectile(int xp, int yp, Projectile p) {
		xp -= xOffset;
		yp -= yOffset;
		for (int y = 0; y < p.getSprite().HEIGHT; y++) {
			int ya = y + yp;
			for (int x = 0; x < p.getSprite().WIDTH; x++) {
				int xa = x + xp;
				if (xa < -p.getSprite().WIDTH || xa >= width || ya < 0 || ya >= height) break;
				if (xa < 0) xa = 0;
				if (p.getSprite().pixels[x + y * p.getSprite().WIDTH] != 0xffff00ff) pixels[xa + ya * width] = p.getSprite().pixels[x + y * p.getSprite().WIDTH];
			}
		}
	}
	
	//Flip parameter for not used
	public void renderPlayer(int xp, int yp, Sprite sprite/*, int flip*/) {
		xp -= xOffset;
		yp -= yOffset;
		for (int y = 0; y < 16; y++) {
			int ya = y + yp;
			int ys = y;
//			if (flip == 2 || flip == 3) ys = 31 - y;
			for (int x = 0; x < 16; x++) {
				int xa = x + xp;
				int xs = x;
//				if (flip == 1 || flip == 3) xs = 31 - x;
				if (xa < -16 || xa >= width || ya < 0 || ya >= height) break;
				if (xa < 0) xa = 0;
				int col = sprite.pixels[xs + ys * 16];
				if (col != 0xffff00ff) pixels[xa + ya * width] = col;
			}
		}
	}
	
	public void setOffset(int xOffset, int yOffset) {
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
}
