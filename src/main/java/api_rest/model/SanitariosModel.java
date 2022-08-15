package api_rest.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name ="sanitarios")
public class SanitariosModel implements Serializable{
	
	@Id
    @Column(name = "numero_colegiado", length = 9)
	private int numColegiado;
	
	
	
	@Column(name = "nombre", nullable = false,  length = 30)
	private String nombre;
	
	
	@Column(name = "apellidos", nullable = false,  length = 30)
	private String apellidos;
	

	@Column(name = "correo", nullable = false,  length = 100)
	private String correo;
	
	
	@Column(name = "contrasena", nullable = false,  length = 100)
	private String contrasena;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="id_especialidad")
	private EspecialidadesModel especialidad; //Especialidades
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="id_aseguradoras")
	private AseguradorasModel aseguradora; //Aseguradoras
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="nombre_centro")
	private CentrosModel centros; //Centros
	
	

	public SanitariosModel() {
		super();
	}

	public int getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(int numColegiado) {
		this.numColegiado = numColegiado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public EspecialidadesModel getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(EspecialidadesModel especialidad) {
		this.especialidad = especialidad;
	}

	public AseguradorasModel getAsseguradora() {
		return aseguradora;
	}

	public void setAsseguradora(AseguradorasModel asseguradora) {
		this.aseguradora = asseguradora;
	}

	public CentrosModel getCentros() {
		return centros;
	}

	public void setCentros(CentrosModel centros) {
		this.centros = centros;
	}

	public AseguradorasModel getAseguradora() {
		return aseguradora;
	}

	public void setAseguradora(AseguradorasModel aseguradora) {
		this.aseguradora = aseguradora;
	}

	
	
	
}
