package texts;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class DodgeField extends JTextField{
	final int WIDTH = 500;
	final int HEIGHT = 40;
	final Font FONT = new Font("Arial", Font.BOLD, 34);
	
	public DodgeField(String text) {
		setText(text);
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setDisabledTextColor(Color.WHITE);
		setHorizontalAlignment(JTextField.CENTER);
		setFont(FONT);
		setBorder(null);
		setEnabled(false);
		setVisible(true);
	}
	
	public void setPosition(int x, int y) {
		setBounds(x, y, WIDTH, HEIGHT);
	}
}
