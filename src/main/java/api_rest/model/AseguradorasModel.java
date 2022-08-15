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
@Table(name = "aseguradoras")
public class AseguradorasModel  implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_aseguradoras", length = 10)
	private int IdAseguradora;
	
	
	@Column(name = "nombre_aseguradoras",nullable = false,  length = 100)
	private String nombreAseguradora;

	public AseguradorasModel() {
		super();
	}

	public int getIdAseguradora() {
		return IdAseguradora;
	}

	public void setIdAseguradora(int idAseguradora) {
		IdAseguradora = idAseguradora;
	}

	public String getNombreAseguradora() {
		return nombreAseguradora;
	}

	public void setNombreAseguradora(String nombreAseguradora) {
		this.nombreAseguradora = nombreAseguradora;
	}
	
	
	
	
	
	
	
	
	
}
