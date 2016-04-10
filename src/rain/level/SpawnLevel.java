package rain.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpawnLevel extends Level {
	
	public SpawnLevel(String path1, String path2, String path3, String path4) {
		super(path1, path2, path3, path4);
	}

	protected void loadLevel(String path1, String path2, String path3, String path4) {
		try {
			BufferedImage image1 = ImageIO.read(SpawnLevel.class.getResource(path1));
			int w = width = image1.getWidth();
			int h = height = image1.getHeight();
			tiles1 = new int[w * h];
			image1.getRGB(0, 0, w, h, tiles1, 0, w);
			layers++;
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Exception! Could not load level file 1");
		}
		
		try {
			BufferedImage image2 = ImageIO.read(SpawnLevel.class.getResource(path2));
			int w = width = image2.getWidth();
			int h = height = image2.getHeight();
			tiles2 = new int[w * h];
			image2.getRGB(0, 0, w, h, tiles2, 0, w);
			layers++;
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Exception! Could not load level file 2");
		}
		
		try {
			BufferedImage image3 = ImageIO.read(SpawnLevel.class.getResource(path3));
			int w = width = image3.getWidth();
			int h = height = image3.getHeight();
			tiles3 = new int[w * h];
			image3.getRGB(0, 0, w, h, tiles3, 0, w);
			layers++;
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Exception! Could not load level file 3");
		}
		
		try {
			BufferedImage image4 = ImageIO.read(SpawnLevel.class.getResource(path4));
			int w = width = image4.getWidth();
			int h = height = image4.getHeight();
			tiles4 = new int[w * h];
			image4.getRGB(0, 0, w, h, tiles4, 0, w);
			layers++;
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Exception! Could not load level file 4");
		}
	}
	
	protected void generateLevel() {
		
	}
}
