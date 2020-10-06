package test;

public class CCC {
	protected String tel = "010-1234-5678";
	protected CCC() {							//접근제어자 default
		System.out.println("CCC()생성자");
				
	}
	protected void sum() {		//접근제어자 default
		int s=0;
		for(int i=0; i<=100;i++)
			s+=i;
	
	System.out.println(("1부터~100까지의 합은"+s));
	}
public static CCC getInstance() {
	return new CCC();
}

}
