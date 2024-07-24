package cl.praxis.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Libro {

	@Id
	private int nro_libro;
	private String titulo;
	private String autor;
	private String tipo;
	
	public Libro() {
		super();
	}

	public Libro(int nro_libro, String titulo, String autor, String tipo) {
		super();
		this.nro_libro = nro_libro;
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
	}

	public int getNro_libro() {
		return nro_libro;
	}

	public void setNro_libro(int nro_libro) {
		this.nro_libro = nro_libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
}
