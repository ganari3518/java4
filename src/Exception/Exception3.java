package Exception;

import java.util.Scanner;

public class Exception3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			int a,b;

			System.out.println("입력 받은 두 수 나누기");
			System.out.print("첫번째 숫자 : ");
			a = scan.nextInt();
			System.out.print("두번째 숫자 : ");
			b = scan.nextInt();
			System.out.println(a+" / "+b+" = "+ (a/b) );

			System.out.println("계산 완료");			
		} catch (ArithmeticException e) {
			System.err.println("계산 예외");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("포멧 예외");
		} finally {
			scan.close();
		}
	}

}
