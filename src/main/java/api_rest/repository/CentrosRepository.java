package api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api_rest.model.CentrosModel;

@Repository
public interface CentrosRepository extends JpaRepository<CentrosModel, String> {

}



