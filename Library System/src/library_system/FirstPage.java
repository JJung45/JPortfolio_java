package library_system;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;												//2] 
import java.awt.Image;													//2] 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//2] ImageIcon Ŭ���� �ҷ���		
//1] swing ��Ű���� �ҷ���
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstPage extends SetNext{//3]setnext�� ����ϴ� firstpage

	public FirstPage() {//3]firstpage�⺻ ������ ����
		this(SeatManagement.issueButton, SeatManagement.returnButton);
	}
	
	
	public FirstPage(JButton ib,JButton ir) {//3]firstpage��  �Ǵٸ� ������ ����(�����ε�) 
		this.button1=ib;
		this.button2=ir;
	
		
	Button IB=new Button(ib, 75, 139, 950, 450);//3]button class ������ ȣ��
	ib.addMouseListener(new MouseAdapter() {//3]mouse�� ��ư�� �پ��� �� �ൿ�ϴ� �Է� �޼ҵ�. ���콺�� �����ϴ� ��쿡 �߻��ϰ� �Ǵ� ���콺 �̺�Ʈ. motionlistener�������̽� ����
		@Override
		public void mouseEntered(MouseEvent e) {//3]mouse�� ��ư ���� �÷�����
			ib.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {//3]mouse�� ��ư ������ �������
			ib.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {//3]mouse�� ��ư�� ��������
			SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1_A.jpg")).getImage();//3]�����̹����� ���ȭ����ȯ
			nextpage(false);			//3]ù��° �������� �Ⱥ��̰� �ϰ�
			new SecondPage().nextpage(true);		//3]�ι�° ������ ���̰� �ϱ�
		}
	});

	
	/*
	//�ݳ� ��ư 
	Button RB=new Button(SeatManagement.returnButton, 74, 614, 950, 180);//3]���� ����

	
	ir.addMouseListener(new MouseAdapter() {

		@Override
		public void mousePressed(MouseEvent e) {
			SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1_B.jpg")).getImage();
			nextpage(false);				//���������� �޼���(��Ȱ��ȭ)
			ThirdPage.page1_A_12(true);		//�α��������� �޼���
			SeatManagement.button_back_to1.setVisible(true);	
			SeatManagement.button_check.setIcon(SeatManagement.button_ReturnImage);
			ThirdPage.memNomem = 3;
		}
	});//3]
	
	*/
	
}

	@Override
	public void nextpage(boolean onoff) {//3]setnext class�� nextpage�������̵�(������)�Ͽ� ���� �������� ��ư�� �Ⱥ��̰� ��
		button1.setVisible(onoff);
		button2.setVisible(onoff);
	}
}


