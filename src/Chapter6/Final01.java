package Chapter6;

public class Final01 extends Final01_1{
//	public void print() {
//		System.out.println("���ǵ� �޼��带 �������̵� �� �� �����ϴ�");
//		System.out.println("���ǵ� �޼���� ��ü������ ���� �� �� �ֽ��ϴ�");
//	}  -> ����
	public static void main(String args[]) {
		Final01 Ft = new Final01();
		Ft.print();
	}
}

class Final01_1 {
	final public void print() {
		System.out.println("final�� ���ǵ� �޼��带 �������̵� �� �� �����ϴ�");
		System.out.println("final�� ���ǵ� �޼���� ��ü������ ���� �� �� �ֽ��ϴ�");
	}
}