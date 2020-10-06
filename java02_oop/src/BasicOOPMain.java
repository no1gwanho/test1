import java.lang.String;
public class BasicOOPMain {		//왜 import를 안써도 지금 불러올수 있는가? 같은 폴더에 있어서 그렇다 다른폴더면 불러와야함

	public static void main(String[] args) {
		String name = new String();
		
		//객체생성 기능이 필요하면 객체만들어서 불러와서 쓰면됨
		//객체가 생성될때 실행되는 메소드임, 호출이전에 객체를 생성할때 이미 사실 해당 클래스 내용이 실행이 된것임 왜? 생성자메소드기때문에
		//생성자 메소드는(클래스와 이름이 같은) 여러번 불러서쓸수없다. 객체 생성할때 NEW로 만들때 딱 한번만 실행됨
		BasicOOP oop1 = new BasicOOP();
		BasicOOP oop2 = new BasicOOP();
		
		
		//객체 내의 메소드 호출  -> 객체명.메소드명
		oop1.sum();
		
	  name	= oop1.getName();	//클래스에서 반환하게 해놨으면 그걸 받아야함
	  System.out.println("name="+name);
	
	  
	  //객체내의 멤버변수의 데이터를 얻어오거나 변경하기(접근하기)  !지역변수에는 접근불가!
	  // 객체명.변수명
	  oop1.a=2500;
	  
	  System.out.println("oop1.a="+oop1.a);   //객체는 별개인것처럼 관리한다는 것을 볼수있다.
	  System.out.println("oop2.a="+oop2.a);
	  
	  
	  
	  //생성자 메소드는 여러번 불러서쓸수없다. 객체 생성할때 한번만 실행됨
	 // oop1.sum();
	//  oop1.sum();
	}

}
