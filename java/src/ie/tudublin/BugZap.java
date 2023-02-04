package ie.tudublin;

import java.util.Random;

import processing.core.PApplet;

public class BugZap extends PApplet {

	float playerX = 250;
	float playerY = 499;
	float playerWidth = 10;

	float bugX = random.nextInt(0, 500);
	float bugY = 15;
	float bugW = 10;

	static final float R = 105;
	static final float G = 105;
	static final float B = 105;

	public static Random random = new Random();

	public static final Integer VELOCITY = 10;

	public static final Double BUG_VELOCITY = 1d;

	public int frameThreshold = 60;

	public void settings() {
		size(500, 500);
	}

	/**
	 * Called during startup
	 */
	public void setup() {
		settings();
		background(0);
	}

	/**
	 * Called frequently
	 */
	public void draw() {
		drawPlayer(playerX, playerY, playerWidth);
		drawBug(bugX, bugY, bugW);
		moveBug();
	}

	public void moveBug() {
		
		if ((frameCount % frameThreshold) == 0) {
			if (bugY >= 387) {
				bugY = 15;
				frameThreshold = 60;
				return;
			}

			if (bugX <= 50) {
				bugX = 50;
			} else if (bugX >= 470) {
				bugX = 470;
			}

			// move the bug a step down
			bugY += 30;
			// move the bug a random step left or right
			bugX += random.nextInt(-50, 50);
			background(0);

		}

	}

	public void drawPlayer(float x, float y, float w) {
		line(x - 25, y, x + 50, y);
		line(x - 25, y, x - 25, y - 25);
		line(x + 50, y, x + 50, y - 25);
		line(x, y - 50, x + 25, y - 50);
		line(x, y - 50, x - 25, y - 25);
		line(x + 25, y - 50, x + 50, y - 25);
		line(x + 12, y - 50, x + 12, y - 65);
		stroke(R, G, B);
	}

	public void drawBug(float x, float y, float w) {
		line(x, y, x - 15, y + 15);
		line(x, y, x + 15, y + 15);
		line(x - 15, y + 15, x + 15, y + 15);
		triangle(x - 10, y + 15, x - 3, y + 15, x - 14, y + 23);
		triangle(x + 10, y + 15, x + 3, y + 15, x + 14, y + 23);
		stroke(R, G, B);
	}

	public void keyPressed() {
		background(0);
		if (keyCode == LEFT) {
			// System.out.println("Left arrow pressed");
			playerX -= VELOCITY;
		} else if (keyCode == RIGHT) {
			// System.out.println("Right arrow pressed");
			playerX += VELOCITY;
		} else if (key == ' ') {
			// System.out.println("SPACE key pressed");
			line(playerX + 12, playerY - 50, playerX + 12, playerY - 500);
			hitBug();
		}
	}

	public void hitBug() {
		if (playerX <= bugX +15 && playerX >= bugX -15){
			bugY = 15;
		}

	}
}