package api_rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api_rest.model.EspecialidadesModel;

import api_rest.repository.EspecialidadesRepository;

@Service
public class EspecialidadesService {

	
	@Autowired
	private EspecialidadesRepository repositorio;
	
	public List<EspecialidadesModel> listarEspecialidades(){
		return repositorio.findAll();
	}
	
	public EspecialidadesModel getEspecialidadesModel(int id) {
		
		Optional<EspecialidadesModel> especialidad =  repositorio.findById(id);
		return especialidad.get();
	}
	
	public void createEspecialidad(EspecialidadesModel especialidad) {
		repositorio.save(especialidad);
	}
	
	public void deleteEspecialidad(int id) {
		repositorio.delete(getEspecialidadesModel(id));
	}
}
