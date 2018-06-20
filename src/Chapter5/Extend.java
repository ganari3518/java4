package Chapter5;

public class Extend extends top{
	void use(){
		str ="asd";
		System.out.println(str);
	}
	public static void main(String[] args) {
		Extend ex = new Extend();
		ex.use();
	}
}
class top {
	String str;
}
