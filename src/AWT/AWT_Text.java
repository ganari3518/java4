package AWT;

import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class AWT_Text extends MFrame {
	Label name,pass;
	TextArea ta;
	TextField nametx,passtx;
	public AWT_Text() {
		super(250,300);
//		setTitle("AWT_Text");
		add(name = new Label("성명"));
		add(nametx = new TextField("",20));
		
		add(pass = new Label("암호"));
		add(passtx = new TextField("",20));
		passtx.setEchoChar('*');
		
		add(ta = new TextArea(10,30));
		
	}
	public static void main(String[] args) {
		new AWT_Text();
	}

}
