package co.edu.udistrital.model;

public class Agencia {
	
	private Persona directorio[];
	private int tam;
	
	public Agencia() {
		tam = 6;
		directorio = new Persona[tam];
		cargarDirectorio();
	}
	
	public void cargarDirectorio() {
		directorio[0] = new Persona("Luis", "Bogotá", "Masculino", 312432543, "lp@gmail.com", "h1" );
		directorio[1] = new Persona("Marina", "Bogotá", "Femenino", 31543, "mw@gmail.com", "m1");
		directorio[2] = new Persona("Jorge", "Medellin", "Masculino", 432543, "jrp@gmail.com", "h2");
		directorio[3] = new Persona("Pedro", "Bogotá", "Masculino", 31243, "pf@gmail.com", "h3");
		directorio[4] = new Persona("Ana", "Medellin", "Femenino", 332543, "aq@gmail.com", "m2");
		directorio[5] = new Persona("Karen", "Cali", "Femenino", 343, "kt@gmail.com", "m3");
	}
	
	public Persona obtenerPersona(int pos) {
		return directorio[pos];
	}

	public Persona[] getDirectorio() {
		return directorio;
	}

	public void setDirectorio(Persona[] directorio) {
		this.directorio = directorio;
	}

	public int getTam() {
		return tam;
	}
	
}
