
public class ConstructorTest {
	int num=10;
	String name;
	String tel="010-1111-2222";
	public ConstructorTest() {	//컴파일러가 생성해준다. 	단 매개변수가 없는 다른생성자가 없을때만
		// 다른것들이 없다면 컴파일러가 이걸 자동으로 만들어주는데 아래 다른 생성자들이 같이 있으면 안만들어줌
		// 만약에 아무것도 없고 그냥 달랑 변수들만 있다면 어찌됐든 사용해서 불러오고자하면 생성자가 있어야하는데  이 기본생성자는
		// 다른 생성자들이 없을때 컴파일러가 자동으로 만들어줘서 위에 써져있는 변수라던지 실행 명령어가 없는 것이라도 사용할 수 있게 해줌
		
		
	}
	public ConstructorTest(int num) {		//main에서 메소드안에 넣은 데이터를 int num이 받음 생성자 메소드의 지역변수임
			System.out.println("ConstructorTest(int num)");
			this.num = num; //지역변수와 전역변수 이름이 같아도 됨,근데 그냥 쓰면 지역변수를 뜻함
							//this 현재클래스를 뜻함 이름이 다르면 this안해도 되는데
			
	//데이터 개수가 달라도 괜찮고 데이터 형이 달라도 괜찮다		
	}
	public ConstructorTest(String name) {
		
	}
	public ConstructorTest(int num, String name,String tel) {
		//생성자에서 다른 생성자를 호출하기 위해서는 반드시 첫번째 실행문으로 처리해야한다
		this(num);	//생성자메소드를 쓰는 자리에다 this   생성자메소드를 부를수없지만 this를 붙이면 먼저 호출하는 생성자메소드 거기 가서 실해하고 돌아옴
		System.out.println("ConstructorTest(int num, String tel, String name)");
		//this.num = num;
		this.name = name;
		this.tel = tel;
	
	}
	public ConstructorTest(String name,  String tel,int num) {  //똑같은데 데이터 순서가 달라도 사용가능함
		this(num,name,tel);   //만들어져있는 걸 가져와서 사용하면 this 다른 생성자 호출
		
		
	}
	public void prn() {
		System.out.println("번호="+num);
		System.out.println("이름"+name);
		System.out.println("연락처="+tel);
	}
}


	
	
	
	
	
	

