import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class TypeCastMain {

	public TypeCastMain() {
	}

	public static void main(String[] args) {
		TypeCast2 tc1 = new TypeCast2();
		tc1.prn();
		
		//����Ŭ������ ����Ŭ���� ������ ���Խ�ų��� ����Ŭ������ ����, �޼ҵ带 ȣ���Ѵ�.
		TypeCast1 tc2 = tc1;	 
		tc2.prn(); 				
							
		//����Ŭ������ü�� ����Ŭ���� ������ ������ ��� ������ ����ȯ�Ͽ��� �Ѵ�.
		TypeCast2 tc3 = (TypeCast2)tc2;	
		tc3.prn();
		
		TypeCast1 tc4 = new TypeCast2();
			
		
		List lst = new ArrayList();
	
		//���� Ŭ������ ���� �������̽��� �����ߴ��� ����Ŭ������ �ִ� �������̵��� �����鵵 ���� �Ѿ��
		InterfaceTest it = new InterfaceMain();
		System.out.println("it.minus="+it.minus(100, 50));
	
		InterfaceMain it2 = (InterfaceMain)it;
		System.out.println("it2.minus="+it2.minus(1000,200));
		
		
		System.out.println(tc1.equals(tc2));
		
		
		
	}

}
