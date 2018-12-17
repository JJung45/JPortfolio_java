package library_system;
public class Main {

	public static final int SCREEN_WIDTH = 1100;			//1] 프로그램의 너비 값 설정, 변하지 않는 상수이기 때문에 대문자
	public static final int SCREEN_HEIGHT = 860;			//1] 마찬가지로 프로그램의 높이 값 설정
	
	public static void main(String[] args) {

		new SeatManagement();//1] SeatManagement 객체를 생성하여 실행
		
	}
}
