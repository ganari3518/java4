package Chapter11;

public class Math_Class {

	public static void main(String[] args) {
		int a = -3;
		int b = 2;
		int c = 9;
		double d = 5.64;
		
		System.out.println("������ 5�� ���� ���� : " + (5 * 5 * Math.PI));
		System.out.println("���밪 : " + Math.abs(a));
		System.out.println("�ִ밪 : " + Math.max(a, b));
		System.out.println("�ּҰ� : " + Math.min(a, b));
		System.out.println("�����ٰ� : " + Math.sqrt(c));
		System.out.println("�ݿø��� : " + Math.round(d));
		System.out.println("������ : " + Math.floor(d));
		System.out.println("�ø��� : " + Math.ceil(d));
		System.out.println("1 ~ 6 ������ ���� : " + ((int)(Math.random()*6)+1));
		System.out.println("1 ~ 6 ������ ���� : " + ((int)(Math.random()*6)+1));		
	}
}