import test.Car2;
public class Truck extends Car2 {

	public Truck() {				//super������ -> �ڽĻ����� -> �޼ҵ���� �����
		
		System.out.println("Truck()������");
		wheel = 10;
		System.out.println("Truck.wheel="+wheel);
	
	}

	public static void main(String[] args) {
		new Truck().speedUp();
		
		//protected���������ڴ� �ٸ� ��Ű�� Ŭ������ ����� ���
		// �ݵ�� ����� �޾ƾ� �Ѵ�.
		
		//Car2 car2 = new Car2();
		Car2 car2 = Car2.getInstance();
		//car.wheel = 12;
		
		//protected���������ڴ� ������Ű���� ��� ��ü�� �����Ͽ� ���ٰ����ϴ�.
		Car car = new Car();
		car.wheel = 15;
	}

}
