
public class TypeCast2 extends TypeCast1 {

	int num = 200;
	String name = "GilDong";
	public TypeCast2() {
		
	}
	public void prn() {		//�������̵�����, ���� ���� prn�� ���ٸ� �θ�Ŭ������ �ö󰡼� �޼ҵ带 ã�Ƽ� ������ ���̴�.
		System.out.println("num="+num+", name="+name);
	}
	//�������̵� 	���Ŭ������ ��ü���� equals�� ������ ����, object�� ���ִ°��� ��� ������
	public boolean equals(Object obj) {
		TypeCast2 tc = (TypeCast2)obj;
		if(tc.num==100) {
			return false;
		}else {
			return true;
			
		}
			
	}
	
	
}
