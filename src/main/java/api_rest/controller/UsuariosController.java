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
import api_rest.model.*;
import api_rest.repository.UsuariosRepository;

@RestController
@RequestMapping("/api/v0")
public class UsuariosController {

	@Autowired
	private UsuariosRepository repositorio;
	
	@GetMapping("/usuarios")
	public List<UsuariosModel> listaUsuarios(){
		return repositorio.findAll();
	}
	
	@GetMapping("/usuarios/{IdUsuario}")
	public Optional<UsuariosModel> usuario(@PathVariable("IdUsuario")Integer IdUsuario){
		return repositorio.findById(IdUsuario);
	}
	
	@PostMapping("/anadir_usuario")
	public void guardar(@RequestBody UsuariosModel IdUsuario) {
		repositorio.save(IdUsuario);
		
	}
	@DeleteMapping("/eliminar_usuario/{IdUsuario}")
	public void eliminar(@PathVariable("IdUsuario") Integer IdUsuario) {
		repositorio.deleteById(IdUsuario);
		
	}
	
	@PutMapping("/actualizar_usuario")
	public void actualizar(@RequestBody UsuariosModel IdUsuario) {
		repositorio.save(IdUsuario);
		
	}
	
}
