package api_rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api_rest.model.ComentariosModel;
import api_rest.model.SanitariosModel;
import api_rest.repository.SanitariosRepository;

@Service
public class SanitariosService {

	@Autowired
	private SanitariosRepository repositorio;
	
	public List<SanitariosModel> listaSanitarios(){
		return repositorio.findAll();
	}
	

	public SanitariosModel getSanitarios(int id) {
		
		Optional<SanitariosModel> sanitario =  repositorio.findById(id);
		return sanitario.get();
	}
	
	public void createSanitario(SanitariosModel SanitariosModel) {
		repositorio.save(SanitariosModel);
	}
	
	public void deleteSanitario(int id) {
		repositorio.delete(getSanitarios(id));
	}
	
}
