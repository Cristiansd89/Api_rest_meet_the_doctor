package api_rest.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api_rest.repository.AseguradoraRepository;
import api_rest.model.AseguradorasModel;

@Service
public class AseguradoraService  {
	
	@Autowired
	private AseguradoraRepository respositorio;
	
	
	public List<AseguradorasModel> listarAseguradoras(){
		return respositorio.findAll();
	}
	
	public AseguradorasModel getAseguradora(int id) {
		
		Optional<AseguradorasModel> aseguradora =  respositorio.findById(id);
		return aseguradora.get();
	}
	
	public void createAseguradora(AseguradorasModel aseguradoraModel) {
		respositorio.save(aseguradoraModel);
	}
	
	public void deleteAseguradora(int id) {
		respositorio.delete(getAseguradora(id));
	}
	
	
	
}
