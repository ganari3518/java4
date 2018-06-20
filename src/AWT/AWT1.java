package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class AWT1 extends Frame {
	
	Label label;
	Button button;
	
	public AWT1() {
		setTitle("AWT ¿¹Á¦");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		
		label = new Label("This is Label");
		button = new Button("This is button");
		
		label.setBackground(Color.CYAN);
		
		add(label);
		add(button);
	}
	public static void main(String[] args) {
		new AWT1();
	} 

}
