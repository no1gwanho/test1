
public class MethodTest2 {
	MethodTest2(){}
		
	
	//1~100까지 합은
	public void sum() {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum +=i;
		}
		System.out.println("1~100까지의 합은"+sum);
	}
	//1~어떤수까지 합을 구하는 
	public void total(int max) {
		int total = 0;
		for(int i=1;i<=max;i++) {
			total += i;
		}
		System.out.println("1~"+max+"까지의 합은"+total);
	}
		//1~어떤수까지 짝수의 합을 구하는
	public void evenSum(int max) {
		int sum=0;
		for(int i=2;i<=max;i+=2) {
			sum +=i;
						
		}
		System.out.println("1~"+max+"까지의 홀수의 합은"+sum);
	}
		
	//1~어떤수까지 홀수의 합을 구하는
	public void oddSum(int max) {
		int sum=0;
		for(int i=1;i<=max;i+=2) {
			sum +=i;
		}
		System.out.println("1~"+max+"까지의 홀수의 합은"+sum);
	}

	
	
	//
	public void getSum(int start, int max, int step) {	//공통으로 변하는 변수를 찾아서 매개변수로 만들어줌
		int sum=0;
		for(int i=start; i<=max; i+=step) {
			sum +=i;
		}
		System.out.println("1~"+max+"까지의 합은"+sum);
		
		
	}
	
	
	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		//mt.sum();
		//mt.total(200);
		MethodTest mt2 = new MethodTest();
		int max = mt2.getDan("정수");
		mt.getSum(1, max,1);
		mt.getSum(1, max,2);
		mt.getSum(1, max,2);
		
	}

}
