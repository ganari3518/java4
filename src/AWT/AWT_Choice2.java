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
	
	String[] sair = {"�����װ�","�ƽþƳ�","���ֿ���"};
	String[] scity = {"����","��õ","�뱸","���ֵ�"};
	
	public AWT_Choice2() {
		super(400,300);
		setTitle("����");
		
		air = new Choice();
		city = new Choice();
		
		for (int i = 0; i < sair.length; i++) {
			air.add(sair[i]);
		}
		for (int i = 0; i < scity.length; i++) {
			city.add(scity[i]);
		}
		add(label = new Label("�װ���� ���ø� �������ּ���"));
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
		String msg = "�װ��� ���� : "+ air.getSelectedItem();
		g.drawString(msg, 30, 120);
		
		g.setColor(Color.RED);
		msg = "���� ���� : "+ city.getSelectedItem();
		g.drawString(msg, 30, 150);
	}
	public static void main(String[] args) {
		new AWT_Choice2();

	}

}
