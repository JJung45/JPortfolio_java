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

public class SecondPage extends SetNext {//3]setnext class�� ��ӹ޴� seconpage
	
	public SecondPage() {//3]secondpage �⺻ ������ ����
		this(SeatManagement.nomemberButton,SeatManagement.memberButton,LastPage.counts,LastPage.counts1,LastPage.counts2,SeatManagement.button_back_to1);
	}

	public SecondPage(JButton nb, JButton mb, JTextField count1, JTextField count2, JTextField count3, JButton back) {//3]secondpage �Ǵٸ� ������ ����(�����ε�)
		this.button1=nb;
		this.button2=mb;
		this.text1=count1;
		this.text2=count2;
		this.text3=count3;
		this.button3=back;
	//��ȸ�� ��ư 
			Button NB=new Button(nb,false,136, 140, 400, 483);//3]button class�� �̿��ؼ� ��ȸ����ư �ҷ�����
			nb.addMouseListener(new MouseAdapter() {//3]firstpage�� ����
				@Override
				public void mouseEntered(MouseEvent e) {
					nb.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nb.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
				@Override
				public void mousePressed(MouseEvent e) {//3]
					SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1_A_2.jpg")).getImage();//3]thirdpage�� ���ȭ�� ��ȯ
					nextpage(false);			//3]�ι�° ������ �Ⱥ��̰��ϰ�, 
					ThirdPage.page1_A_12(true);		//3]������ �������� ���̰� �ؼ� ȭ�� ��ȯ
					ThirdPage.memNomem = 1;//3]thirdpage�� memnomem�Լ��� 1�� ��ȯ(���ڸ� �̿��� ȸ��(1), ��ȸ��(2) �α��� ����)
				}

			
			});
	
		 
	
			//ȸ�� ��ư 
			Button MB=new Button(mb,false,563, 140, 400, 483);//3]���� ����
			mb.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					mb.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					mb.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
				@Override
				public void mousePressed(MouseEvent e) {
					SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1_A_1.jpg")).getImage();
					nextpage(false);			
					ThirdPage.page1_A_12(true);		
					ThirdPage.memNomem = 2;
				}
			});//3]
			
			
			
		
			//ȸ��/��ȸ������������ ������1 ��Ȳ
			Button count11=new Button(LastPage.counts, false, 175, 720, 200, 70);//3]�ι�° �������� �ܿ��¼� ǥ�ø� ���� textfield�ҷ�����
			LastPage.counts.setEnabled(true);//3]������1�� ����� �Ŵϱ� enalbed true�� ����.
			
			//ȸ��/��ȸ������������ ������2 ��Ȳ
			Button count12=new Button(LastPage.counts1, false, 460, 720, 200, 70);//3]���� ����
			LastPage.counts1.setEnabled(false);
			
			
			//ȸ��/��ȸ������������ ������3 ��Ȳ
			Button count13=new Button(LastPage.counts2, false, 740, 720, 200, 70);
			LastPage.counts2.setEnabled(false);//3]
			
}



	@Override
	public void nextpage(boolean onoff) { //3]�հ� ����
		button1.setVisible(onoff);
		button2.setVisible(onoff);
		text1.setVisible(onoff);
		text2.setVisible(onoff);
		text3.setVisible(onoff);
		button3.setVisible(onoff);	
		
	}
}
