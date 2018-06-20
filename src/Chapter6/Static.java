package Chapter6;

public class Static {
	
	static int Stnum = 100;
	int num = 500;
	public static void main(String[] args) {
		Stnum = 200;
		Static st = new Static();
		System.out.println("st.num : " + st.num);
		System.out.println("Static number : "+ Stnum);
	}

}
