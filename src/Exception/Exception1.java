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
			
			System.out.println("��� �Ϸ�");			
		} catch (Exception e) {
			System.out.println("0���� ������ �����ϴ�.");
			System.out.println("���� �޼���"+e.getMessage());
		}
		
	}

}
