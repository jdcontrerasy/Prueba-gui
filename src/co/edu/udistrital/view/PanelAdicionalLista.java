package co.edu.udistrital.view;

import java.awt.*;
import javax.swing.*;


public class PanelAdicionalLista extends JPanel{

	private DefaultListModel<String> l1;
	private JList<String> lista;
	private JButton b;
 
	public PanelAdicionalLista() {
		setLayout(new FlowLayout());

		inicializarComponentes();

		setVisible(true);
	}


	public void inicializarComponentes() {
		l1 = new DefaultListModel<String>();
		l1.addElement("gmail.com");
		l1.addElement("hotmail.com");
		l1.addElement("yahoo.com");
		lista = new JList<String>(l1);  
		
		b=new JButton("Ver");
		b.setActionCommand("VER-LISTA");
		
		add(lista);
		add(b);
	}


	public DefaultListModel<String> getL1() {
		return l1;
	}


	public void setL1(DefaultListModel<String> l1) {
		this.l1 = l1;
	}


	public JList<String> getLista() {
		return lista;
	}


	public void setLista(JList<String> lista) {
		this.lista = lista;
	}


	public JButton getB() {
		return b;
	}


	public void setB(JButton b) {
		this.b = b;
	}
	
	
	
	
}
