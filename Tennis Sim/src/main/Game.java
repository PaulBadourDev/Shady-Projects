package main;

import javax.swing.JFrame;

public class Game {
	
	private JFrame window = new JFrame("Tennis Simulator");
	
	private void setupCourt() {
		window.setSize(800, 600);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
	
	
	Game() {
		setupCourt();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		
		new Game();
		
	}
}
