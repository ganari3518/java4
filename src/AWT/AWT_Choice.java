package AWT;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AWT_Choice extends MFrame implements ItemListener {
	Choice ch;
	Label lb;
	String[] arr = {"서울","부산","경기","인천"};
	public AWT_Choice() {
		ch = new Choice();
		for (int i = 0; i < arr.length; i++) {
			ch.add(arr[i]);
		}
		add(ch);
		
		ch.addItemListener(this);	
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		String str = ch.getSelectedItem();
		g.setColor(Color.black);
		g.drawString(str, 30, 120);
	}
	public static void main(String[] args) {
		new AWT_Choice();
	}

}
