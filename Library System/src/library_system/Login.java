package library_system;

public class Login {//7]ȸ��, ��ȸ�� �α����� �����ϱ� ���� �޼ҵ�

	boolean k = false;//7]boolean���� ���� �α��ν� ����ȭ����ȯ�� �����ϰ� ��
	
	public Login(int i) {//7]�Ű����� i�� ���� 1�� ������ ��ȸ���α���, 2�� ������ ȸ���α����� �ǰ� ��.
		 switch(i) {
		 case 1 ://7]��ȸ���α���
			 if(ThirdPage.memnum_.length()==13)//7]��ȸ���α����� �ֹε�Ϲ�ȣ�� �̿��� �α����̹Ƿ� 13�ڸ��� ���� �� �Ѿ�Բ� ����
				 k = true;//7)k���� true�� �ٲ�鼭 ����ȭ������ �Ѿ�� login���� if(g.k==true)����
			 else
				 k = false;
			 break;
		 case 2 ://7]ȸ���α���
			 User nu = new User();//7]user class�� ���Ͽ� ȸ������ ��ϵǾ� �ִ� ����鸸 �α����� �����ϰ� ��.
			 String[] bb=new String[2];//7]user�� ȸ������ ��ϵǾ��ִ� ������� �迭�� ¥���� �ֱ� ������ �װ� ���� �� �ִ� �迭���ʿ�
			 for(int p=0;p<2;p++) {
			 bb[p]=nu.getNum()[p];
			 }
			 String memnumfi=ThirdPage.memnum_.toString();//7]����°ȭ�鿡�� Ű�е�� �Է��� ���� ����
			for(int q=0;q<2;q++) {
				if(memnumfi.equals(bb[q])) {//7]����°ȭ�鿡�� Ű�е�� �Է��� ���� ������ user�� ȸ������ ��
						k=true; break;}//7]�´ٸ� ����ȭ������ �Ѿ�� login���� if(g.k==true)����
			}
			 
			 break;
		}
	}
	
}