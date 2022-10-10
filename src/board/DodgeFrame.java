package board;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;

import texts.DodgeField;
import buttons.DodgeButton;

public class DodgeFrame extends JFrame{
	final int XWINDOWSIZE = 500;
	final int YWINDOWSIZE = 600;
	final int XTITLEPOSITION = 0;
	final int YTITLEPOSITION = 50;
	final int XBUTTONPOSITION = 50;
	final int YBUTTONPOSITION = 350;
	
	public DodgeFrame() {
		getContentPane().setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("J_Dodge");
		setSize(XWINDOWSIZE, YWINDOWSIZE);
		setResizable(false);
		setLayout(null);
		setVisible(true);
	}
	
	public void setMenu() {
		System.out.println("Menu Setting...");
		DodgeField title = new DodgeField("J_Dodge");
		DodgeButton start = new DodgeButton("Start");
		DodgeButton difficulty = new DodgeButton("Difficulty");
		DodgeButton exit = new DodgeButton("Exit");
		title.setPosition(XTITLEPOSITION, YTITLEPOSITION);
		start.setPosition(XBUTTONPOSITION, YBUTTONPOSITION);
		difficulty.setPosition(XBUTTONPOSITION, YBUTTONPOSITION + 50);
		exit.setPosition(XBUTTONPOSITION, YBUTTONPOSITION + 100);
		start.addMouseListener(new StartListeners());
		difficulty.addMouseListener(new DifficultyListeners());
		exit.addMouseListener(new ExitListeners());
		this.add(title);
		this.add(start);
		this.add(difficulty);
		this.add(exit);
	}
	
	public void start() {
		System.out.println("Start Function Called");
	}
	
	public void difficultyMenu() {
		System.out.println("Difficulty Menu Function Called");
	}
	
	class StartListeners extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Game Starting...");
			start();
		}
	}
	class DifficultyListeners extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			difficultyMenu();
		}
	}
	class ExitListeners extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Closing Window");
			dispose();
		}
	}
}
