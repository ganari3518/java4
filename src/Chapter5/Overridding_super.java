package Chapter5;

public class Overridding_super extends over {
	void use() {
		System.out.println("자식 클래스");		
		super.use();
	}
	public static void main(String[] args) {
		Overridding_super ov = new Overridding_super();
		ov.use();
	}

}

class over {
	void use() {
		System.out.println("부모 클래스");
	}
}
