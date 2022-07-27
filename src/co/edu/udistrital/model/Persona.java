package co.edu.udistrital.model;

public class Persona {
	
	private String nombre;
	private String ciudad;
	private String genero;
	private long telefono;
	private String email;
	private String nfoto;
	
	public Persona(String pnombre, String pciudad, String pgenero, long ptelefono, String pemail, String pnfoto) {
		nombre = pnombre;
		ciudad = pciudad;
		genero = pgenero;
		telefono = ptelefono;
		email = pemail;
		nfoto = pnfoto;
	}

	
	public String getNfoto() {
		return nfoto;
	}


	public void setNfoto(String nfoto) {
		this.nfoto = nfoto;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
