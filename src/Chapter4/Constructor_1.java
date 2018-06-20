package Chapter4;

public class Constructor_1 {

	public static void main(String[] args) {
		Constructor car1 = new Constructor();
		
		car1.print();
		
		car1.carname = "K3";
		car1.speed = 12;

		car1.print();
		
		System.out.println("car2");
		
		
		Constructor car2 = new Constructor("Sonata", 100);
		car2.print();
		

	}

}
