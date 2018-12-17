package library_system;
import javax.swing.*;

public abstract class SetNext {//8]추상클래스로 setnext를 설정하여 화면전환시 공통으로 필요한 메소드와 button정의 
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JTextField text1=new JTextField();
	JTextField text2=new JTextField();
	JTextField text3=new JTextField();
	
	public abstract void nextpage(boolean onoff);

}
