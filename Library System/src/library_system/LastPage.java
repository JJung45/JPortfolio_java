package library_system;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class LastPage {
	public static String barcode = "44";//5]잔여좌석을 textfield에 나타내기 위해 string으로 barcode변수 설정
	public static JTextField counts = new JTextField(barcode+" / 44",100); //5]잔여좌석을 담는 textfield변수
	public static JTextField counts1 = new JTextField("44 / 44",100);//5]위와 동일하나, 사용x
	public static JTextField counts2 = new JTextField("44 / 44",100);//5]
	public static String seat01 = "on";//5]처음에는 좌석들 모두 활성화
	public static String seat02 = "on";
	public static String seat03 = "on";
	public static String seat04 = "on";
	public static boolean mainOff = false; 
	public static boolean seat01Off = false;
	public static boolean seat02Off = false;
	public static boolean seat03Off = false;
	public static boolean seat04Off = false;//5]
	
	public void settingUser() {//5]잔여좌석 설정 메소드
		int barcodes = Integer.parseInt(barcode);//5]barcode자체는 string값이기 때문에 int로 바꿔주는 메소드를 사용
		--barcodes;//5]int로 바뀐 barcode값을 1감소
		barcode = String.valueOf(barcodes);//5]다시 textfield에 넣기 위해 string값으로 변경
		counts.setText(barcode+" / 44");//5]변경된 barcode값을 잔여좌석을 담는 textfield변수에 담기
		}
	public static JTextField selectseat = new JTextField("	");//5]선택좌석을 담는 textfield
	static int SSnum = 0;//5]좌석 선택시 선택된 숫자값 불러오기
	public class SelectSeat{
		private int selectseatfi;//5]변수가 private로 설정되있기 때문에. textfield에 담을 변수
		
		public int getName() {//5]getname를 통해 불러오도록
			return selectseatfi;
		}
		public void setName(int selectseatfi) {//5]불러온 값을 private된 변수값에 입력하고
			this.selectseatfi = selectseatfi;
		}
		
		}	
	
	
	public void inputSeatNumber(int y) { //5]선택한 좌석을 selectseat textfield에 입력하기 위한 메소드
		SeatManagement.button_MainOn.setVisible(true);		//5]발급버튼 활성화
	
		SelectSeat SS = new SelectSeat();//5]textfield에 담을 변수가 있는 객체 생성
		SS.setName(y);//5]y값으로 textfield를 담을 변수에 값 설정
		SSnum = SS.getName();//5]getname을 통해 textfield를 담을 변수 가져오기
		selectseat.setText(Integer.toString(SSnum));//5]textfield에 선택한 좌석 설정
	}
	
public static void page2(boolean onoff) { 	//5]앞과 동일
		
		//5]좌석버튼 보여주기
		SeatManagement.button01_2.setVisible(onoff);
		SeatManagement.button02_2.setVisible(onoff);
		SeatManagement.button03_2.setVisible(onoff);
		SeatManagement.button04_2.setVisible(onoff);	
		
		//5]좌석발급상태에 따라 좌석버튼 비활성화
		if (seat01.equals("off")) { //12-01
			SeatManagement.button01_2.setVisible(false);} //5]seat01이  off이면 1번좌석이 x표시
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

	public LastPage() {//5]lastpage기본 생성자 생성
	//좌석선택페이지 선택좌석
	Button selseats=new Button(selectseat, false,580, 644, 70, 60);//5] 앞과 동일

	//좌석01 버튼
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
			inputSeatNumber(1);	//5]inputseatnumbers 메소드를 이용하여 textfield에 1입력
		}
	});

	//좌석02 버튼
	Button b02_2=new Button(SeatManagement.button02_2,false,254, 266, 49, 49);//5]위와 동일
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
			inputSeatNumber(2);	//선택좌석번호입력 메서드
		}
	});

	//좌석03 버튼
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
			inputSeatNumber(3);	//선택좌석번호입력 메서드
		}
	});

	//좌석04 버튼
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
			inputSeatNumber(4);	//선택좌석번호입력 메서드
		}
	});
	
	//좌석선택페이지 발급버튼(회색)
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
			
			//5]좌석버튼비활성화 조건문
			switch(SSnum){//5]선택한 좌석 변수 ssum에 1,2,3,4가 들어갔을때
			case 1 : 
				SeatManagement.button01_2.setVisible(false);//5] 일번좌석이 안보이게
				seatOffButton(false); //5]seatoffbutton의 매개변수값을 fasle로 입력
				seat01 = "off"; //5]첫번째 좌석을 off로
				page2(false);
				selectseat.setText("");
				settingUser();//5]두번째 페이지의 잔여좌석 차감을 위한 메소드
				break;
			case 2 : 
				SeatManagement.button02_2.setVisible(false);//5]위와 동일
				seatOffButton(false);  	//좌석페이지 X상태좌석이미지 메서드
				seat02 = "off";
				page2(false);
				selectseat.setText("");		//선택좌석칸 비우기 (night)
				settingUser();
				break;
			case 3 : 
				SeatManagement.button03_2.setVisible(false);
				seatOffButton(false);  	//좌석페이지 X상태좌석이미지 메서드
				seat03 = "off";
				page2(false);
				selectseat.setText("");		//선택좌석칸 비우기 (night)
				settingUser();
				break;
			case 4 : 
				SeatManagement.button04_2.setVisible(false);
				seatOffButton(false);  	//좌석페이지 X상태좌석이미지 메서드
				seat04 = "off";
				page2(false);
				selectseat.setText("");		//선택좌석칸 비우기 (night)
				settingUser();
				break;//5]
			}
			
			SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1.jpg")).getImage();//5]발급이 완료되면 첫번째 배경화면으로 전환
			SeatManagement.button_MainOn.setVisible(false);//5]발급 버튼의 비활성화
			new FirstPage().nextpage(true);//5]첫번째 페이지의 설정값 불러오기
		}
		
	});
	
	Button b_b_to1_A=new Button(SeatManagement.button_back_to1_A,false,79, 13, 120, 120);//후수정
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
			selectseat.setText("");		//선택좌석칸 비우기 (night)
		}
	});//5]

	}
}

	