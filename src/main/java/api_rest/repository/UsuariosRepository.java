package api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api_rest.model.UsuariosModel;


@Repository
public interface UsuariosRepository extends JpaRepository <UsuariosModel, Integer> {

}
