package Java_Basic_Class;

class Point1{
	
}
public class Object_class1 {

	public static void main(String[] args) {
		Point1 P = new Point1();
		System.out.println("Ŭ���� �̸� : " + P.getClass());
		System.out.println("�ؽ��ڵ� : " + P.hashCode());
		System.out.println("��ü���ڿ�  : " + P.toString());
		System.out.println("-------------------");
		Point1 P1 = new Point1();
		System.out.println("Ŭ���� �̸� : " + P1.getClass());
		System.out.println("�ؽ��ڵ� : " + P1.hashCode());
		System.out.println("��ü���ڿ�  : " + P1.toString());
		
		String s = new String("�ȳ��ϼ���");
		System.out.println(s.toString());
	}

}
