package Chapter5;

public class Access_modifier {

	public static void main(String[] args) {
		testClass user = new testClass();
		String id = user.getId();
		System.out.println("���̵�� "+id+" �Դϴ�");

	}

}

class testClass{
	String id;
	private void pwck(){
		String pw;
		this.id = "admin";
		pw = "1234";
	}
	public String getId() {
		pwck();
		return id;
	}
}