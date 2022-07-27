package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelImagen extends JPanel {
	
	private JLabel l1;
		
	public PanelImagen() {
		setLayout(new FlowLayout());
		
		inicializarComponentes();
		
		setVisible(true);
	}

	public void inicializarComponentes() {
		
		setBackground(Color.WHITE);
		setBorder( new TitledBorder( "Imagen de la persona:" ) ) ;
				
		l1 = new JLabel();
		add(l1);
		
	}
	
	public void cambiarImagen(String elem) {
		if(elem.equals("")) {
			l1.setIcon(null);
		}else {
			ImageIcon im = new ImageIcon(getClass().getResource("/imagenes/"+elem+".jpg"));
			ImageIcon icono = new ImageIcon(im.getImage().getScaledInstance(this.getWidth()-30, this.getHeight()-30, Image.SCALE_DEFAULT));
			l1.setIcon(icono);
		}
	}

	public JLabel getL1() {
		return l1;
	}

	public void setL1(JLabel l1) {
		this.l1 = l1;
	}
	
}
