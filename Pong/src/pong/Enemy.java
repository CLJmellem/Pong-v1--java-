package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
	
	public double x,y; //double needed bc enemy speed is not a const value
	public int WIDTH,HEIGHT;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.WIDTH = 40;
		this.HEIGHT = 5;
	}
	public void tick() {
		x += (Game.ball.x - x - 6) * 0.09; //AI difficult
	}
	
	public void render(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect((int)x, (int)y, WIDTH, HEIGHT);
	}
}
