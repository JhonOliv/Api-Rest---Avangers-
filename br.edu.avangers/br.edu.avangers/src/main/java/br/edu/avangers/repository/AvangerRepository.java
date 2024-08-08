package br.edu.avangers.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.avangers.modal.Avanger;

@Repository
public interface AvangerRepository extends CrudRepository<Avanger, Long> {
	
	

}
