package library_system;

public class Login {//7]회원, 비회원 로그인을 구분하기 위한 메소드

	boolean k = false;//7]boolean값을 통해 로그인시 다음화면전환이 가능하게 함
	
	public Login(int i) {//7]매개변수 i를 통해 1이 들어오면 비회원로그인, 2가 들어오면 회원로그인이 되게 함.
		 switch(i) {
		 case 1 ://7]비회원로그인
			 if(ThirdPage.memnum_.length()==13)//7]비회원로그인은 주민등록번호를 이용한 로그인이므로 13자리가 됐을 때 넘어가게끔 만듬
				 k = true;//7)k값이 true로 바뀌면서 다음화면으로 넘어가는 login에서 if(g.k==true)구동
			 else
				 k = false;
			 break;
		 case 2 ://7]회원로그인
			 User nu = new User();//7]user class를 통하여 회원으로 등록되어 있는 사람들만 로그인이 가능하게 함.
			 String[] bb=new String[2];//7]user에 회원으로 등록되어있는 사람들이 배열로 짜여져 있기 때문에 그걸 받을 수 있는 배열값필요
			 for(int p=0;p<2;p++) {
			 bb[p]=nu.getNum()[p];
			 }
			 String memnumfi=ThirdPage.memnum_.toString();//7]세번째화면에서 키패드로 입력한 값의 변수
			for(int q=0;q<2;q++) {
				if(memnumfi.equals(bb[q])) {//7]세번째화면에서 키패드로 입력한 값의 변수와 user의 회원값들 비교
						k=true; break;}//7]맞다면 다음화면으로 넘어가는 login에서 if(g.k==true)구동
			}
			 
			 break;
		}
	}
	
}