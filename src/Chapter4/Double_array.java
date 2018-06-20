package Chapter4;

public class Double_array {
	public static void main(String[] args) {
		int [][] num = new int[2][2];
		int n = 10;
		
		for(int i=0; i<2 ; i++ ) {
			for(int j=0; j<2 ; j++ ) {
				num[i][j] = n;
				n++;
			}
		}
		
		for(int i=0; i<2 ; i++ ) {
			for(int j=0; j<2 ; j++ ) {
				System.out.println("num[" + i + "]["+ j +"] = " + num[i][j]);	
			}
		}
	}
}
