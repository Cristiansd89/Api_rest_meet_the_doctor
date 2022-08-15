package api_rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api_rest.model.AseguradorasModel;
import api_rest.model.CentrosModel;
import api_rest.repository.CentrosRepository;

@Service
public class CentrosService {
	
	@Autowired
	private CentrosRepository respositorio;
	
	public List<CentrosModel> listarCentros(){
		return respositorio.findAll();
	}
	

	public CentrosModel getcentro(String id) {
		
		Optional<CentrosModel> centros =  respositorio.findById(id);
		return centros.get();
	}
	
	public void createCentros(CentrosModel centros) {
		respositorio.save(centros);
	}
	
	public void deleteCentrosa(String id) {
		respositorio.delete(getcentro(id));
	}
	
	
	
	
}
