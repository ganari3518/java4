package AWT;

import java.awt.Button;
import java.awt.FlowLayout;

public class AWT_Button extends MFrame{
	
	Button strbtn,finbtn;
	
	public AWT_Button(){
		super(400,300);
		
		strbtn = new Button("Ω√¿€");
		finbtn = new Button("≥°");
		
		add(strbtn);
		add(finbtn);
		
		setLayout(new FlowLayout());
		
	}	

	public static void main(String[] args) {
		new AWT_Button();

	}

}
