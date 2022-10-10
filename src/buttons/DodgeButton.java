package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JButton;


public class DodgeButton extends JButton implements MouseListener {
    final int WIDTH = 400;
    final int HEIGHT = 40;
    final int FONTSIZE = 18;
    final String FONTTYPE = "Arial";
    final Font FONT = new Font(FONTTYPE, Font.PLAIN, FONTSIZE);
    final Font BOLDFONT = new Font(FONTTYPE, Font.BOLD, FONTSIZE);
    
    public DodgeButton(String text) {
        setText(text);
        setSize(WIDTH, HEIGHT);
        setForeground(Color.WHITE);
        setFont(FONT);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setVisible(true);
        addMouseListener(this);
    }
    
    
    public void setPosition(int x, int y) {
        setBounds(x, y, WIDTH, HEIGHT);
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        Map attributes = BOLDFONT.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        setFont(BOLDFONT.deriveFont(attributes));
    }
    @Override
    public void mouseExited(MouseEvent e) {
        Map attributes = FONT.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, null);
        setFont(FONT.deriveFont(attributes));
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
}