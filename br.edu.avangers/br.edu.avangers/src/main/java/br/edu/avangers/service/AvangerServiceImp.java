package br.edu.avangers.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.avangers.modal.Avanger;
import br.edu.avangers.repository.AvangerRepository;
@Service
public class AvangerServiceImp implements AvangerService{
	
	@Autowired
	private AvangerRepository avRepository;

	@Override
	public void createAvanger(Avanger avanger) {
		// TODO Auto-generated method stub
		avRepository.save(avanger);
	}

	@Override
	public void updateAvanger(Long idAvanger, Avanger avanger) {
		// TODO Auto-generated method stub
		Optional<Avanger> update = avRepository.findById(idAvanger);
		if(update.isPresent()) {
			avRepository.save(avanger);
		}
	}

	@Override
	public void deleteAvanger(Long idAvanger) {
		// TODO Auto-generated method stub
		Optional<Avanger> delete = avRepository.findById(idAvanger);
		if(delete.isPresent()) {
			avRepository.deleteById(idAvanger);
		}
		
	}

	@Override
	public Iterable<Avanger> serchAllAvangers() {
		return avRepository.findAll();
	}

	@Override
	public Avanger findAvangerById(Long idAvanger) {
		// TODO Auto-generated method stub
		Optional<Avanger> findAvanger = avRepository.findById(idAvanger);
		if(findAvanger.isPresent()) {
			// No optional deve ser inserido o .get() para retornar o elemento
			return findAvanger.get();
		}
		return null;
	}

}
