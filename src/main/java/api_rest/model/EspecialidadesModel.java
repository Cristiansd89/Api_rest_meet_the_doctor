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
@Table(name ="especialidades")
public class EspecialidadesModel  implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_especialidad" , length =10)
	private int idEspecialidad;
	
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	public EspecialidadesModel() {
		super();
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombre_varchar() {
		return nombre;
	}

	public void setNombre_varchar(String nombre_varchar) {
		this.nombre = nombre_varchar;
	}
	
	
	
	
}
