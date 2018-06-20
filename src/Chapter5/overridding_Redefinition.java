package Chapter5;

public class overridding_Redefinition extends parents{

	public static void main(String[] args) {
		overridding_Redefinition ov = new overridding_Redefinition();
		ov.use();
		
	}
	void use() {
		System.out.println("자식");
	}
}

class parents {
	void use() {
		System.out.println("부모");
	}
}
