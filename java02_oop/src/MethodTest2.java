
public class MethodTest2 {
	MethodTest2(){}
		
	
	//1~100���� ����
	public void sum() {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum +=i;
		}
		System.out.println("1~100������ ����"+sum);
	}
	//1~������� ���� ���ϴ� 
	public void total(int max) {
		int total = 0;
		for(int i=1;i<=max;i++) {
			total += i;
		}
		System.out.println("1~"+max+"������ ����"+total);
	}
		//1~������� ¦���� ���� ���ϴ�
	public void evenSum(int max) {
		int sum=0;
		for(int i=2;i<=max;i+=2) {
			sum +=i;
						
		}
		System.out.println("1~"+max+"������ Ȧ���� ����"+sum);
	}
		
	//1~������� Ȧ���� ���� ���ϴ�
	public void oddSum(int max) {
		int sum=0;
		for(int i=1;i<=max;i+=2) {
			sum +=i;
		}
		System.out.println("1~"+max+"������ Ȧ���� ����"+sum);
	}

	
	
	//
	public void getSum(int start, int max, int step) {	//�������� ���ϴ� ������ ã�Ƽ� �Ű������� �������
		int sum=0;
		for(int i=start; i<=max; i+=step) {
			sum +=i;
		}
		System.out.println("1~"+max+"������ ����"+sum);
		
		
	}
	
	
	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		//mt.sum();
		//mt.total(200);
		MethodTest mt2 = new MethodTest();
		int max = mt2.getDan("����");
		mt.getSum(1, max,1);
		mt.getSum(1, max,2);
		mt.getSum(1, max,2);
		
	}

}
