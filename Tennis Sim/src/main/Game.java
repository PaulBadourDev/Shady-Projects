package main;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {
	
	private JFrame window = new JFrame("Tennis Simulator");
	
	private void setupCourt() { //                             78 / 36
		
		JPanel background = new JPanel();
		JPanel courtGround = new JPanel();
		JPanel net = new JPanel();
		
		// Window Setup
		window.setSize(1100, 700);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		// Background
		background.setBackground(Color.DARK_GRAY);
		background.setBounds(0, 0, 1100, 700);
		
		// Green Court Ground
		courtGround.setLayout(new FlowLayout());
		courtGround.setBackground(new Color(3, 154, 3));
		courtGround.setBounds(150, 150, 780, 360);
		
		
		// Net
		net.setLayout(new FlowLayout());
		net.setBackground(Color.LIGHT_GRAY);
		net.setBounds(535, 150, 5, 360);
		
		
		window.add(net);
		window.add(courtGround);
		window.add(background);
	}
	
	
	Game() {
		setupCourt();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		
		new Game();
		
	}
}
