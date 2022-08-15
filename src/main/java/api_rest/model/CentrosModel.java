package api_rest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "centros")
public class CentrosModel  implements Serializable {

	@Id
	@Column(name = "nombre_centro", length = 150)
	private String nombreCentro;
	
	
	@Column(name = "direccion", nullable = false, length = 150)
	private String Direccion;
	
	
	@Column(name = "telefono", nullable = false, length = 9)
	private String telefono;

	public CentrosModel() {
		super();
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
