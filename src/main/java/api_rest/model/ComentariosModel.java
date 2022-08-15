package api_rest.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "comentarios" )
public class ComentariosModel implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_comentario", length = 10)
	private int idComentario;
	
	
	@Column(name = "comentario", nullable = false,  length = 250)
	private String comentario;
	
	
	@Column(name = "nota", nullable = false,  length = 1)
	private int nota;
	
	
	@ManyToOne()
	@JoinColumn(name ="num_colegiado")
	private SanitariosModel sanitarios; // Sanitarios
	
	@ManyToOne()
	@JoinColumn(name ="id_usuario")
	private UsuariosModel usuario; //Usuarios


	public ComentariosModel() {
		super();
	}


	public int getIdComentario() {
		return idComentario;
	}


	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public int getNota() {
		return nota;
	}


	public void setNota(int nota) {
		this.nota = nota;
	}


	public SanitariosModel getSanitarios() {
		return sanitarios;
	}


	public void setSanitarios(SanitariosModel sanitarios) {
		this.sanitarios = sanitarios;
	}


	public UsuariosModel getUsuario() {
		return usuario;
	}


	public void setUsuario(UsuariosModel usuario) {
		this.usuario = usuario;
	}


	
}
