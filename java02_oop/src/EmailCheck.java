import java.util.Scanner;
public class EmailCheck {

	
	public EmailCheck() {}

	Scanner scan = new Scanner(System.in);
	
	
	public void idInput() {							//아이디 입력 input값을 바로 밑 checker메소드로 보냄
		System.out.println("아이디 입력");
		String input = scan.nextLine();
		checker(input);
	}
		
	public void checker(String input) {			//id check 수행후 input으로 돌아감
		int idxLast = input.lastIndexOf("@");
		int idx = input.indexOf("@");
		String email = input.substring(0,idx);		
		String domain = input.substring(idx+1);
			if(idxLast!=8) {										//lastindex 뭔가 이상함...
				System.out.println("아이디="+email);
				System.out.println("도메인="+domain);
			}else if(idx==0 || idxLast>8) {
				System.out.println( "이메일 혹은 도메인을 잘못 입력하셨습니다."   );
			}
	}
	
	public String getEndQna() {
		System.out.println("계속하시겠습니까?(Y:예 , N:아니오)?");
		return scan.nextLine();
	}
	
	public void print() {
		System.out.println("아이디=");
		System.out.println("도메인=");
	}
	
	
	public void start() {
		a:
		do{  idInput();
			String qna = getEndQna();
			
		do {	
			if(qna.equalsIgnoreCase("Y")) {
				break;
			}else if(qna.equalsIgnoreCase("N")) {
				System.out.println("프로그램 종료...");
				break a;
			}
		}while(true);
		
		
		}while(true);
	}
		
	
	
	public static void main(String[] args) {
		EmailCheck c1 = new EmailCheck();
		c1.start();
	}

}


/*
실행
이메일 입력=ㅁㄶㄹuma nate.com
잘못된 이메일주소 입니다.
이메일 입력=goguma@nate.com
아이디=goguma
도메인=nate.com
계속하시겠습니까?(Y:예, N:아니오)?
*/