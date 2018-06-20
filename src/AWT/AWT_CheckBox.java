package AWT;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class AWT_CheckBox extends MFrame{

	Checkbox ch1,ch2,ch3;
	Checkbox rb1,rb2,rb3;
	CheckboxGroup grp;
	
	public AWT_CheckBox() {
		setTitle("AWT_Checkbox");
		
		add(ch1 = new Checkbox("ch1", false, null));
		add(ch2 = new Checkbox("ch1", null, true));
		add(ch3 = new Checkbox("ch1", false,null));
		
		grp = new CheckboxGroup();
		add(rb1 = new Checkbox("rb1",grp,false));
		add(rb2 = new Checkbox("rb1",grp,false));
		add(rb3 = new Checkbox("rb1",grp,true));
	}
	public static void main(String[] args) {
		new AWT_CheckBox();
	}

}
