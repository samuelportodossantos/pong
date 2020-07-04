package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	public static boolean right;
	public static boolean left;
	public int speed = 3;
	
	public int x, y;
	public int width;
	public int height;

	public Player (int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}
	
	public void tick() {
		
		if (right) {
			x += speed;
		} else if (left) {
			x -= speed;
		}
		
		if ( x + width > Game.WIDTH ) {
			x = Game.WIDTH - width;
		}
		
		if ( x <= 0 ) {
			x = 0;
		}
		
	}
	
	public void render(Graphics g) {
		
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
		
	}
	
}
