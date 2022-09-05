package buttons;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


public class DodgeButton extends JButton{
	final int WIDTH = 400;
	final int HEIGHT = 40;
	final Font FONT = new Font("Arial", Font.BOLD, 18);
	
	public DodgeButton(String text) {
		this.setText(text);
		this.setSize(WIDTH, HEIGHT);
		this.setForeground(Color.WHITE);
		this.setFont(FONT);
		this.setOpaque(false);
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
	}

	public void setPosition(int x, int y) {
		this.setBounds(x, y, WIDTH, HEIGHT);
	}
}
