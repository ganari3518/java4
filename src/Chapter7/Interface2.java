package Chapter7;

public class Interface2 implements A1, B1{

	@Override
	public void lightON() {
		System.out.println("Light ON");
	}

	@Override
	public void turnON() {		
		System.out.println("Turn ON");
	}
	
	public static void main(String arg[]) {
		Interface2 In = new Interface2();
		
		In.lightON();
		In.turnON();
	}
	
	
}

interface A1{
	public abstract void turnON();
}

interface B1{
	public abstract void lightON();
}