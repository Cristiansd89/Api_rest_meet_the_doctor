package api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api_rest.model.SanitariosModel;


@Repository
public interface SanitariosRepository extends JpaRepository< SanitariosModel, Integer> {

}
