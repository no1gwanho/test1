
public class ConstructorTestMain {

	public static void main(String[] args) {
		ConstructorTest ct1 = new ConstructorTest();
		ConstructorTest ct2 = new ConstructorTest(999);
		ConstructorTest ct3 = new ConstructorTest(555,"홍길동","010-777-888");  //이렇게 만들어주는 순간 클래스에 딱맞는 메소드만 실행됨
		ct1.prn();
		ct2.prn();
		ct3.prn();
		ConstructorTest ct4 = new ConstructorTest("세종대왕","010-5656-7878",333);
		ct4.prn();
		
		byte data[] = {65, 69, 70, 78,66};
		String dataObj= new String(data);
		System.out.println("dataObj="+dataObj);
		
	}

}
