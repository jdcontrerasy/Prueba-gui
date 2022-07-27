package co.edu.udistrital.view;

import java.awt.*;
import javax.swing.*;


public class PanelAdicionalCheckBox extends JPanel{

	private JCheckBox cb1,cb2,cb3;  
	private JButton b;  
	public PanelAdicionalCheckBox() {
		setLayout(new FlowLayout());

		inicializarComponentes();

		setVisible(true);
	}


	public void inicializarComponentes() {
		cb1=new JCheckBox("Pizza @ 100");  
		cb2=new JCheckBox("Hamburguesa @ 30");  
		cb3=new JCheckBox("Café @ 10"); 
		b=new JButton("Ver orden");
		b.setActionCommand("VERORDEN-CHECK");		
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(b);

	}


	public JCheckBox getCb1() {
		return cb1;
	}


	public void setCb1(JCheckBox cb1) {
		this.cb1 = cb1;
	}


	public JCheckBox getCb2() {
		return cb2;
	}


	public void setCb2(JCheckBox cb2) {
		this.cb2 = cb2;
	}


	public JCheckBox getCb3() {
		return cb3;
	}


	public void setCb3(JCheckBox cb3) {
		this.cb3 = cb3;
	}


	public JButton getB() {
		return b;
	}


	public void setB(JButton b) {
		this.b = b;
	}
	
	
}
