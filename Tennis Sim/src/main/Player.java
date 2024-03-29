package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Player extends JPanel{
	private int posx = 0;
	private int posy = 0;
	private double speed = 0.0f;
	private final int RADIUS = 50;
	
	Player(){
		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.drawOval(0, 0, RADIUS, RADIUS);
		g.fillOval(0, 0, RADIUS, RADIUS);
		this.setBounds(posx, posy, 2 * RADIUS, 2 * RADIUS);
	}
	
	public void move(int x, int y) {
		posx = x;
		posy = y;
	}
}
