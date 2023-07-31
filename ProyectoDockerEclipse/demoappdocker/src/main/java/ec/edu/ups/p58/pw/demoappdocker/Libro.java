package ec.edu.ups.p58.pw.demoappdocker;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable{

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "lib_codigo")
	private int codigo;
	
	@Column(name = "lib_autor")
	private String autor;
	
	@Column(name = "lib_nombre")
	private String nombre;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
