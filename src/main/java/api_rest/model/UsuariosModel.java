package api_rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="usuarios")
public class UsuariosModel {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_usuario", length = 100)
	private int IdUsuario;
	
	@Column(name = "correo", nullable = false,  length = 100)
	private String correo;
	
	@Column(name = "nombre", nullable = false,  length = 30)
	private String nombre;
	
	@Column(name = "apellidos", nullable = false,  length = 30)
	private String apellidos;
	
	@Column(name = "contrasena", nullable = false,  length = 100)
	private String contrasena;

	public UsuariosModel() {
		super();
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
	
}
