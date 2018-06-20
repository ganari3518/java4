package AWT;

import java.awt.Color;
import java.awt.Component;
import java.awt.Label;

public class AWT_Label extends MFrame {
	Label label1,label2,label3,label4,label5;
	 
	public AWT_Label(){
		super(400,300);
		setTitle("AWT");
	

		label1 = new Label("라벨1");
		label2 = new Label("라벨2");
		label3 = new Label("라벨3");
		label4 = new Label("라벨4");
		label5 = new Label("라벨5");
		
		
		label1.setBackground(Color.RED);
		label2.setBackground(Color.orange);
		label3.setBackground(Color.YELLOW);
		label4.setBackground(Color.GREEN);
		label5.setBackground(Color.BLUE);
		

		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
		
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new AWT_Label();
	} 

}
