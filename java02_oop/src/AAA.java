
public class AAA {	//�ҽ��� ���������� ����Ʈ�ڵ�� 3���� ������� ��! �ٸ� Ŭ������ PUBLIC�� ���������
static	int num=100;
	
}//class

class BBB{
	int num = 200;
	BBB(){}
	
	static BBB getInstance() {			//��ü�� ���� ��ȯ���ִ� �޼ҵ�  getInstance
		return new BBB();
		
	}
	
}

class CCC{
	static int num=300;
	static String name="ȫ�浿";
	static String addr="����� ������";
	CCC(){}

	
	//��������
	static final int MAX = 100;
	static final int MIN = 1;
	
	static void print() {
		//final ������ ���� �����Ұ�
		//MAX = 200;
		System.out.println("��ȣ="+num);
		System.out.println("�̸�="+name);
		System.out.println("�ּ�="+addr);
		System.out.println("MIN="+MIN+", MAX="+MAX);
	}
}
