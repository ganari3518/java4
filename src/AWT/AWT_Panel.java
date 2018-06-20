package AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemListener;

public class AWT_Panel extends MFrame{
	
	Label l1,l2,l3;
	Button b1,b2,b3;
	Panel p1,p2;
	TextArea ta;
	
	public AWT_Panel() {
		setTitle("AWT_Panel");
		setSize(250,400);
		setLayout(new BorderLayout());
		p1 = new Panel();
		
		p1.add(l1 = new Label("1¹ø"));
		p1.add(l2 = new Label("2¹ø"));
		p1.add(l3 = new Label("3¹ø"));
		
		add(p1,"North");

		ta = new TextArea();
		ta.setEditable(false);
		add(ta,"Center");
		ta.setSize(250,250);
		p2 = new Panel();
		
		b1 = new Button("Start");
		b2 = new Button("Stop");
		b3 = new Button("End");
				
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		add(p2,"South");
		
	}
	
	public static void main(String[] args) {
		new AWT_Panel();

	}

}
