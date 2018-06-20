package Chapter5Constructor;

public class Con_overloading {


	public static void main(String[] args) {
		Conclass co1 = new Conclass();
		co1.print();
		Conclass co2 = new Conclass("KIM");
		co2.print();
		Conclass co3 = new Conclass(15000);
		co3.print();
		Conclass co4 = new Conclass("LEE",20000);
		co4.print();
	}
}

class Conclass {
	String name;
	int money;

	public Conclass () {

	}

	public Conclass (String name) {
		this.name = name;
	}

	public Conclass (int money) {
		this.money = money;
	}

	public Conclass (String name,int money) {
		this.name = name;
		this.money = money;
	}

	public void print() {
		System.out.println("name : "+ name + "  money : " + money);
	}
}
