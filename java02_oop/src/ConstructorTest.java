
public class ConstructorTest {
	int num=10;
	String name;
	String tel="010-1111-2222";
	public ConstructorTest() {	//�����Ϸ��� �������ش�. 	�� �Ű������� ���� �ٸ������ڰ� ��������
		// �ٸ��͵��� ���ٸ� �����Ϸ��� �̰� �ڵ����� ������ִµ� �Ʒ� �ٸ� �����ڵ��� ���� ������ �ȸ������
		// ���࿡ �ƹ��͵� ���� �׳� �޶� �����鸸 �ִٸ� ����Ƶ� ����ؼ� �ҷ��������ϸ� �����ڰ� �־���ϴµ�  �� �⺻�����ڴ�
		// �ٸ� �����ڵ��� ������ �����Ϸ��� �ڵ����� ������༭ ���� �����ִ� ��������� ���� ��ɾ ���� ���̶� ����� �� �ְ� ����
		
		
	}
	public ConstructorTest(int num) {		//main���� �޼ҵ�ȿ� ���� �����͸� int num�� ���� ������ �޼ҵ��� ����������
			System.out.println("ConstructorTest(int num)");
			this.num = num; //���������� �������� �̸��� ���Ƶ� ��,�ٵ� �׳� ���� ���������� ����
							//this ����Ŭ������ ���� �̸��� �ٸ��� this���ص� �Ǵµ�
			
	//������ ������ �޶� ������ ������ ���� �޶� ������		
	}
	public ConstructorTest(String name) {
		
	}
	public ConstructorTest(int num, String name,String tel) {
		//�����ڿ��� �ٸ� �����ڸ� ȣ���ϱ� ���ؼ��� �ݵ�� ù��° ���๮���� ó���ؾ��Ѵ�
		this(num);	//�����ڸ޼ҵ带 ���� �ڸ����� this   �����ڸ޼ҵ带 �θ��������� this�� ���̸� ���� ȣ���ϴ� �����ڸ޼ҵ� �ű� ���� �����ϰ� ���ƿ�
		System.out.println("ConstructorTest(int num, String tel, String name)");
		//this.num = num;
		this.name = name;
		this.tel = tel;
	
	}
	public ConstructorTest(String name,  String tel,int num) {  //�Ȱ����� ������ ������ �޶� ��밡����
		this(num,name,tel);   //��������ִ� �� �����ͼ� ����ϸ� this �ٸ� ������ ȣ��
		
		
	}
	public void prn() {
		System.out.println("��ȣ="+num);
		System.out.println("�̸�"+name);
		System.out.println("����ó="+tel);
	}
}


	
	
	
	
	
	

