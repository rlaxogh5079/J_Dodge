package texts;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class DodgeField extends JTextField{
	final int WIDTH = 500;
	final int HEIGHT = 40;
	final Font FONT = new Font("Arial", Font.BOLD, 34);
	
	public DodgeField(String text) {
		this.setText(text);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		this.setDisabledTextColor(Color.WHITE);
		this.setHorizontalAlignment(JTextField.CENTER);
		this.setFont(FONT);
		this.setBorder(null);
		this.setEnabled(false);
		this.setVisible(true);
	}
	
	public void setPosition(int x, int y) {
		this.setBounds(x, y, WIDTH, HEIGHT);
	}
}
