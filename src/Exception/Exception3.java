package Exception;

import java.util.Scanner;

public class Exception3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			int a,b;

			System.out.println("�Է� ���� �� �� ������");
			System.out.print("ù��° ���� : ");
			a = scan.nextInt();
			System.out.print("�ι�° ���� : ");
			b = scan.nextInt();
			System.out.println(a+" / "+b+" = "+ (a/b) );

			System.out.println("��� �Ϸ�");			
		} catch (ArithmeticException e) {
			System.err.println("��� ����");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("���� ����");
		} finally {
			scan.close();
		}
	}

}
