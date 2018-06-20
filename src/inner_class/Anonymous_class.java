package inner_class;

interface MyInter{
	void prn();
}
public class Anonymous_class {
	public static void main(String[] args) {
		new MyInter() {

			@Override
			public void prn() {
				System.out.println("WOW");
			}
			
		}.prn();

	}

}
