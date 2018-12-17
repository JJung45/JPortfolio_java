package library_system;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class LastPage {
	public static String barcode = "44";//5]�ܿ��¼��� textfield�� ��Ÿ���� ���� string���� barcode���� ����
	public static JTextField counts = new JTextField(barcode+" / 44",100); //5]�ܿ��¼��� ��� textfield����
	public static JTextField counts1 = new JTextField("44 / 44",100);//5]���� �����ϳ�, ���x
	public static JTextField counts2 = new JTextField("44 / 44",100);//5]
	public static String seat01 = "on";//5]ó������ �¼��� ��� Ȱ��ȭ
	public static String seat02 = "on";
	public static String seat03 = "on";
	public static String seat04 = "on";
	public static boolean mainOff = false; 
	public static boolean seat01Off = false;
	public static boolean seat02Off = false;
	public static boolean seat03Off = false;
	public static boolean seat04Off = false;//5]
	
	public void settingUser() {//5]�ܿ��¼� ���� �޼ҵ�
		int barcodes = Integer.parseInt(barcode);//5]barcode��ü�� string���̱� ������ int�� �ٲ��ִ� �޼ҵ带 ���
		--barcodes;//5]int�� �ٲ� barcode���� 1����
		barcode = String.valueOf(barcodes);//5]�ٽ� textfield�� �ֱ� ���� string������ ����
		counts.setText(barcode+" / 44");//5]����� barcode���� �ܿ��¼��� ��� textfield������ ���
		}
	public static JTextField selectseat = new JTextField("	");//5]�����¼��� ��� textfield
	static int SSnum = 0;//5]�¼� ���ý� ���õ� ���ڰ� �ҷ�����
	public class SelectSeat{
		private int selectseatfi;//5]������ private�� �������ֱ� ������. textfield�� ���� ����
		
		public int getName() {//5]getname�� ���� �ҷ�������
			return selectseatfi;
		}
		public void setName(int selectseatfi) {//5]�ҷ��� ���� private�� �������� �Է��ϰ�
			this.selectseatfi = selectseatfi;
		}
		
		}	
	
	
	public void inputSeatNumber(int y) { //5]������ �¼��� selectseat textfield�� �Է��ϱ� ���� �޼ҵ�
		SeatManagement.button_MainOn.setVisible(true);		//5]�߱޹�ư Ȱ��ȭ
	
		SelectSeat SS = new SelectSeat();//5]textfield�� ���� ������ �ִ� ��ü ����
		SS.setName(y);//5]y������ textfield�� ���� ������ �� ����
		SSnum = SS.getName();//5]getname�� ���� textfield�� ���� ���� ��������
		selectseat.setText(Integer.toString(SSnum));//5]textfield�� ������ �¼� ����
	}
	
public static void page2(boolean onoff) { 	//5]�հ� ����
		
		//5]�¼���ư �����ֱ�
		SeatManagement.button01_2.setVisible(onoff);
		SeatManagement.button02_2.setVisible(onoff);
		SeatManagement.button03_2.setVisible(onoff);
		SeatManagement.button04_2.setVisible(onoff);	
		
		//5]�¼��߱޻��¿� ���� �¼���ư ��Ȱ��ȭ
		if (seat01.equals("off")) { //12-01
			SeatManagement.button01_2.setVisible(false);} //5]seat01��  off�̸� 1���¼��� xǥ��
		if (seat02.equals("off")) { //12-01
			SeatManagement.button02_2.setVisible(false);} 
		if (seat03.equals("off")) { //12-01
			SeatManagement.button03_2.setVisible(false);} 
		if (seat04.equals("off")) { //12-01
			SeatManagement.button04_2.setVisible(false);}
		
		selectseat.setVisible(onoff);
		mainOff = onoff;
		SeatManagement.button_back_to1_A_from2.setVisible(onoff); 
	}

  public static void seatOffButton(boolean onoff) {
    seat01Off = onoff;
	seat02Off = onoff;
	seat03Off = onoff;
	seat04Off = onoff;
}//5]

	public LastPage() {//5]lastpage�⺻ ������ ����
	//�¼����������� �����¼�
	Button selseats=new Button(selectseat, false,580, 644, 70, 60);//5] �հ� ����

	//�¼�01 ��ư
	Button b01_2=new Button(SeatManagement.button01_2,false,203, 266, 49, 49);
	SeatManagement.button01_2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button01_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button01_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputSeatNumber(1);	//5]inputseatnumbers �޼ҵ带 �̿��Ͽ� textfield�� 1�Է�
		}
	});

	//�¼�02 ��ư
	Button b02_2=new Button(SeatManagement.button02_2,false,254, 266, 49, 49);//5]���� ����
	SeatManagement.	button02_2.addMouseListener(new MouseAdapter() {

		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button02_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button02_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputSeatNumber(2);	//�����¼���ȣ�Է� �޼���
		}
	});

	//�¼�03 ��ư
	Button b03_2=new Button(SeatManagement.button03_2,false,303, 266, 49, 49);
	SeatManagement.button03_2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button03_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button03_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputSeatNumber(3);	//�����¼���ȣ�Է� �޼���
		}
	});

	//�¼�04 ��ư
	Button b04_2=new Button(SeatManagement.button04_2,false,353, 266, 49, 49);
	SeatManagement.button04_2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button04_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button04_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			inputSeatNumber(4);	//�����¼���ȣ�Է� �޼���
		}
	});
	
	//�¼����������� �߱޹�ư(ȸ��)
	Button b_M=new Button(SeatManagement.button_MainOn,false,690, 635, 204, 72);
	SeatManagement.button_MainOn.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_MainOn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_MainOn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {//5]
			
			//5]�¼���ư��Ȱ��ȭ ���ǹ�
			switch(SSnum){//5]������ �¼� ���� ssum�� 1,2,3,4�� ������
			case 1 : 
				SeatManagement.button01_2.setVisible(false);//5] �Ϲ��¼��� �Ⱥ��̰�
				seatOffButton(false); //5]seatoffbutton�� �Ű��������� fasle�� �Է�
				seat01 = "off"; //5]ù��° �¼��� off��
				page2(false);
				selectseat.setText("");
				settingUser();//5]�ι�° �������� �ܿ��¼� ������ ���� �޼ҵ�
				break;
			case 2 : 
				SeatManagement.button02_2.setVisible(false);//5]���� ����
				seatOffButton(false);  	//�¼������� X�����¼��̹��� �޼���
				seat02 = "off";
				page2(false);
				selectseat.setText("");		//�����¼�ĭ ���� (night)
				settingUser();
				break;
			case 3 : 
				SeatManagement.button03_2.setVisible(false);
				seatOffButton(false);  	//�¼������� X�����¼��̹��� �޼���
				seat03 = "off";
				page2(false);
				selectseat.setText("");		//�����¼�ĭ ���� (night)
				settingUser();
				break;
			case 4 : 
				SeatManagement.button04_2.setVisible(false);
				seatOffButton(false);  	//�¼������� X�����¼��̹��� �޼���
				seat04 = "off";
				page2(false);
				selectseat.setText("");		//�����¼�ĭ ���� (night)
				settingUser();
				break;//5]
			}
			
			SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1.jpg")).getImage();//5]�߱��� �Ϸ�Ǹ� ù��° ���ȭ������ ��ȯ
			SeatManagement.button_MainOn.setVisible(false);//5]�߱� ��ư�� ��Ȱ��ȭ
			new FirstPage().nextpage(true);//5]ù��° �������� ������ �ҷ�����
		}
		
	});
	
	Button b_b_to1_A=new Button(SeatManagement.button_back_to1_A,false,79, 13, 120, 120);//�ļ���
	SeatManagement.button_back_to1_A.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_back_to1_A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_back_to1_A.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1_A.jpg")).getImage();
			new SecondPage().nextpage(true);
			ThirdPage.page1_A_12(false);
			page2(false);
		}
	});
	
	Button b_b_to1_A_f2=new Button(SeatManagement.button_back_to1_A_from2,false,79, 13, 120, 120);
	SeatManagement.button_back_to1_A_from2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			SeatManagement.button_back_to1_A_from2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			SeatManagement.button_back_to1_A_from2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1_A.jpg")).getImage();
			new SecondPage().nextpage(true);
			page2(false);
			SeatManagement.button_MainOn.setVisible(false);
			seatOffButton(false);
			selectseat.setText("");		//�����¼�ĭ ���� (night)
		}
	});//5]

	}
}

	