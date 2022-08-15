package api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api_rest.model.EspecialidadesModel;


@Repository
public interface EspecialidadesRepository extends JpaRepository<EspecialidadesModel, Integer> {

}
