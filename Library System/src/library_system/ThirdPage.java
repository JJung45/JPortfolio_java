package library_system;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class ThirdPage {
	public static StringBuffer memnum_=new StringBuffer();//4]Ű�е� �Է��� ���� ����
	public static JTextField memnum = new JTextField();//4]Ű�е� �Է°��� ���̱� ���� textfield
    public static int memNomem;//4]ȸ��(1), ��ȸ��(2)�� �����ϱ� ���� ����
	
	public void inputNumberButtons(String z) { //4]Ű�е带 ������  memnum textfield�� �Է��ϱ� ���� �޼ҵ�
		
	    memnum_=memnum_.append(z);//4]stringbuffer�� append�� �̿��Ͽ� �߰��Է�
		memnum.setText(memnum_.toString());//4]�߰��Էµ�  stringbuffer���� memnum textfield�� ���� 
	

	}
	
	public static void page1_A_12(boolean onoff) { //4]�հ� ����
		memnum.setVisible(onoff);
		SeatManagement.button_01.setVisible(onoff);
		SeatManagement.button_02.setVisible(onoff);
		SeatManagement.button_03.setVisible(onoff);
		SeatManagement.button_04.setVisible(onoff);
		SeatManagement.button_05.setVisible(onoff);
		SeatManagement.button_06.setVisible(onoff);
		SeatManagement.button_07.setVisible(onoff);
		SeatManagement.button_08.setVisible(onoff);
		SeatManagement.button_09.setVisible(onoff);
		SeatManagement.button_00.setVisible(onoff);
		SeatManagement.button_clear.setVisible(onoff);
		SeatManagement.button_check.setVisible(onoff);
		SeatManagement.button_back_to1_A.setVisible(onoff);	
	}
	
	public ThirdPage() {//4]thirdpage �⺻������ ����
	//�α��������� �����Է�ĭ
	Button memnums=new Button(memnum, false, 330, 260, 450, 70);//4]�հ� ����

	
	//�α��������� ����1 ��ư
	Button b_01=new Button(SeatManagement.button_01,false,305, 383, 91, 91);
	SeatManagement.button_01.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_01.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_01.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {//4]
			inputNumberButtons("1");//4]inputnumberbuttons �޼ҵ带 �̿��Ͽ� textfield�� 1�Է�
		}
	});
	
	
	//�α��������� ����2 ��ư
	Button b_02=new Button(SeatManagement.button_02,false,405, 383, 91, 91);//4]���� ����
	SeatManagement.button_02.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_02.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_02.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputNumberButtons("2");		//�α��μ����Է� �޼���
		}
		
	});
	
	
	//�α��������� ����3 ��ư
	Button b_03=new Button(SeatManagement.button_03,false,504, 383, 91, 91);
	SeatManagement.button_03.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_03.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_03.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputNumberButtons("3");		//�α��μ����Է� �޼���
		}
	});
	
	//�α��������� ����4 ��ư
	Button b_04=new Button(SeatManagement.button_04,false,305, 482, 91, 91);
	SeatManagement.button_04.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_04.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_04.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputNumberButtons("4");		//�α��μ����Է� �޼���
		}
	});

	//�α��������� ����5 ��ư
	Button b_05=new Button(SeatManagement.button_05,false,405, 482, 91, 91);
	SeatManagement.button_05.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_05.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_05.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputNumberButtons("5");		//�α��μ����Է� �޼���
		}
	});
	
	
	//�α��������� ����6 ��ư
	Button b_06=new Button(SeatManagement.button_06,false,504, 483, 91, 91);
	SeatManagement.button_06.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_06.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_06.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputNumberButtons("6");		//�α��μ����Է� �޼���
		}
	});
	
	
	//�α��������� ����7 ��ư
	Button b_07=new Button(SeatManagement.button_07,false,305, 582, 91, 91);
	SeatManagement.button_07.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_07.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_07.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputNumberButtons("7");		//�α��μ����Է� �޼���
		}
	});


	//�α��������� ����8 ��ư
	Button b_08=new Button(SeatManagement.button_08,false,405, 582, 91, 91);
	SeatManagement.button_08.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_08.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_08.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputNumberButtons("8");		//�α��μ����Է� �޼���
		}
	});
	
	//�α��������� ����9 ��ư
	Button b_09=new Button(SeatManagement.button_09,false,504, 582, 91, 91);
	SeatManagement.button_09.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_09.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_09.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputNumberButtons("9");		//�α��μ����Է� �޼���
		}
	});
	
	//�α��������� ����0 ��ư
	Button b_00=new Button(SeatManagement.button_00,false,305, 681, 91, 91);
	SeatManagement.button_00.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_00.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_00.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputNumberButtons("0");		//�α��μ����Է� �޼���
		}
	});

	//�α��������� CLEAR ��ư
	Button b_c=new Button(SeatManagement.button_clear,false,405, 681, 190, 91);
	SeatManagement.button_clear.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_clear.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_clear.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {//4]
			memnum_.setLength(0);//4]Ű�е忡�� clear��ư�� ��������, Ű�е��� ���� �Է½� ������� stringbuffer������ ���� 0�� ���� �������� 
			memnum.setText(memnum_.toString());//4]������ ������ ���� textfield�� ����
			
		}
	});
	
	//�α��������� Ȯ�� ��ư
	Button b_ch=new Button(SeatManagement.button_check,false,604, 383, 190, 390);//4]���� ����
	SeatManagement.button_check.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_check.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_check.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {//4]
			Login g = new Login(memNomem);//4]memnomem�� ���� ȸ�� ��ȸ�� ������ �� �� �ִ� login ������ ����
			if(memNomem == 1 || memNomem == 2) {//4]memnomem�� 1�̳� 2��� ȸ��,��ȸ�� �̹Ƿ�
				if(g.k == true) {//4]login�� k���� true�� �ٲ�鼭 ����
					SeatManagement.background = new ImageIcon(Main.class.getResource("../images/2.jpg")).getImage();//4]�հ� ����
					page1_A_12(false);		//�α��������� �޼���
					LastPage.page2(true);				//�¼����������� �޼���
		//4]
					
					//�¼��߱޻��¿� ���� X�����¼��̹������� ����
					if(LastPage.seat01.equals("off")) { 
						LastPage.seat01Off = true; }
					if(LastPage.seat02.equals("off")) { 
						LastPage.seat02Off = true; }
					if(LastPage.seat03.equals("off")) { 
						LastPage.seat03Off = true; }
					if(LastPage.seat04.equals("off")) { 
						LastPage.seat04Off = true; }
				}
			}
				
			else if (memNomem == 3) {
				SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1-B-1.jpg")).getImage();	//���� �ʿ�
			}
			
			memnum_.setLength(0);
			memnum.setText(memnum_.toString());
		}
	});
	
	Button b_b_to1=new Button(SeatManagement.button_back_to1,false,79, 13, 120, 120);
	SeatManagement.button_back_to1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_back_to1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_back_to1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1.jpg")).getImage();
			new SecondPage().nextpage(false);
			memnum_.setLength(0);
			memnum.setText(memnum_.toString());
			page1_A_12(false);
			new FirstPage().nextpage(true);
			
		}
	});
 
	}
	
}
