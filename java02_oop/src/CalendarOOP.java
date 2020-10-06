import java.util.Calendar;
import java.util.Scanner;
public class CalendarOOP {
	Calendar date = Calendar.getInstance();	//���� ��¥��									//�̰͵� scan�� ���������� ���÷� ����Ѵٸ� ��������� �÷��� �ȴ�.	
	
	public CalendarOOP(){}			//������ �ʿ��� �������	//1.
	//�Է� - �ֿܼ��� �����Է�
	public int getInt(String msg) {
		Scanner scan = new Scanner(System.in); //���÷� scan�� ����Ѵٸ� ��������� �÷����ȴ�.
		System.out.print(msg+"->");		
		return  scan.nextInt();	//�߰��� �޾Ƽ� ������ ��Ƽ� �۾����ϸ� ������������
									// �ٷ� �����ҰŸ� �̷��� �ᵵ��

	}
	//���� - �Է¹��� ��,��,1���� ������������ ���Ѵ�.			//3.
	public int getweek(int year, int month) {
	
		date.set(year,month-1,1);		//��, ��, 1
		return date.get(Calendar.DAY_OF_WEEK);
	}
	
	//����
	public void titlePrint(int week, int day) {
		String weekStr[] = {"��","��","ȭ","��","��","��","��"};			//�迭 ���� �Ƚᵵ ��
			for(String w : weekStr) {
				System.out.print(w+"\t");
			}
			System.out.println();
			spacePrint(week,day);
	}
	
	public void spacePrint(int week, int day) {		//�������
		for(int i =1;i<week;i++) {
			System.out.print("\t");
		}
		dayPrint(day,week);
		
	}
	
	
	
	//��¥ ���
	public void dayPrint(int day,int week) {	
		for(int d=1; d<=day;d++) {
			System.out.print(d+"\t");
			if((week-1+d)%7==0) {
				System.out.println();			//��¥ ��µ� ���� �ٹٲ��� ���ٰ��̳�? 
			}
		}
		System.out.println();
		
	}
	
	
	
	
	
	public void start() {	
		int y = getInt("�⵵");	//���⿡ ���� �Է��� ������ getInt�� ���ٰ� ���ƿ�					//2.
		int m	= getInt("��");		//�Է°��� �ٸ��� �Է¹���� �Ȱ��⶧���� �̷��� ����
		int w = getweek(y,m);
									//�������� ���Ѵٰ� switch�� ������ API�� �ϼ��Ȱ� ����
		int lastDay = date.getActualMaximum(Calendar. DAY_OF_MONTH);		//API�� ���� ��ȣ�ȿ� �ִ� ����ū���� �ҷ����شٰ� ������
		System.out.println("����="+w);
		System.out.println("��������="+lastDay);
		
		//titlePrint();
		//spacePrint(w);
		//dayPrint(lastDay,w);
		titlePrint(w,lastDay);
	}
	
	
	//���� �޼ҵ�
		
	public static void main(String[] args) {
		CalendarOOP oop = new CalendarOOP();
		oop.start();
		System.out.println("���α׷��� ����Ǿ����ϴ�.")	;
	}

}
