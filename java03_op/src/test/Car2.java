package test;
//Ŭ�������� Ŭ������ ��ӹ޴� ��� 1���� Ŭ������ ��Ӱ����ϴ�.
public class Car2 extends Object{
	private String color = "white";
	protected int wheel = 4;
	final int SPEED_MAX=200;
	int speed;
	
	protected Car2() {
		System.out.println("Car()������");
	}
	public Car2(String color) {
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
	public static Car2 getInstance() {
		return new Car2();
	}
	
	
}