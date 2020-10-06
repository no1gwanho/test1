

class BBB {
	private String addr = "서울시 마포구 백범로";
	
	//private BBB() //객체생성불가
	BBB(){	
	System.out.println("BBBB()생성자메소드");
	}
	void output() {
		System.out.println("주소="+addr);
	}
}
