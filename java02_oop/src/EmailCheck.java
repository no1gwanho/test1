import java.util.Scanner;
public class EmailCheck {

	
	public EmailCheck() {}

	Scanner scan = new Scanner(System.in);
	
	
	public void idInput() {							//���̵� �Է� input���� �ٷ� �� checker�޼ҵ�� ����
		System.out.println("���̵� �Է�");
		String input = scan.nextLine();
		checker(input);
	}
		
	public void checker(String input) {			//id check ������ input���� ���ư�
		int idxLast = input.lastIndexOf("@");
		int idx = input.indexOf("@");
		String email = input.substring(0,idx);		
		String domain = input.substring(idx+1);
			if(idxLast!=8) {										//lastindex ���� �̻���...
				System.out.println("���̵�="+email);
				System.out.println("������="+domain);
			}else if(idx==0 || idxLast>8) {
				System.out.println( "�̸��� Ȥ�� �������� �߸� �Է��ϼ̽��ϴ�."   );
			}
	}
	
	public String getEndQna() {
		System.out.println("����Ͻðڽ��ϱ�?(Y:�� , N:�ƴϿ�)?");
		return scan.nextLine();
	}
	
	public void print() {
		System.out.println("���̵�=");
		System.out.println("������=");
	}
	
	
	public void start() {
		a:
		do{  idInput();
			String qna = getEndQna();
			
		do {	
			if(qna.equalsIgnoreCase("Y")) {
				break;
			}else if(qna.equalsIgnoreCase("N")) {
				System.out.println("���α׷� ����...");
				break a;
			}
		}while(true);
		
		
		}while(true);
	}
		
	
	
	public static void main(String[] args) {
		EmailCheck c1 = new EmailCheck();
		c1.start();
	}

}


/*
����
�̸��� �Է�=������uma nate.com
�߸��� �̸����ּ� �Դϴ�.
�̸��� �Է�=goguma@nate.com
���̵�=goguma
������=nate.com
����Ͻðڽ��ϱ�?(Y:��, N:�ƴϿ�)?
*/