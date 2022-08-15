package api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api_rest.model.AseguradorasModel;

@Repository
public interface AseguradoraRepository extends JpaRepository<AseguradorasModel, Integer >{

}
