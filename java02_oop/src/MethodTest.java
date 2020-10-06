import java.util.Scanner;
public class MethodTest {
	//int dan; // 멤버변수는 기본 초기값이 잇다. 정수=0, 실수=0.0, 논리형=false, char=데이터없음
			 //							모든 클래스 객체는 초기값이 null이다.
	
	
	//레퍼런스 변수 : 클래스형 변수
	Scanner s;	//이거 다 null값 들어가있음
	String name;		//이거 다 null값 들어가있음
	public MethodTest() {	}// 매개 변수가 없는 생성자 기본으로 생성해주는 것이 좋다.
	
	//단입력 메소드
	public int getDan(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"=");
		int dan = scan.nextInt();
		return dan;		
	}
	//입력받은 단으로 구구단 출력
	public void danOutput(int dan) {
		for(int i=2; i<=9;i++) {
			caculator(i,dan);//메소드호출 : 같은클래스의 메소드는 메소드명으로 호출된다.
		}					//변수값을 아래로 보내줌 아래 메소드가끝나면 호출된곳으로 다시올라감
							//같은집에 있는건 메소드명만씀 
	
	}
	//계산
	public void caculator(int i, int dan) {
		int result = dan * i;	//i를 쓰기위해서 danOutput()에 있는i를 가져옴
		System.out.println(dan+"*"+i+"="+result);
	}
	public void startDan() {
		int dan = getDan("단입력");
		danOutput(dan);
	}
		
}
