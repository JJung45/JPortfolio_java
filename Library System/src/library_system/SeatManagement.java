package library_system;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;												//2] 
import java.awt.Image;													//2] 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//2] ImageIcon 클래스 불러옴		
//1] swing 패키지를 불러옴
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SeatManagement extends JFrame {//2]JFrame을 상속받는 SeatManagement. JFrame class를 가져와서 swing gui실행가능
	
	//이미지 가져오기
	private Image mainOffImage = new ImageIcon(Main.class.getResource("../images/2_Button_MainOff.png")).getImage();
	private Image seat01_OffImage = new ImageIcon(Main.class.getResource("../images/2_Button_SeatOff.png")).getImage();
	public static Image background = new ImageIcon(Main.class.getResource("../images/1.jpg")).getImage();
	
	//버튼이미지 가져오기
	public static ImageIcon button1_2Image = new ImageIcon(Main.class.getResource("../images/2_Button1.png"));
	public static ImageIcon button2_2Image = new ImageIcon(Main.class.getResource("../images/2_Button2.png"));
	public static ImageIcon button3_2Image = new ImageIcon(Main.class.getResource("../images/2_Button3.png"));
	public static ImageIcon button4_2Image = new ImageIcon(Main.class.getResource("../images/2_Button4.png"));
	private static ImageIcon issueButtonImage = new ImageIcon(Main.class.getResource("../images/1_Button01.png"));
	private static ImageIcon returnButtonImage = new ImageIcon(Main.class.getResource("../images/1_Button02.png"));
	private static ImageIcon nomemberImage = new ImageIcon(Main.class.getResource("../images/1_A_Button02.png"));
	private static ImageIcon memberImage = new ImageIcon(Main.class.getResource("../images/1_A_Button01.png"));
	private static ImageIcon button_01Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button1.png"));
	private static ImageIcon button_02Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button2.png"));
	private static ImageIcon button_03Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button3.png"));
	private static ImageIcon button_04Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button4.png"));
	private static ImageIcon button_05Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button5.png"));
	private static ImageIcon button_06Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button6.png"));
	private static ImageIcon button_07Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button7.png"));
	private static ImageIcon button_08Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button8.png"));
	private static ImageIcon button_09Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button9.png"));
	private static ImageIcon button_00Image = new ImageIcon(Main.class.getResource("../images/1_A_1_Button0.png"));
	private static ImageIcon button_ClearImage = new ImageIcon(Main.class.getResource("../images/1_A_1_Button_Clear.png"));
	private static ImageIcon button_CheckImage = new ImageIcon(Main.class.getResource("../images/1_A_1_Button_Check.png"));
	public static ImageIcon button_ReturnImage = new ImageIcon(Main.class.getResource("../images/1_B_Button_Return.png")); 
	private static ImageIcon button_MainOnImage = new ImageIcon(Main.class.getResource("../images/2_Button_MainOn.png"));
	private static ImageIcon button_BackImage = new ImageIcon(Main.class.getResource("../images/Button_Back.png"));
	
	//버튼 생성
	public static JButton issueButton = new JButton(issueButtonImage);
	public static JButton returnButton = new JButton(returnButtonImage);
	public static JButton nomemberButton = new JButton(nomemberImage);
	public static JButton memberButton = new JButton(memberImage);
	public static JButton button_01 = new JButton(button_01Image);
	public static JButton button_02 = new JButton(button_02Image);
	public static JButton button_03 = new JButton(button_03Image);
	public static JButton button_04 = new JButton(button_04Image);
	public static JButton button_05 = new JButton(button_05Image);
	public static JButton button_06 = new JButton(button_06Image);
	public static JButton button_07 = new JButton(button_07Image);
	public static JButton button_08 = new JButton(button_08Image);
	public static JButton button_09 = new JButton(button_09Image);
	public static JButton button_00 = new JButton(button_00Image);
	public static JButton button_clear = new JButton(button_ClearImage);
	public static JButton button_check = new JButton(button_CheckImage);
	public static JButton button01_2 = new JButton(button1_2Image);
	public static JButton button02_2 = new JButton(button2_2Image);
	public static JButton button03_2 = new JButton(button3_2Image);
	public static JButton button04_2 = new JButton(button4_2Image);
	public static JButton button_MainOn = new JButton(button_MainOnImage);
	public static JButton button_back_to1 = new JButton(button_BackImage);
    public static JButton button_back_to1_A = new JButton(button_BackImage);
	public static JButton button_back_to1_A_from2 = new JButton(button_BackImage);//2] gui로 그림 불러오기
	
	private Image screenImage;										
	private Graphics screenGraphic;		//2]gui로 배경설정


	public SeatManagement() {	
		setUndecorated(true);//2]frame창의 테두리를 구현해준다
		setTitle("좌석관리시스템");//2]안적어도 되지만 title정의
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);///2]frame창의 크기설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//2]frame이 닫힐 때 프로그램도 종료
		setBackground(new Color(0, 0, 0, 0));//2]frame의 색 설정
		setLocationRelativeTo(null);//2]frame의 window상에서 위치설정-null=가운데
		setResizable(false);//2]frame크기를 고정하기 위해 false
		setVisible(true);//2]frame를 보이게 하기 위해
		setLayout(null);//2]frame배치를 절대경로로 하기 위해 null
		
		new FirstPage(issueButton, returnButton);//2]첫번째 페이지 실행
		new SecondPage(nomemberButton,memberButton,LastPage.counts,LastPage.counts1,LastPage.counts2,button_back_to1);//2] 두번째 페이지 실행
		new ThirdPage();//2]세번째 페이지 실행
		new LastPage();//2] 네번째 페이지 실행
		

	    add(issueButton);
		add(returnButton);
		add(nomemberButton); 
		add(memberButton);
		add(LastPage.counts);
		add(LastPage.counts1);
		add(LastPage.counts2); 
		add(ThirdPage.memnum); 
		add(button_01);
		add(button_02);
		add(button_03);
		add(button_04);
		add(button_05);
		add(button_06);
		add(button_07);
		add(button_08);
		add(button_09);
		add(button_00);
		add(button_clear);
		add(button_check);
		add(LastPage.selectseat);
		add(button01_2);
		add(button02_2);
		add(button03_2);
		add(button04_2);
		add(button_MainOn);
		add(button_back_to1);
		add(button_back_to1_A);
		add(button_back_to1_A_from2);//2]설정된 버튼과 텍스트 frame에 붙이기
		
		
	} //생성자 종료 지점

	
	
	
	
	public void paint(Graphics g) {//frame화면에 그래픽을 출력해줌									 
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);															
		screenGraphic = screenImage.getGraphics();				
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);	//스크린에 이미지를 그림				
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null); //배경 보여주기
		
		//좌석발급상황에 따라 X상태좌석이미지 보여주기
		if(LastPage.seat01Off) {
			g.drawImage(seat01_OffImage, 203, 266, null); }
		if(LastPage.seat02Off) {
			g.drawImage(seat01_OffImage, 254, 266, null); }
		if(LastPage.seat03Off) {
			g.drawImage(seat01_OffImage, 303, 266, null); }
		if(LastPage.seat04Off) {
			g.drawImage(seat01_OffImage, 353, 266, null); }
		
		//회색발급버튼이미지 보여주기
		if(LastPage.mainOff) {
			g.drawImage(mainOffImage, 690, 635, null);
		}
		
		paintComponents(g);
		this.repaint();															
	}
	
}


