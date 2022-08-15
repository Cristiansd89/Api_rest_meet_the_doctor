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

import api_rest.repository.SanitariosRepository;
import api_rest.model.*;

@RestController
@RequestMapping("/api/v0")
public class SanitariosController {
	
	
	@Autowired
	private SanitariosRepository repositorio;
	
	@GetMapping("/sanitarios")
	public List<SanitariosModel> listarsanitarios(){
		return repositorio.findAll();
			
	}
	
	@GetMapping("/sanitarios/{numColegiado}")
	public  Optional<SanitariosModel> sanitario(@PathVariable("numColegiado") Integer numColegiado){
		return repositorio.findById(numColegiado);
	}
	
	@PostMapping("/anadir_sanitario")
	public void guardar(@RequestBody SanitariosModel sanitario) {
		repositorio.save(sanitario);
		
	}
	
	@DeleteMapping("/eliminar_sanitario/{numColegiado}")
	public void eliminaSanitario(@PathVariable("numColegiado")Integer numColegiado) {
		repositorio.deleteById(numColegiado);
	}
	
	@PutMapping("/actualizar_sanitario")
	public void actualizar (@RequestBody SanitariosModel sanitario) {
		repositorio.save(sanitario);
	}
	
}
