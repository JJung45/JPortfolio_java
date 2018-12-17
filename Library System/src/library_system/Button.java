package library_system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Button {//6]buttonŬ������ �ҷ����� �� ���������� �ʿ��� button�� �԰��̳� ������ ���� �� ����. �����ε��� ���� button�޼ҵ� ����
	
	public Button(JButton button, int x, int y,int w,int h) {
		button.setBounds(x, y, w, h);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		
	}
	
	public Button(JButton button,boolean t, int x, int y,int w,int h) {
		button.setVisible(t);
		button.setBounds(x, y, w, h);
		button.setBorderPainted(t);
		button.setContentAreaFilled(t);
		button.setFocusPainted(t);
		
	}
	
	public Button(JTextField field,boolean t, int x, int y,int w,int h) {
		field.setVisible(t);
		field.setBounds(x, y, w, h);
		field.setOpaque(t);
		field.setBorder(null);
		field.setFont(new Font("hi",Font.BOLD,60));
		field.setForeground(Color.white); 
	}

}
