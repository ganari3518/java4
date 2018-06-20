package AWT;

import java.awt.Canvas;
import java.awt.Color;

public class AWT_Canvas extends MFrame{
	
	Canvas cv;
	
	public AWT_Canvas() {
		setTitle("AWT_Canvas");
		cv = new Canvas();
		cv.setSize(100,100);
		cv.setBackground(Color.gray);
		add(cv);
		
	}
	static public void main(String[] args) {
		new AWT_Canvas();
	}
}
