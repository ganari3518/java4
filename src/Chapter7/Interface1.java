package Chapter7;

abstract class sound {
	String sound = "소리";
	abstract public void sound(String sound); 
}

class Dog extends sound{
	@Override
	public void sound(String sound) {
		System.out.println("개" + sound);
	}
}

class Cat extends sound{
	@Override
	public void sound(String sound) {
		System.out.println("고양이" + sound);
	}
}

public class Interface1{
	public static void main(String[] arg) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(dog.sound);
		cat.sound(cat.sound);
	}
	
}