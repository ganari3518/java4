package Chapter12;

import java.util.Random;

public class Random_class {

	public static void main(String[] args) {
		Random rm = new Random();

		int n1= rm.nextInt();
		System.out.println("n1 : "+n1); //int�� �������� ������ �����

		int n2= rm.nextInt(45)+1;
		System.out.println("n2 : "+n2); // 1 ~ 45 ������ ������ �����
		
		double d1 = rm.nextDouble();
		System.out.println("d1 : "+d1); // double�� ���� ���� ������ �����
		
		boolean b1 = rm.nextBoolean();
		System.out.println("b1 : "+b1); // true OR false ���
	}

}
