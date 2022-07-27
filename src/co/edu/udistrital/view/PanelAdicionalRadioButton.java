package co.edu.udistrital.view;

import java.awt.*;
import javax.swing.*;


public class PanelAdicionalRadioButton extends JPanel{

	private JRadioButton cb1,cb2,cb3;  
	private JButton b;  
	public PanelAdicionalRadioButton() {
		setLayout(new FlowLayout());

		inicializarComponentes();

		setVisible(true);
	}


	public void inicializarComponentes() {
		cb1=new JRadioButton("Pizza @ 100");  
		cb2=new JRadioButton("Hamburguesa @ 30");  
		cb3=new JRadioButton("Café @ 10"); 		
		ButtonGroup bg=new ButtonGroup();
		bg.add(cb1);
		bg.add(cb2);
		bg.add(cb3);
		bg.add(b);
		
		
		b=new JButton("Ver orden");
		b.setActionCommand("VERORDEN-RADIO");		
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(b);

	}


	public JRadioButton getCb1() {
		return cb1;
	}


	public void setCb1(JRadioButton cb1) {
		this.cb1 = cb1;
	}


	public JRadioButton getCb2() {
		return cb2;
	}


	public void setCb2(JRadioButton cb2) {
		this.cb2 = cb2;
	}


	public JRadioButton getCb3() {
		return cb3;
	}


	public void setCb3(JRadioButton cb3) {
		this.cb3 = cb3;
	}


	public JButton getB() {
		return b;
	}


	public void setB(JButton b) {
		this.b = b;
	}

	

	
}
