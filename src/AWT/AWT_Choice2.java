package AWT;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AWT_Choice2 extends MFrame implements ItemListener{
	Choice air, city;
	Label label;
	
	String[] sair = {"대한항공","아시아나","제주에어"};
	String[] scity = {"서울","인천","대구","제주도"};
	
	public AWT_Choice2() {
		super(400,300);
		setTitle("비행");
		
		air = new Choice();
		city = new Choice();
		
		for (int i = 0; i < sair.length; i++) {
			air.add(sair[i]);
		}
		for (int i = 0; i < scity.length; i++) {
			city.add(scity[i]);
		}
		add(label = new Label("항공사와 도시를 선택해주세요"));
		add(air);
		add(city);
	
		air.addItemListener(this);
		city.addItemListener(this);
	}
	@Override	
	public void itemStateChanged(ItemEvent e) {
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		String msg = "항공사 선택 : "+ air.getSelectedItem();
		g.drawString(msg, 30, 120);
		
		g.setColor(Color.RED);
		msg = "도시 선택 : "+ city.getSelectedItem();
		g.drawString(msg, 30, 150);
	}
	public static void main(String[] args) {
		new AWT_Choice2();

	}

}
