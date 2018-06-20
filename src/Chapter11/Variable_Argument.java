package Chapter11;

public class Variable_Argument {
	public static void plus(int n1,int n2) {
		int sum =0;
		sum = n1 + n2;
		System.out.println("sum(2개) : "+sum);
	}
	public static void plus(int n1,int n2,int n3) {
		int sum =0;
		sum = n1 + n2 + n3;
		System.out.println("sum(3개) : " + sum);
	}
	public static void plus(int[] arr) {
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];			
		}
		System.out.println("sum("+(arr.length+1)+"개) : " + sum);
	}
	
	public static void vplus(int...arr) {
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];			
		}
		System.out.println("vsum("+(arr.length+1)+"개) : " + sum);
	}
	
	public static void main(String[] args) { 
		int [] arr = {2,5,7,2,12};
		plus(2,5);
		plus(2,5,7);
		plus(arr);
		vplus(2,5);
		vplus(2,5,7,2,12);

	}

}
