package Exception;

public class Exception2 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
		} catch (Exception e) {
			System.out.println("배열 에러 입니다.");
		} finally {
			System.out.println("에러와 상관 없이 무조건 출력");
		}
	}

}
