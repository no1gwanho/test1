
//interface가 interface를 상속 받을 경우 extends키워드로 1개만 상속받을 수 있다=>다시말해 이또한 일종의 class라는 뜻
public interface InterfaceTest extends Calculator{
	//static final 변수
	public static final int MAX_NUM = 100;			//STATIC이면 객체 안만들고 바로 사용가능 클래스명.어쩌구로 가능
	public static final String USER_NAME = "hong";
	
	
	//추상메소드 : 반환형, 메소드명. 매개변수(argument)만 정의된 메소드
	//				  실행부가 없다.
	public int plus(int a, int b);
	public String getUsername();
	public int minus(int a, int b);
	
	//메소드명을 통일시켜야할때(각자만들면 이름이 너무 많으니깐)
	//
	
}
