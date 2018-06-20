package Chapter11;

import java.util.Scanner;

public class String_class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println("문자열의 길이 : "+str.length() );
		str = str.toUpperCase();
		System.out.println("문자열 대문자로 변환 : "+ str);
		str = str.toLowerCase();
		System.out.println("문자열 소문자로 변환 : "+str);
		
		String str2 = str.substring(5);
		System.out.println("str 문자열의 5번쨰 이후 문자열 : "+str2);
		char c = str.charAt(2);
		System.out.println("str 문자열의 2번쨰 문자 : "+c);
		
		int num = str.indexOf("a");
		System.out.println("a문자의 첫번쨰 자리값 : "+num);
		int num2 = str.lastIndexOf("a");
		System.out.println("a문자의 마지막 자리값 : "+num2);
		
		String str3 = str.replace("a", "Q");
		System.out.println("a를 Q로 변경전 : "+str);
		System.out.println("a를 Q로 변경후 : "+str3);
		
		String str4 = "asdf@asdf@gyvuvu@sdfsdf";
		String str5[] = str4.split("@");
		
		for (int i = 0; i < str5.length; i++) {
			System.out.println(i+"번 " + str5[i]);
		}
		String str6 ="          asdasdasdasdasd     ";
		String str7 = str6.trim();
		System.out.println("공백 제거" + str7);
		System.out.print("str6 단어수 " + str6.length() + "     ");
		System.out.println("str7 단어수 " + str7.length());
		
		int num3 = 23;
		int num4 = 35;
		
		System.out.println(String.valueOf(num3) + String.valueOf(num4));
	}

}
