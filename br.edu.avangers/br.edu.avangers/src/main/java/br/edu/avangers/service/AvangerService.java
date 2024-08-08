package br.edu.avangers.service;

import org.springframework.stereotype.Service;

import br.edu.avangers.modal.Avanger;

@Service
public interface AvangerService {
	
	void createAvanger(Avanger avanger);
	void updateAvanger(Long idAvanger, Avanger avanger);
	void deleteAvanger(Long idAvanger);
	Iterable<Avanger> serchAllAvangers();
	Avanger findAvangerById(Long idAvanger);

}
