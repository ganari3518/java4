package Exception;

public class Exception4 {
	int a = 10;
	
	public void tMethod(int b) throws Exception{
		if (b==0) {
			throw new Exception("a는 0으로 나누면 안돼요");
		} else {
			System.out.println(a + " / "+b+"="+(a/b));
		}
	}
	public static void main(String[] args) {
		Exception4 E4 = new Exception4();
		
		try {
			E4.tMethod(10);
			E4.tMethod(0);
		} catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}
