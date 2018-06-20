package Chapter6;

public class Final01 extends Final01_1{
//	public void print() {
//		System.out.println("정의된 메서드를 오버라이딩 할 수 없습니다");
//		System.out.println("정의된 메서드는 객체생성을 통해 할 수 있습니다");
//	}  -> 오류
	public static void main(String args[]) {
		Final01 Ft = new Final01();
		Ft.print();
	}
}

class Final01_1 {
	final public void print() {
		System.out.println("final로 정의된 메서드를 오버라이딩 할 수 없습니다");
		System.out.println("final로 정의된 메서드는 객체생성을 통해 할 수 있습니다");
	}
}