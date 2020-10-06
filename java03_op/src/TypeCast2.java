
public class TypeCast2 extends TypeCast1 {

	int num = 200;
	String name = "GilDong";
	public TypeCast2() {
		
	}
	public void prn() {		//오버라이딩중임, 만약 여기 prn이 없다면 부모클래스로 올라가서 메소드를 찾아서 실행할 것이다.
		System.out.println("num="+num+", name="+name);
	}
	//오버라이딩 	모든클래스의 객체에는 equals가 무조건 있음, object로 돼있는것은 모두 가능함
	public boolean equals(Object obj) {
		TypeCast2 tc = (TypeCast2)obj;
		if(tc.num==100) {
			return false;
		}else {
			return true;
			
		}
			
	}
	
	
}
