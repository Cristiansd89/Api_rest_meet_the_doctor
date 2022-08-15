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


import api_rest.model.EspecialidadesModel;
import api_rest.repository.EspecialidadesRepository;

@RestController
@RequestMapping("/api/v0")
public class EspecialidadesController {

	

	@Autowired
	private EspecialidadesRepository repositorio;
	
	
	@GetMapping("/especialidad")
	public List<EspecialidadesModel> listarEspecialidades(){
		return repositorio.findAll();
		}
	
	@GetMapping("/especialidad/{especialidad}")
	public Optional<EspecialidadesModel> especialidad( @PathVariable("especialidad") Integer id) {
		return repositorio.findById(id);
	}
	
	
	@PostMapping("/Anadir_especialidad")
	public void guardar(@RequestBody EspecialidadesModel especialidad) {
		repositorio.save(especialidad);
	}
	
	@DeleteMapping("/eliminar_especialidad/{idEspecialidad}")
	public void eliminarEspecialidad(@PathVariable("idEspecialidad") Integer id) {
		repositorio.deleteById(id);
	}
	
	@PutMapping("/actualizar_especialidad")
	public void actualizar(@RequestBody EspecialidadesModel especialidad ) {
		repositorio.save(especialidad);
		
	}
}
