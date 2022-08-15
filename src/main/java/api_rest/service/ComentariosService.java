package api_rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api_rest.model.ComentariosModel;
import api_rest.repository.ComentariosRepository;

@Service
public class ComentariosService {

	
	@Autowired
	public ComentariosRepository repositorio;
	
	
	public List<ComentariosModel> listaComentarios(){
		return repositorio.findAll();
	}
	

	public ComentariosModel getComentarios(int id) {
		
		Optional<ComentariosModel> comentario =  repositorio.findById(id);
		return comentario.get();
	}
	
	public void createComentario(ComentariosModel comentario) {
		repositorio.save(comentario);
	}
	
	public void deleteComentario(int id) {
		repositorio.delete(getComentarios(id));
	}
	
}
