package api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api_rest.model.CentrosModel;
import api_rest.model.ComentariosModel;


@Repository
public interface ComentariosRepository extends JpaRepository<ComentariosModel, Integer> {

}
