import java.util.Scanner;
public class EmailCheckSolution {
	Scanner scan = new Scanner(System.in);
	final String EMAIL_MSG = "�̸����Է�";
	final String QNA_MSG = "����Ͻðڽ��ϱ�?(Y:��, N:�ƴϿ�)";
	
	public EmailCheckSolution() {}
		
	public void emailCheckStart() {
		lbl:
		do{
		String email	= getInput(EMAIL_MSG);	//�̸��� �Է�
		//��ȿ�� �˻�
		if(emailCheck(email)) {
			//�������
			//������, ���̵�и� ���
			emailOutput(email);
			//�������Ȯ��
			do {
				String qna = getInput(QNA_MSG);
			if(qna.equalsIgnoreCase("Y")) {
				break;
			}else if(qna.equalsIgnoreCase("N")){
				break lbl;
			}
			}while(true);
			///////////////////
		}else {
			System.out.println("�߸��� �̸��� �ּ� �Դϴ�. �ٽ� �Է��ϼ���");					//�߸��� ����
		}
	}while(true);
	System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

	
	
	public void emailOutput(String email) {
		String emailCut[] = email.split("@");
		System.out.println("���̵�"+emailCut[0]);
		System.out.println("������"+emailCut[1]);
		}
	
	
	
	//@�˻�
	public boolean emailCheck(String email) {
		int atMark = email.indexOf('@');	//@��ġ�� index�� ���ϰ� ������� -1;
		int point = email.indexOf(".");	//	.�� ��ġ���ϱ� 
		
		
		if(atMark<4 || point<6 || point<atMark || point-atMark<2 || atMarkCount(email,'@')!=1 || atMarkCount(email,'.')>2) {
			return false;
		}else {
			return true;
		}
	}
	
	
	
	public int atMarkCount(String email, char str) {
		int cnt=0;
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)==str) {
				cnt++;
			}
		}
		return 0;
	}
	
	//���ڿ� �Է�

	
	public String getInput(String msg) {
	System.out.println(msg+"=");
		return scan.nextLine();
	}
		

	
	
	
	public static void main(String[] args) {
			new EmailCheckSolution().emailCheckStart();

		
	}
}



/*
����
012345678
�̸��� �Է�=������uma nate.com
�߸��� �̸����ּ� �Դϴ�.
�̸��� �Է�=goguma@nate.com
���̵�=goguma
������=nate.com
����Ͻðڽ��ϱ�?(Y:��, N:�ƴϿ�)?
*/