package api_rest.dto;

import api_rest.model.ComentariosModel;

public class ComentarioDTO {

	private String comentario;
	private int nota;
	private int id_usuario;
	private int id_sanitario;
	private int id_comentario;
	
	public ComentarioDTO(ComentariosModel comentarios) {
		this.comentario = comentarios.getComentario();
		this.nota = comentarios.getNota();
		this.id_sanitario = comentarios.getSanitarios().getNumColegiado();
		this.id_usuario = comentarios.getUsuario().getIdUsuario();
		this.id_comentario = comentarios.getIdComentario();
	}
	
	public ComentarioDTO() {
		
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


	public int getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}


	public int getId_sanitario() {
		return id_sanitario;
	}


	public void setId_sanitario(int id_sanitario) {
		this.id_sanitario = id_sanitario;
	}

	public int getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(int id_comentario) {
		this.id_comentario = id_comentario;
	}
	
	
}
