
//�߻�޼ҵ带 1�� �̻� ������ Ŭ������ �߻�Ŭ������ �ȴ�.
public abstract class AbstractTest {
	int max=100;
	
	
	public AbstractTest() {
				
	}
	
	public void print() {
		System.out.println("max="+max);
	}
	
	//body = ����ΰ� ���� �޼ҵ带 �߻�޼ҵ�� �Ѵ�.
	//�߻�޼ҵ� ��ȯ�� ���ʿ� abstractǥ���Ͽ��� �Ѵ�.
	public abstract void print(int a);
	public abstract int sum();
}
