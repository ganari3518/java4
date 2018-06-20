package Java_Basic_Class;

class Point1{
	
}
public class Object_class1 {

	public static void main(String[] args) {
		Point1 P = new Point1();
		System.out.println("클래스 이름 : " + P.getClass());
		System.out.println("해쉬코드 : " + P.hashCode());
		System.out.println("객체문자열  : " + P.toString());
		System.out.println("-------------------");
		Point1 P1 = new Point1();
		System.out.println("클래스 이름 : " + P1.getClass());
		System.out.println("해쉬코드 : " + P1.hashCode());
		System.out.println("객체문자열  : " + P1.toString());
		
		String s = new String("안녕하세요");
		System.out.println(s.toString());
	}

}
