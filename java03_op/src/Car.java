
//클래스에서 클래스를 상속받는 경우 1개의 클래스만 상속가능하다.
public class Car extends Object{
	private String color = "white";   //private 필드, 생성자, 같은 클래스에서만 접근 가능
	protected int wheel = 4;			//필드 생성자 메소드 같은 패키지에 소속된 클래스 및 메소드			
	final int SPEED_MAX=200;
	int speed;
	
	public Car() {
		System.out.println("Car()생성자");
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