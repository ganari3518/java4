package Chapter11;

import java.util.Scanner;

public class String_class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println("���ڿ��� ���� : "+str.length() );
		str = str.toUpperCase();
		System.out.println("���ڿ� �빮�ڷ� ��ȯ : "+ str);
		str = str.toLowerCase();
		System.out.println("���ڿ� �ҹ��ڷ� ��ȯ : "+str);
		
		String str2 = str.substring(5);
		System.out.println("str ���ڿ��� 5���� ���� ���ڿ� : "+str2);
		char c = str.charAt(2);
		System.out.println("str ���ڿ��� 2���� ���� : "+c);
		
		int num = str.indexOf("a");
		System.out.println("a������ ù���� �ڸ��� : "+num);
		int num2 = str.lastIndexOf("a");
		System.out.println("a������ ������ �ڸ��� : "+num2);
		
		String str3 = str.replace("a", "Q");
		System.out.println("a�� Q�� ������ : "+str);
		System.out.println("a�� Q�� ������ : "+str3);
		
		String str4 = "asdf@asdf@gyvuvu@sdfsdf";
		String str5[] = str4.split("@");
		
		for (int i = 0; i < str5.length; i++) {
			System.out.println(i+"�� " + str5[i]);
		}
		String str6 ="          asdasdasdasdasd     ";
		String str7 = str6.trim();
		System.out.println("���� ����" + str7);
		System.out.print("str6 �ܾ�� " + str6.length() + "     ");
		System.out.println("str7 �ܾ�� " + str7.length());
		
		int num3 = 23;
		int num4 = 35;
		
		System.out.println(String.valueOf(num3) + String.valueOf(num4));
	}

}
