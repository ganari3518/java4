package inner_class;

class Outer02{
	String arr[] = {"1","2","3"};
	public Outer02() {
		for (int i = 0; i < arr.length; i++) {
			Inner02 inner = new Inner02(arr[i]);
			inner.prn();
		}
	}
	
	class Inner02{
		String str;
		Inner02(String str){
			this.str = str;
		}
		
		public void prn() {
			System.out.println(str + "¹ø");
		}
	}
}

public class inner_class2 {

	public static void main(String[] args) {
		Outer02 out = new Outer02();
	}

}
