package Chapter5;

public class Overridding_super extends over {
	void use() {
		System.out.println("�ڽ� Ŭ����");		
		super.use();
	}
	public static void main(String[] args) {
		Overridding_super ov = new Overridding_super();
		ov.use();
	}

}

class over {
	void use() {
		System.out.println("�θ� Ŭ����");
	}
}
