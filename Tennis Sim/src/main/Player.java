package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Player extends JPanel{
	private int posx = 0;
	private int posy = 0;
	
	Player(){
		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.drawOval(posx, posy, 100, 100);					
	}
	
	public void move(int x, int y) {
		posx = x;
		posy = y;
	}
}
