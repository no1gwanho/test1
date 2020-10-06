//package p1.p2.p3;  패키지와 패키지 사이는.	지금은 경로안에 있어서 괜찮음 
import java.lang.String;
import java.util.Scanner;
import java.io.*;	//이렇게 쓰면 java패키지 안에 io라는 패키지가 있고 그안에 클래스 전체가 자바가상머신에 얹혀진다 근데 jvm이 무거워지니 지양

public class BasicOOP {
		//전역변수(멤버변수)
		int a=1234;		//0		전역변수는 초기값 설정을 안해도 기본데이터 타입으로 들어가있다.
		String name;	//null	전역변수는 class안에
		
		//생성자 메소드: 객체를 생성할때 딱 1 한번 실행한다. : 객체의 초기화 
		//객체가 생성될때 실행되는 메소드임, 호출이전에 객체를 생성할때 이미 사실 해당 클래스 내용이 실행이 된것임 왜? 생성자메소드기때문에
		//				메소드명이 반드시 클래스명이랑 같아야한다.
		public BasicOOP() {		//클래스명과 메소드명 일치! 그리고 소괄호가 붙음 그래서 메소드라 부름 *생성자메소드는 반환형이없다!!!! void이딴게 없다
			System.out.println("생성자="+a);
		}
									//생성자 메소드는 여러개 있을수 있는데 여러개 있을땐 괄호안이 뭔가 달라야함
		public BasicOOP(int a) {		//이렇게 하면  이제    = new BasicOOP();
										//괄호안에 int 변수를 넣었으니  = new BasicOOP(250); 이런식으로 사용가능
		}
	
		//메소드 반환형
		//		메소드는 소문자로 시작, 합성어일 경우 두번째 단어의 첫번째문자를 대문자... 숫자,_.$ 근데 특문은 거의 안씀
		// 단 첫번째 글자로 숫자가 오면 안됨 영어 소문자
		public void sum() {
			//기능구현
			int s=0;
			for(int i=1;i<10;i++) {
			 s+=i;
			}
			System.out.println("s="+s);
			System.out.println("sum->a="+a);
		}
	
		public void add(int a, int b) {
			int c = a+b;
			System.out.println("c="+c);
			class BBB{	//이것도 내부클래스이나 메소드 내부의 클래스라고 함, 아무튼 메소드안에도 클래스안에도 클래스를 생성할 수있음!
			
			}
		}
		public String getName() {
			return "홍길동";
		
		 }
		//내부클래스 -> 클래스 내에다가 또! 클래스를 만드는 것
	  class AAAA{

	  }
}//class 종료지점 


		
		

