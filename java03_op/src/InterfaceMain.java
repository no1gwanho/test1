import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//class���� interface�� implements�� ���߻���� �����ϴ�. , �޸��� ���߻�Ӱ� ��������
public class InterfaceMain extends Sedan implements InterfaceTest,ActionListener {

//extends�� ��ӹ޴� Ŭ������ ���� ���� �� �ڿ� �������̽��� ���ش�.	
	
	public InterfaceMain() {}

	
	
	//interface�� �߻�޼ҵ�� ��� �������̵� �Ͽ��� �Ѵ�.
	public int plus(int a, int b) {
		return a+b+100;
	}
	public String getUsername() {
		return USER_NAME;
	}
	public int minus(int a, int b) {
		int result = 0;
		if(a>b) {
			result = a-b;
		}else {
			result = b-a;
		}
		return result;
	}
	public int multiple(int a, int b) {
		return a*b;
	}
	public int devide(int a, int b) {
		return a/b;
	}
	public void actionPerformed(ActionEvent e) {}
	
	
		
	public static void main(String[] args) {
		InterfaceMain im = new InterfaceMain();
		System.out.println("10,5="+im.minus(10,5));
		System.out.println("5,10="+im.minus(5, 10));
	}

}
