package main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {
	
	private JFrame window = new JFrame("Tennis Simulator");
	private JPanel background = new JPanel();
	private Player pOne = new Player();
	
	private void setupCourt() {
		
		JPanel background = new JPanel();
		JPanel courtGround = new JPanel();
		JPanel net = new JPanel();
		JPanel firstSideline = new JPanel();
		JPanel secondSideline = new JPanel();
		JPanel firstBaseline = new JPanel();
		JPanel secondBaseline = new JPanel();
		JPanel firstAlley = new JPanel();
		JPanel secondAlley = new JPanel();
		JPanel firstNotch = new JPanel();
		JPanel secondNotch = new JPanel();
		JPanel firstService = new JPanel();
		JPanel secondService = new JPanel();
		JPanel center = new JPanel();
		
		// Window Setup
		window.setSize(1100, 700);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setVisible(true);
		
		// Background
		background.setBackground(Color.DARK_GRAY);
		background.setBounds(0, 0, 1100, 700);
		
		// Green Court Ground
		courtGround.setBackground(new Color(3, 154, 3));
		courtGround.setBounds(150, 150, 780, 360); // 78 : 36
		
		// Net
		net.setBackground(Color.LIGHT_GRAY);
		net.setBounds(535, 150, 5, 360);
		
		// Top Sideline
		firstSideline.setBackground(Color.WHITE);
		firstSideline.setBounds(150, 150, 780, 5);
		
		// Bottom Sideline
		secondSideline.setBackground(Color.WHITE);
		secondSideline.setBounds(150, 510, 780, 5);
		
		// Left Baseline
		firstBaseline.setBackground(Color.WHITE);
		firstBaseline.setBounds(150, 150, 5, 360);
		
		// Right Baseline
		secondBaseline.setBackground(Color.WHITE);
		secondBaseline.setBounds(930, 150, 5, 365);
		
		// Top Alley
		firstAlley.setBackground(Color.WHITE);
		firstAlley.setBounds(150, 195, 780, 5);
		
		// Bottom Alley
		secondAlley.setBackground(Color.WHITE);
		secondAlley.setBounds(150, 465, 780, 5);
		
		// Left Notch
		firstNotch.setBackground(Color.WHITE);
		firstNotch.setBounds(150, 320, 25, 5);
		
		// Right Notch
		secondNotch.setBackground(Color.WHITE);
		secondNotch.setBounds(910, 320, 20, 5);
		
		// Left Service
		firstService.setBackground(Color.WHITE);
		firstService.setBounds(320, 195, 5, 270);
		
		// Right Service
		secondService.setBackground(Color.WHITE);
		secondService.setBounds(740, 195, 5, 270);
		
		// Center Service Line
		center.setBackground(Color.WHITE);
		center.setBounds(320, 320, 420, 5);
		
		pOne.setBackground(Color.RED);
		pOne.setBounds(550, 350, 200, 2);
		
		window.add(pOne);
		
		window.add(net);
		window.add(center);
		window.add(secondService);
		window.add(firstService);
		window.add(secondNotch);
		window.add(firstNotch);
		window.add(firstAlley);
		window.add(secondAlley);
		window.add(secondBaseline);
		window.add(firstBaseline);
		window.add(secondSideline);
		window.add(firstSideline);
		window.add(courtGround);
		window.add(background);
	}
	
	
	Game() {
		
		setupCourt();
		pOne.move(100, 100);
		
		
		pOne.move(400, 400);
	}
	
	
	public static void main(String args[]) {
		
		new Game();
		
	}
}
