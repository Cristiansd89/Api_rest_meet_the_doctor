package api_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import api_rest.model.*;
import java.util.List;
import api_rest.model.AseguradorasModel;
import api_rest.repository.AseguradoraRepository;
import api_rest.service.AseguradoraService;

/**
 * Metodos Http para solicitar informacion al servidor
 */

@RestController
@RequestMapping("/api/v0")
public class AseguradorasController {
	
	@Autowired
	private AseguradoraRepository repositorio; // con esto hacemos una inyeccion de dependencias
	
	
	
	/*
	 * Metodo POST
	 */
	@PostMapping("/añadir_aseguradora")
	public void guardar(@RequestBody AseguradorasModel aseguradoraModel) {
		repositorio.save(aseguradoraModel);
	}
		
	/*
	 * Metodo GET 
	 */
	@GetMapping("/aseguradoras")
	public List<AseguradorasModel> listarAseguradoras(){
		//Devuelve todos los objetos de tipo que haya en la base de datos
		return repositorio.findAll();
	}
	
	/*
	 * Metodo Delete
	 */
	@DeleteMapping("/eliminar_aseguradora/{idAseguradora}")
	public void eliminarAseguradora(@PathVariable("idAseguradora") Integer id) {
		repositorio.deleteById(id);
	}
	
	
	/*
	 * Metodo Modificar
	 */
	@PutMapping("/actualizar_Aseguradora")
	public void actualizar(@RequestBody AseguradorasModel aseguradoraModel ) {
		repositorio.save(aseguradoraModel);
	}
}
