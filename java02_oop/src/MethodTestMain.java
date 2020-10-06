
public class MethodTestMain {
	public MethodTestMain() {
			MethodTest mt = new MethodTest();
		    //mt.getDan();//단입력받는 기능이 있는 메소드 호출
			//mt.danOutput();//입력받은 dan을 이용하여 해당 구구단 출력하는 메소드
			mt.startDan(); 	 		//메소드를 붙인 메소드를 만들어서 한번에 불러오게 했음
	}
	
	
	
	public static void main(String[] args) {
		new MethodTestMain();	

		
		
		//원래는 멤버에 값을 넣고쓰는게 제일 편하지만 만약 그 기능이없다면?
		//메소드 내부에 변수를 잡는데 그건 다른곳에서 쓸수가없다
		//그래서 메소드 반환형을 바꿔줘서 매개변수를 이용해 쓸수는 있는데 복잡함...
	}

}
