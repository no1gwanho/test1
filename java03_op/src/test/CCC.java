package test;

public class CCC {
	protected String tel = "010-1234-5678";
	protected CCC() {							//���������� default
		System.out.println("CCC()������");
				
	}
	protected void sum() {		//���������� default
		int s=0;
		for(int i=0; i<=100;i++)
			s+=i;
	
	System.out.println(("1����~100������ ����"+s));
	}
public static CCC getInstance() {
	return new CCC();
}

}
