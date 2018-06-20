package Java_Basic_Class;

public class Character_Class {

	public static void main(String[] args) {
		char c1 = 'j';
		System.out.print(c1);
		if(Character.isLetter(c1))
			System.out.println(" : 문자입니다.");
		
		char c2 = 'a';
		System.out.print(c2);
		if(Character.isUpperCase(c2))
			System.out.println(" : 대문자입니다.");
		else if(Character.isLowerCase(c2))
			System.out.println(" : 소문자입니다.");
		
		char c3 = '3';
		System.out.print(c3);
		if(Character.isDigit(c3))
			System.out.println(" : 숫자 입니다");
	}

}
