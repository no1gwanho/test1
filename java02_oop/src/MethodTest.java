import java.util.Scanner;
public class MethodTest {
	//int dan; // ��������� �⺻ �ʱⰪ�� �մ�. ����=0, �Ǽ�=0.0, ����=false, char=�����;���
			 //							��� Ŭ���� ��ü�� �ʱⰪ�� null�̴�.
	
	
	//���۷��� ���� : Ŭ������ ����
	Scanner s;	//�̰� �� null�� ������
	String name;		//�̰� �� null�� ������
	public MethodTest() {	}// �Ű� ������ ���� ������ �⺻���� �������ִ� ���� ����.
	
	//���Է� �޼ҵ�
	public int getDan(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"=");
		int dan = scan.nextInt();
		return dan;		
	}
	//�Է¹��� ������ ������ ���
	public void danOutput(int dan) {
		for(int i=2; i<=9;i++) {
			caculator(i,dan);//�޼ҵ�ȣ�� : ����Ŭ������ �޼ҵ�� �޼ҵ������ ȣ��ȴ�.
		}					//�������� �Ʒ��� ������ �Ʒ� �޼ҵ尡������ ȣ��Ȱ����� �ٽÿö�
							//�������� �ִ°� �޼ҵ���� 
	
	}
	//���
	public void caculator(int i, int dan) {
		int result = dan * i;	//i�� �������ؼ� danOutput()�� �ִ�i�� ������
		System.out.println(dan+"*"+i+"="+result);
	}
	public void startDan() {
		int dan = getDan("���Է�");
		danOutput(dan);
	}
		
}
