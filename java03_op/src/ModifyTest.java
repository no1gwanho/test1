import test.CCC;
public class ModifyTest {

	public ModifyTest() {
		//public : � Ŭ���������� ������ ����Ѵ�.(Ŭ����,�������,�����ڸ޼ҵ�,�޼ҵ�)
		//default : ���������ڸ� ������ ���� ���Ѵ�. ���� ��Ű�� �������� ������ �����ϴ�. ���� AAA�� ������Ű���̹Ƿ� AAA�����ڿ� public�� �Ⱥپ ���ٰ���
		//private : �ٸ� Ŭ�������� ������ �� ����. ���� Ŭ���� �������� ������ �����ϴ�.
		//			 ��������� private�� ��� ��ü�� ���� ������ �Ұ����ϴ�.
		
		
		AAA a = new AAA();
		System.out.println("a.name="+a.name);			//��������� ȣ��
		a.print();			//�޼ҵ带 ȣ��
		
		//CCC c = new CCC();	//CCC�� ��Ű���� �ٸ��� ���������ڰ� default�� �׷��� ����
		//CCC c = CCC.getInstance();
		
		//�����ʿ� new�������°� �������� �̸��� �� ������ �޼ҵ尡 public�̾�߸� ���ٰ���
				//�ٸ� ��Ű���� �ִ°� import �ؼ� �����
		
		//System.out.println("c.tel="+c.tel);		//�ٸ���Ű���� �ִµ� ��������� default�� �����ٶ�
														//�� Ŭ������ Ǭ�ٰ� �ٰ� �ƴ� ���� ���ε��� �����������
				
		//c.sum();	//�޼ҵ嵵 �⺻ default�� ��������� ������ �� ����
		
		//������ �޼ҵ� private �̸� ��ü�� ������ �� ����.
		BBB b = new BBB();
		// private������� �����ϱ� : �Ұ���
		//System.out.println("addr="+b.addr); private�� �Ұ���
		b.output(); 			//�̷��� �ٸ��޼ҵ带 �̿��� �����ϴ� �� ������
	
	
	}

	public static void main(String[] args) {
		new ModifyTest();
		
		

	}

}
