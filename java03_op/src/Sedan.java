
public class Sedan extends Car {
	int speed = 150;	//superŬ������ �ڽ�Ŭ������ ������ ������ ��ԵǴ���?
							//�������� ������ ������ ���Ե� �ٵ� �̿��õ� �θ�Ŭ���� ������ ������� ���� �ƴϰ�
							//�θ�Ŭ���� ������ ����ʹٸ� �տ� super.�� ���̸��
	
	public Sedan() {
		//����Ŭ������ �Ű������� �ִ� ������ ȣ��
		//�׷��� �ݵ��! ù�࿡�� ȣ���ؾ��Ѵ�!
		super("red");		
		
								//�⺻������ �����ڸ� ȣ�������� 
								//�Ű��������� superŬ������ �����ڸ� ȣ���ϰ���� �ʴٸ�
								//super(�Ű����� ����)
		System.out.println("Sedan()������");
	}
	public void speedUp() {	//����Ŭ���� �޼ҵ�� �ڽ�Ŭ������ �޼ҵ尡 �Ȱ��� ���� ����� �� �ٸ��� ������ �ִ� �޼ҵ带 �ٽø���°�
		super.speed +=10;				//�������̵� overriding : ����Ŭ������ �޼ҵ带 ����Ŭ�������� ������
		if(super.speed>=SPEED_MAX) {
			super.speed = SPEED_MAX;
		}
		System.out.println("speed="+speed);
	
		super.speedUp(); 		//���⼭�� speedUp�� ������ȣ���ϴ°� �ƴϱ⶧���� ù�پƴϾ��
		//System.out.println("Car.color="+color);
		//private��������� ����Ŭ�������� ����� �� ����!!
		//private ��������� ��ӵ��� �ʴ´�.
		
	}								//�������̵��ϸ� �θ�Ŭ���� �޼ҵ尡 ��������� �ƴ� �켱���� �ٲ���ϻ�
	public static void main(String[] args) {
		Sedan sedan = new Sedan();		//����Ŭ������ �����ڷ� ��ü�� �����?
		sedan.speedUp();										//���������� �����ڸ� ���� ����ȴ�.
		

	}

}
