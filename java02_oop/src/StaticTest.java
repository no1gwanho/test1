import java.util.Calendar;

public class StaticTest {

	public static void main(String[] args) {
		BBB b = new BBB();
		System.out.println("b.num="+b.num);
		//static Ű���尡 ������� ǥ��� ��� ��ü�� �������� �ʰ� �����Ҽ� �ִ�.
		
		System.out.println("AAA.num="+ AAA.num);
		
		
		CCC c1 = new CCC();
		CCC c2 = new CCC();
		CCC c3 = new CCC();
		
		//static ������ ��ü�� ������ �� ��ü�� ���뺯���� ����Ѵ�.
		//c1.name = "�������";  //��ü�� ���ؼ� �����ߴµ� static�̱� ������ ��������� ��µ�
		c3.print();
		
		
		//static �޼ҵ� ǥ���ϴ� ��� ��ü�������� �ʰ� �޼ҵ带 ȣ���� �� �ִ�.
		CCC.print();  //c3.print() ó�� �޼ҵ带 �θ����ʰ� ��ü���� Ŭ����.print()�� �θ�������
	
		Math.random();
		Calendar.getInstance();
	 
	BBB b2	= BBB.getInstance();			//Calendar �޼ҵ尡 ��������� ����
	System.out.println("b2.num="+b2.num);
	
	}

}
