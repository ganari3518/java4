package Chapter5;

public class Access_modifier2 extends testClass2{

	public static void main(String[] args) {
		Access_modifier2 print = new Access_modifier2();
		print.print();

	}

}

class testClass2{
	protected void print() {
		System.out.println("Ãâ·Â");
	}
}