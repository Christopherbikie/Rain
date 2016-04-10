package rain.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	private String path;
	public final int WIDTH;
	public final int HEIGHT;
	public int[] pixels;
	
	public static SpriteSheet tiles = new SpriteSheet("/textures/sheets/spritesheet.png", 256, 256);
	public static SpriteSheet water = new SpriteSheet("/textures/sheets/water.png", 96, 144);
	public static SpriteSheet paths = new SpriteSheet("/textures/sheets/paths.png", 320, 160);
	public static SpriteSheet buildings = new SpriteSheet("/textures/sheets/buildings.png", 448, 208);
	public static SpriteSheet doors = new SpriteSheet("/textures/sheets/doors.png", 128, 48);
	public static SpriteSheet tallWindows = new SpriteSheet("/textures/sheets/tallwindows.png", 64, 32);
	public static SpriteSheet windows = new SpriteSheet("/textures/sheets/windows.png", 96, 16);
	
	public SpriteSheet(String path, int width, int height) {
		this.path = path;
		this.WIDTH = width;
		this.HEIGHT = height;
		pixels = new int[width * height];
		load();
	}
	
	public void load() {
		try {
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
