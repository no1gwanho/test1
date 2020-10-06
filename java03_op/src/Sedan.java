
public class Sedan extends Car {
	int speed = 150;	//super클래스와 자식클래스의 변수가 같을때 어떻게되느냐?
							//하위에서 선언한 변수를 쓰게됨 근데 이역시도 부모클래스 변수가 사라지는 것이 아니고
							//부모클래스 변수를 쓰고싶다면 앞에 super.을 붙이면됨
	
	public Sedan() {
		//상위클래스의 매개변수가 있는 생성자 호출
		//그러나 반드시! 첫행에서 호출해야한다!
		super("red");		
		
								//기본적으로 생성자를 호출하지만 
								//매개변수없는 super클래스의 생성자를 호출하고싶지 않다면
								//super(매개변수 형식)
		System.out.println("Sedan()생성자");
	}
	public void speedUp() {	//상위클래스 메소드와 자식클래스의 메소드가 똑같다 단지 기능이 좀 다르다 기존에 있는 메소드를 다시만드는것
		super.speed +=10;				//오버라이딩 overriding : 상위클래스의 메소드를 하위클래스에서 재정의
		if(super.speed>=SPEED_MAX) {
			super.speed = SPEED_MAX;
		}
		System.out.println("speed="+speed);
	
		super.speedUp(); 		//여기서의 speedUp은 생성자호출하는게 아니기때문에 첫줄아니어도됨
		//System.out.println("Car.color="+color);
		//private멤버변수는 하위클래스에서 사용할 수 없다!!
		//private 멤버변수는 상속되지 않는다.
		
	}								//오버라이딩하면 부모클래스 메소드가 사라진것이 아님 우선권이 바뀐것일뿐
	public static void main(String[] args) {
		Sedan sedan = new Sedan();		//하위클래스를 생성자로 객체를 만들면?
		sedan.speedUp();										//상위래스의 생성자를 먼저 실행된다.
		

	}

}
