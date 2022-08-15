package api_rest.controller;

import java.util.ArrayList;

import java.util.List;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api_rest.repository.ComentariosRepository;
import api_rest.repository.SanitariosRepository;
import api_rest.repository.UsuariosRepository;
import lombok.extern.slf4j.Slf4j;
import api_rest.dto.ComentarioDTO;
import api_rest.model.*;

@RestController
@RequestMapping("/api/v0")
@Slf4j
public class ComentariosController {
	
	private static final Logger log = LoggerFactory.getLogger(ComentariosController.class);
	
	@Autowired
	private ComentariosRepository repositorio;
	
	@Autowired
	private SanitariosRepository repoSanitario;
	
	@Autowired
	private UsuariosRepository repoUsuario;
	

	@GetMapping("/comentarios")
	public List<ComentarioDTO> listaComentarios(){
		//Esto tiene todo los datos
		List<ComentariosModel> comentarios = repositorio.findAll();
		List<ComentarioDTO> resultado = new ArrayList<ComentarioDTO>();
		
		for(ComentariosModel comentario : comentarios) {
			ComentarioDTO comentarioDto = new ComentarioDTO(comentario);
			
			resultado.add(comentarioDto);
			
		}
		return resultado;
		
	}
	

	@GetMapping("/comentarios/{idComentario}")
	public Optional<ComentariosModel> comentario(@PathVariable("idComentario")Integer idComentario){
		return repositorio.findById(idComentario);
	}
	
	
	
	@PostMapping("/anadir_comentario")
	public void insertaComentario(@RequestBody ComentarioDTO datoscomentario ) {
		
		SanitariosModel sanitarioComentario = null;
		UsuariosModel usauarioComentarios = null;
		List<ComentariosModel> comentarios = repositorio.findAll();
		List<SanitariosModel> sanitarios = repoSanitario.findAll();
		List<UsuariosModel> usarios = repoUsuario.findAll();
		ComentariosModel comentario =new ComentariosModel();
		
		for(SanitariosModel sanitario : sanitarios) {
			if(sanitario.getNumColegiado()== datoscomentario.getId_sanitario()) {
				 sanitarioComentario = sanitario;
			}
		}
		for (UsuariosModel usuario : usarios){
			if(usuario.getIdUsuario() == datoscomentario.getId_usuario()) {
				usauarioComentarios = usuario;
			}
		}
		
		comentario.setComentario(datoscomentario.getComentario());
		comentario.setNota(datoscomentario.getNota());
		comentario.setSanitarios(sanitarioComentario);
		comentario.setUsuario(usauarioComentarios);
		
		repositorio.save(comentario);	
	}
	

	@PutMapping("/modificar_comentario")
	public void actualizar(@RequestBody ComentarioDTO datoscomentario ) {
		
		
		List<ComentariosModel> comentarios = repositorio.findAll();
		
		
		
		for(ComentariosModel comentario : comentarios) {
			if(comentario.getIdComentario() == datoscomentario.getId_comentario()) {
				comentario.setComentario(datoscomentario.getComentario());
				comentario.setNota(datoscomentario.getNota());
				comentario.getIdComentario();
				
				repositorio.save(comentario);
			}
		}
		
		
		
				
	}
	
	@DeleteMapping("/eliminar_comentario/{idComentario}")
	public void eliminar(@PathVariable("idComentario") Integer id) {
		repositorio.deleteById(id);
		
	}

}
