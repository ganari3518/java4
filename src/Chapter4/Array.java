package Chapter4;

public class Array {

	public static void main(String[] args) {
		int [] num = new int[5];
		
		for(int i=0; i<5 ; i++ ) {
			num[i] = i+1;
		}
		for(int i=0; i<5 ; i++ ) {
			System.out.println("num[" + i + "] = " + num[i]);
		}

	}

}
