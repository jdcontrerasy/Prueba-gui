package co.edu.udistrital.view;

import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {

	private PanelDatos pdatos;
	private PanelInformacion pinformacion;
	private PanelImagen pimagen;
	private PanelAdicionalCheckBox padicionalCheck;
	private PanelAdicionalRadioButton padicionalRadio;
	private PanelAdicionalLista padicionalLista;


	

	public VentanaPrincipal() {
		setTitle("Programa");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(253,119,253));
		getContentPane().setLayout(new BorderLayout(10,10));

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {
		pdatos = new PanelDatos();
		getContentPane().add(pdatos,BorderLayout.NORTH);

		pinformacion = new PanelInformacion();
		getContentPane().add(pinformacion,BorderLayout.WEST);

		pimagen = new PanelImagen();
		getContentPane().add(pimagen,BorderLayout.CENTER);


//		padicionalCheck = new PanelAdicionalCheckBox();
//		getContentPane().add(padicionalCheck,BorderLayout.SOUTH);
//
//		padicionalCheck.setComponentOrientation(
//				ComponentOrientation.LEFT_TO_RIGHT);
		
		
//		padicionalRadio = new PanelAdicionalRadioButton();
//		getContentPane().add(padicionalRadio,BorderLayout.SOUTH);
//
//		padicionalRadio.setComponentOrientation(
//				ComponentOrientation.LEFT_TO_RIGHT);
		
		padicionalLista = new PanelAdicionalLista();
		getContentPane().add(padicionalLista,BorderLayout.SOUTH);
		
		
	}

	public PanelDatos getPdatos() {
		return pdatos;
	}

	public void setPdatos(PanelDatos pdatos) {
		this.pdatos = pdatos;
	}

	public PanelInformacion getPinformacion() {
		return pinformacion;
	}

	public void setPinformacion(PanelInformacion pinformacion) {
		this.pinformacion = pinformacion;
	}

	public PanelImagen getPimagen() {
		return pimagen;
	}

	public void setPimagen(PanelImagen pimagen) {
		this.pimagen = pimagen;
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}
	


	public PanelAdicionalCheckBox getPadicionalCheck() {
		return padicionalCheck;
	}

	public void setPadicionalCheck(PanelAdicionalCheckBox padicionalCheck) {
		this.padicionalCheck = padicionalCheck;
	}

	public PanelAdicionalRadioButton getPadicionalRadio() {
		return padicionalRadio;
	}

	public void setPadicionalRadio(PanelAdicionalRadioButton padicionalRadio) {
		this.padicionalRadio = padicionalRadio;
	}

	public PanelAdicionalLista getPadicionalLista() {
		return padicionalLista;
	}

	public void setPadicionalLista(PanelAdicionalLista padicionalLista) {
		this.padicionalLista = padicionalLista;
	}
	
	
	
	
	
	


}

