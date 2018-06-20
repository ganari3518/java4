package AWT;

import java.awt.List;

public class AWT_List extends MFrame{
	List list1,list2;

	String[] team1 = {"두산","한화","LG","SK","넥센"}; 
	String[] team2 = {"KIA","롯데","삼성","KT","NC"};
	public AWT_List(){
		super(300,150);
		setTitle("AWT_List");
		list1 = new List(5,false); // List(보여줄 값의 개수,다중 선택 유무)
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
