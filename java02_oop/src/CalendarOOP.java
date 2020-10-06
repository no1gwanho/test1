import java.util.Calendar;
import java.util.Scanner;
public class CalendarOOP {
	Calendar date = Calendar.getInstance();	//현재 날짜임									//이것도 scan과 마찬가지로 수시로 써야한다면 멤버변수로 올려도 된다.	
	
	public CalendarOOP(){}			//생성자 필요없어도 만들어줌	//1.
	//입력 - 콘솔에서 정수입력
	public int getInt(String msg) {
		Scanner scan = new Scanner(System.in); //수시로 scan을 써야한다면 멤버변수로 올려도된다.
		System.out.print(msg+"->");		
		return  scan.nextInt();	//중간에 받아서 변수에 담아서 작업을하면 변수에담지만
									// 바로 리턴할거면 이렇게 써도됨

	}
	//요일 - 입력받은 연,월,1일이 무슨요일인지 구한다.			//3.
	public int getweek(int year, int month) {
	
		date.set(year,month-1,1);		//년, 월, 1
		return date.get(Calendar.DAY_OF_WEEK);
	}
	
	//제목
	public void titlePrint(int week, int day) {
		String weekStr[] = {"일","월","화","수","목","금","토"};			//배열 굳이 안써도 됨
			for(String w : weekStr) {
				System.out.print(w+"\t");
			}
			System.out.println();
			spacePrint(week,day);
	}
	
	public void spacePrint(int week, int day) {		//공백찍기
		for(int i =1;i<week;i++) {
			System.out.print("\t");
		}
		dayPrint(day,week);
		
	}
	
	
	
	//날짜 찍기
	public void dayPrint(int day,int week) {	
		for(int d=1; d<=day;d++) {
			System.out.print(d+"\t");
			if((week-1+d)%7==0) {
				System.out.println();			//날짜 찍는데 언제 줄바꿈을 해줄것이냐? 
			}
		}
		System.out.println();
		
	}
	
	
	
	
	
	public void start() {	
		int y = getInt("년도");	//여기에 내가 입력한 연도가 getInt에 갔다가 돌아옴					//2.
		int m	= getInt("월");		//입력값만 다르고 입력방식은 똑같기때문에 이렇게 해줌
		int w = getweek(y,m);
									//마지막날 구한다고 switch를 썻지만 API에 완성된게 있음
		int lastDay = date.getActualMaximum(Calendar. DAY_OF_MONTH);		//API를 보면 괄호안에 있는 가장큰것을 불러와준다고 돼있음
		System.out.println("요일="+w);
		System.out.println("마지막날="+lastDay);
		
		//titlePrint();
		//spacePrint(w);
		//dayPrint(lastDay,w);
		titlePrint(w,lastDay);
	}
	
	
	//실행 메소드
		
	public static void main(String[] args) {
		CalendarOOP oop = new CalendarOOP();
		oop.start();
		System.out.println("프로그램이 종료되었습니다.")	;
	}

}
