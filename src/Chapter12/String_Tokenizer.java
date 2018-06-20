package Chapter12;

import java.util.StringTokenizer;

public class String_Tokenizer {

	public static void main(String[] args) {
		String s1 = "�ڹ� JSP Android Spring";
		StringTokenizer st1 = new StringTokenizer(s1);
		int n1 = st1.countTokens();
		System.out.println("���ҵ� ���ڿ��� ���� : "+n1);
		while (st1.hasMoreElements()) {
			System.out.println(st1.nextToken());
		}
		System.out.println("--------------------");
		String s2 = "����;�λ�;���;��õ;�뱸;����";
		StringTokenizer st2 = new StringTokenizer(s2,";");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
	}

}
