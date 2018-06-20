package Exception;

public class Exception1 {

	public static void main(String[] args) {
		int a = 22;
		int b = 0;
		try {
			System.out.println("a+b = "+ (a+b) );
			System.out.println("a-b = "+ (a-b) );
			System.out.println("a*b = "+ (a*b) );
			System.out.println("a/b = "+ (a/b) );
			
			System.out.println("계산 완료");			
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println("예외 메세지"+e.getMessage());
		}
		
	}

}
