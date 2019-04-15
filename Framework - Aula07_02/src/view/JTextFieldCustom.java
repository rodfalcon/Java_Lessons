package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class JTextFieldCustom extends JTextField {
	public JTextFieldCustom() {
		setFont(new Font ("Arial", Font.PLAIN, 16));
		setForeground(Color.BLUE);
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if (Character.isLetter(e.getKeyChar()))
                    e.consume();
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
	}
	
}
