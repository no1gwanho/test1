import test.CCC;
public class ModifyTest {

	public ModifyTest() {
		//public : 어떤 클래스에서든 접근을 허용한다.(클래스,멤버변수,생성자메소드,메소드)
		//default : 접근제한자를 생략한 것을 말한다. 같은 패키지 내에서만 접근이 가능하다. 현재 AAA와 같은패키지이므로 AAA생성자에 public이 안붙어도 접근가능
		//private : 다른 클래스에서 접근할 수 없다. 같은 클래스 내에서만 접근이 가능하다.
		//			 멤버변수가 private일 경우 객체를 통한 접근이 불가능하다.
		
		
		AAA a = new AAA();
		System.out.println("a.name="+a.name);			//멤버변수를 호출
		a.print();			//메소드를 호출
		
		//CCC c = new CCC();	//CCC는 패키지가 다른데 접근제어자가 default다 그래서 에러
		//CCC c = CCC.getInstance();
		
		//오른쪽에 new옆에쓰는건 생성자의 이름임 즉 생성자 메소드가 public이어야만 접근가능
				//다른 패키지에 있는건 import 해서 써야함
		
		//System.out.println("c.tel="+c.tel);		//다른패키지에 있는데 멤버변수가 default라 빨간줄뜸
														//즉 클래스만 푼다고 다가 아님 각자 따로따로 지정해줘야함
				
		//c.sum();	//메소드도 기본 default면 지정해줘야 가져올 수 있음
		
		//생성자 메소드 private 이면 객체를 생성할 수 없다.
		BBB b = new BBB();
		// private멤버변수 접근하기 : 불가능
		//System.out.println("addr="+b.addr); private은 불가능
		b.output(); 			//이렇게 다른메소드를 이용해 접근하는 건 가능함
	
	
	}

	public static void main(String[] args) {
		new ModifyTest();
		
		

	}

}
