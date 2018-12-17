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

//2] ImageIcon 클래스 불러옴		
//1] swing 패키지를 불러옴
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstPage extends SetNext{//3]setnext를 상속하는 firstpage

	public FirstPage() {//3]firstpage기본 생성자 정의
		this(SeatManagement.issueButton, SeatManagement.returnButton);
	}
	
	
	public FirstPage(JButton ib,JButton ir) {//3]firstpage의  또다른 생성자 정의(오버로딩) 
		this.button1=ib;
		this.button2=ir;
	
		
	Button IB=new Button(ib, 75, 139, 950, 450);//3]button class 생성자 호출
	ib.addMouseListener(new MouseAdapter() {//3]mouse가 버튼에 붙었을 때 행동하는 입력 메소드. 마우스를 조작하는 경우에 발생하게 되는 마우스 이벤트. motionlistener인터페이스 구현
		@Override
		public void mouseEntered(MouseEvent e) {//3]mouse를 버튼 위에 올렸을때
			ib.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {//3]mouse가 버튼 위에서 벗어났을때
			ib.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {//3]mouse로 버튼을 눌렀을때
			SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1_A.jpg")).getImage();//3]다음이미지로 배경화면전환
			nextpage(false);			//3]첫번째 페이지를 안보이게 하고
			new SecondPage().nextpage(true);		//3]두번째 페이지 보이게 하기
		}
	});

	
	/*
	//반납 버튼 
	Button RB=new Button(SeatManagement.returnButton, 74, 614, 950, 180);//3]위와 동일

	
	ir.addMouseListener(new MouseAdapter() {

		@Override
		public void mousePressed(MouseEvent e) {
			SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1_B.jpg")).getImage();
			nextpage(false);				//메인페이지 메서드(비활성화)
			ThirdPage.page1_A_12(true);		//로그인페이지 메서드
			SeatManagement.button_back_to1.setVisible(true);	
			SeatManagement.button_check.setIcon(SeatManagement.button_ReturnImage);
			ThirdPage.memNomem = 3;
		}
	});//3]
	
	*/
	
}

	@Override
	public void nextpage(boolean onoff) {//3]setnext class의 nextpage오버라이딩(재정의)하여 현재 페이지의 버튼을 안보이게 함
		button1.setVisible(onoff);
		button2.setVisible(onoff);
	}
}


