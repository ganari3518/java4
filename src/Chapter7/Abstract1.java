package Chapter7;

public class Abstract1 extends Abs{
	public static void main(String[] args) {
		Abstract1 ab = new Abstract1();
		ab.play();
		ab.print();
	}

	@Override
	void play() {
		System.out.println(this.have1);			
		System.out.println(this.have2);			
		System.out.println(this.have3);
	}
}

abstract class Abs{
	int leg = 4;
	String have1 = "fur";
	String have2 = "toe";
	String have3 = "claw";
	
	abstract void play();
	
	void print() {
		System.out.println("print");
	}
}
