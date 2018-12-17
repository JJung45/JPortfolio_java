package library_system;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class ThirdPage {
	public static StringBuffer memnum_=new StringBuffer();//4]키패드 입력을 위한 변수
	public static JTextField memnum = new JTextField();//4]키패드 입력값을 보이기 위한 textfield
    public static int memNomem;//4]회원(1), 비회원(2)을 구분하기 위한 변수
	
	public void inputNumberButtons(String z) { //4]키패드를 누르면  memnum textfield에 입력하기 위한 메소드
		
	    memnum_=memnum_.append(z);//4]stringbuffer의 append를 이용하여 추가입력
		memnum.setText(memnum_.toString());//4]추가입력된  stringbuffer값을 memnum textfield에 설정 
	

	}
	
	public static void page1_A_12(boolean onoff) { //4]앞과 동일
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
	
	public ThirdPage() {//4]thirdpage 기본생성자 정의
	//로그인페이지 숫자입력칸
	Button memnums=new Button(memnum, false, 330, 260, 450, 70);//4]앞과 동일

	
	//로그인페이지 숫자1 버튼
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
			inputNumberButtons("1");//4]inputnumberbuttons 메소드를 이용하여 textfield에 1입력
		}
	});
	
	
	//로그인페이지 숫자2 버튼
	Button b_02=new Button(SeatManagement.button_02,false,405, 383, 91, 91);//4]위와 동일
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
			inputNumberButtons("2");		//로그인숫자입력 메서드
		}
		
	});
	
	
	//로그인페이지 숫자3 버튼
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
			inputNumberButtons("3");		//로그인숫자입력 메서드
		}
	});
	
	//로그인페이지 숫자4 버튼
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
			inputNumberButtons("4");		//로그인숫자입력 메서드
		}
	});

	//로그인페이지 숫자5 버튼
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
			inputNumberButtons("5");		//로그인숫자입력 메서드
		}
	});
	
	
	//로그인페이지 숫자6 버튼
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
			inputNumberButtons("6");		//로그인숫자입력 메서드
		}
	});
	
	
	//로그인페이지 숫자7 버튼
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
			inputNumberButtons("7");		//로그인숫자입력 메서드
		}
	});


	//로그인페이지 숫자8 버튼
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
			inputNumberButtons("8");		//로그인숫자입력 메서드
		}
	});
	
	//로그인페이지 숫자9 버튼
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
			inputNumberButtons("9");		//로그인숫자입력 메서드
		}
	});
	
	//로그인페이지 숫자0 버튼
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
			inputNumberButtons("0");		//로그인숫자입력 메서드
		}
	});

	//로그인페이지 CLEAR 버튼
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
			memnum_.setLength(0);//4]키패드에서 clear버튼을 눌렀을때, 키패드의 숫자 입력시 담아지는 stringbuffer변수의 값을 0로 만들어서 지워지게 
			memnum.setText(memnum_.toString());//4]위에서 지워진 값을 textfield에 설정
			
		}
	});
	
	//로그인페이지 확인 버튼
	Button b_ch=new Button(SeatManagement.button_check,false,604, 383, 190, 390);//4]위와 동일
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
			Login g = new Login(memNomem);//4]memnomem를 통해 회원 비회원 구분을 할 수 있는 login 페이지 생성
			if(memNomem == 1 || memNomem == 2) {//4]memnomem이 1이나 2라면 회원,비회원 이므로
				if(g.k == true) {//4]login의 k값이 true로 바뀌면서 실행
					SeatManagement.background = new ImageIcon(Main.class.getResource("../images/2.jpg")).getImage();//4]앞과 동일
					page1_A_12(false);		//로그인페이지 메서드
					LastPage.page2(true);				//좌석선택페이지 메서드
		//4]
					
					//좌석발급상태에 따라 X상태좌석이미지상태 변경
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
				SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1-B-1.jpg")).getImage();	//수정 필요
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
