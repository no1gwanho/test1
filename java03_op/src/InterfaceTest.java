
//interface�� interface�� ��� ���� ��� extendsŰ����� 1���� ��ӹ��� �� �ִ�=>�ٽø��� �̶��� ������ class��� ��
public interface InterfaceTest extends Calculator{
	//static final ����
	public static final int MAX_NUM = 100;			//STATIC�̸� ��ü �ȸ���� �ٷ� ��밡�� Ŭ������.��¼���� ����
	public static final String USER_NAME = "hong";
	
	
	//�߻�޼ҵ� : ��ȯ��, �޼ҵ��. �Ű�����(argument)�� ���ǵ� �޼ҵ�
	//				  ����ΰ� ����.
	public int plus(int a, int b);
	public String getUsername();
	public int minus(int a, int b);
	
	//�޼ҵ���� ���Ͻ��Ѿ��Ҷ�(���ڸ���� �̸��� �ʹ� �����ϱ�)
	//
	
}
