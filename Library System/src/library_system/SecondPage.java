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

public class SecondPage extends SetNext {//3]setnext class를 상속받는 seconpage
	
	public SecondPage() {//3]secondpage 기본 생성자 정의
		this(SeatManagement.nomemberButton,SeatManagement.memberButton,LastPage.counts,LastPage.counts1,LastPage.counts2,SeatManagement.button_back_to1);
	}

	public SecondPage(JButton nb, JButton mb, JTextField count1, JTextField count2, JTextField count3, JButton back) {//3]secondpage 또다른 생성자 정의(오버로딩)
		this.button1=nb;
		this.button2=mb;
		this.text1=count1;
		this.text2=count2;
		this.text3=count3;
		this.button3=back;
	//비회원 버튼 
			Button NB=new Button(nb,false,136, 140, 400, 483);//3]button class를 이용해서 비회원버튼 불러오기
			nb.addMouseListener(new MouseAdapter() {//3]firstpage와 동일
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
					SeatManagement.background = new ImageIcon(Main.class.getResource("../images/1_A_2.jpg")).getImage();//3]thirdpage의 배경화면 전환
					nextpage(false);			//3]두번째 페이지 안보이게하고, 
					ThirdPage.page1_A_12(true);		//3]세번쨰 페이지를 보이게 해서 화면 전환
					ThirdPage.memNomem = 1;//3]thirdpage의 memnomem함수를 1로 전환(숫자를 이용해 회원(1), 비회원(2) 로그인 구분)
				}

			
			});
	
		 
	
			//회원 버튼 
			Button MB=new Button(mb,false,563, 140, 400, 483);//3]위와 동일
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
			
			
			
		
			//회원/비회원선택페이지 열람실1 현황
			Button count11=new Button(LastPage.counts, false, 175, 720, 200, 70);//3]두번째 페이지의 잔여좌석 표시를 위한 textfield불러오기
			LastPage.counts.setEnabled(true);//3]열람실1만 사용할 거니까 enalbed true로 설정.
			
			//회원/비회원선택페이지 열람실2 현황
			Button count12=new Button(LastPage.counts1, false, 460, 720, 200, 70);//3]위와 동일
			LastPage.counts1.setEnabled(false);
			
			
			//회원/비회원선택페이지 열람실3 현황
			Button count13=new Button(LastPage.counts2, false, 740, 720, 200, 70);
			LastPage.counts2.setEnabled(false);//3]
			
}



	@Override
	public void nextpage(boolean onoff) { //3]앞과 동일
		button1.setVisible(onoff);
		button2.setVisible(onoff);
		text1.setVisible(onoff);
		text2.setVisible(onoff);
		text3.setVisible(onoff);
		button3.setVisible(onoff);	
		
	}
}
