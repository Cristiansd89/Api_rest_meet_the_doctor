package api_rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import api_rest.model.UsuariosModel;
import api_rest.repository.UsuariosRepository;

public class UsuariosService {

	
	@Autowired
	private UsuariosRepository repositorio;
	
	public List<UsuariosModel> listarAseguradoras(){
		return repositorio.findAll();
	}
	
	public UsuariosModel getUsuario(int id) {
		
		Optional<UsuariosModel> usuario =  repositorio.findById(id);
		return usuario.get();
	}
	
	public void createUsuario(UsuariosModel usuario) {
		repositorio.save(usuario);
	}
	
	public void deleteUsuario(int id) {
		repositorio.delete(getUsuario(id));
	}
	
	
}
