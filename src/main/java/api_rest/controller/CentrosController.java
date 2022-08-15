package api_rest.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api_rest.repository.CentrosRepository;

import api_rest.model.CentrosModel;

@RestController
@RequestMapping("/api/v0")
public class CentrosController {

	@Autowired
	private CentrosRepository repositorio;
	
	
	@GetMapping("/centros")
	public List<CentrosModel> listarCentros(){
		return repositorio.findAll();
		}
	
	@GetMapping("/centros/{nombreCentro}")
	public Optional<CentrosModel> centro( @PathVariable("nombreCentro") String nombre) {
		return repositorio.findById(nombre);
	}
	
	
	@PostMapping("Anadir_centros")
	public void guardar(@RequestBody CentrosModel centros) {
		repositorio.save(centros);
	}
	
	@DeleteMapping("/eliminar_aseguradoras/{nombreCentro}")
	public void eliminarCentro(@PathVariable("nombreCentro") String nombre) {
		repositorio.deleteById(nombre);
	}
	
	@PutMapping("/actualizar_centro")
	public void actualizar(@RequestBody CentrosModel centros ) {
		repositorio.save(centros);
		
	}
}
