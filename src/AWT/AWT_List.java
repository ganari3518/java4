package AWT;

import java.awt.List;

public class AWT_List extends MFrame{
	List list1,list2;

	String[] team1 = {"�λ�","��ȭ","LG","SK","�ؼ�"}; 
	String[] team2 = {"KIA","�Ե�","�Ｚ","KT","NC"};
	public AWT_List(){
		super(300,150);
		setTitle("AWT_List");
		list1 = new List(5,false); // List(������ ���� ����,���� ���� ����)
		for (int i = 0; i < team1.length; i++) {
			list1.add(team1[i]);
		}
		
		list2 = new List(5,true);
		for (int i = 0; i < team2.length; i++) {
			list2.add(team2[i]);
		}

		add(list1);
		add(list2);
	}

	public static void main(String[] args) {
		new AWT_List();
	}

}
