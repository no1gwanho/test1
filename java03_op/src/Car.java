
//Ŭ�������� Ŭ������ ��ӹ޴� ��� 1���� Ŭ������ ��Ӱ����ϴ�.
public class Car extends Object{
	private String color = "white";   //private �ʵ�, ������, ���� Ŭ���������� ���� ����
	protected int wheel = 4;			//�ʵ� ������ �޼ҵ� ���� ��Ű���� �Ҽӵ� Ŭ���� �� �޼ҵ�			
	final int SPEED_MAX=200;
	int speed;
	
	public Car() {
		System.out.println("Car()������");
	}
	public Car(String color) {
		this.color = color;
		System.out.println("color="+color);
		
	}
	public void speedUp() {
		speed++;
		if(speed>=SPEED_MAX) {
			speed = SPEED_MAX;
				
		}
		System.out.println("speed="+speed);
	}

	public void speedDown() {
		speed--;
		if(speed<=0) {
			speed = 0;
		}
		System.out.println("speed="+speed);
	}
	
	
	
}