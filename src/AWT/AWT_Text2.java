package AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_Text2 extends MFrame implements ActionListener{
	
	TextArea ta;
	TextField tf;
	Button btn;
	Panel p;
	public AWT_Text2(){
		setSize(250,300);
		setTitle("AWT_Text2");
		setLayout(new BorderLayout());
		add(ta = new TextArea());
		ta.setEditable(false);
		
		p = new Panel();		
		p.add(tf = new TextField(22));
		p.add(btn = new Button("SEND"));
		
		add("South",p);
		
		tf.addActionListener(this);
		btn.addActionListener(this);
		tf.requestFocus();
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText();
		if(!str.equals(null)) {
			ta.append(str+"\n");
			tf.setText(null);
		}
		tf.requestFocus();
	}
	
	static public void main(String[] args) {
		new AWT_Text2();
	}
}
