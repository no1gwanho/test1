
public class AAA {	//소스만 한페이지지 바이트코드는 3개가 만들어짐 단! 다른 클래스의 PUBLIC을 지워줘야함
static	int num=100;
	
}//class

class BBB{
	int num = 200;
	BBB(){}
	
	static BBB getInstance() {			//객체로 만들어서 반환해주는 메소드  getInstance
		return new BBB();
		
	}
	
}

class CCC{
	static int num=300;
	static String name="홍길동";
	static String addr="서울시 마포구";
	CCC(){}

	
	//상수만들기
	static final int MAX = 100;
	static final int MIN = 1;
	
	static void print() {
		//final 변수의 값은 수정불가
		//MAX = 200;
		System.out.println("번호="+num);
		System.out.println("이름="+name);
		System.out.println("주소="+addr);
		System.out.println("MIN="+MIN+", MAX="+MAX);
	}
}
