package br.edu.avangers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.avangers.modal.Avanger;
import br.edu.avangers.service.AvangerServiceImp;

@RestController
@RequestMapping("/v1/api/avangers")
public class AvangerController {
	
	@Autowired
	private AvangerServiceImp avServiceImp;
	
	@GetMapping()
	public ResponseEntity<Iterable<Avanger>> searchAllAvangers(){
		return ResponseEntity.ok(avServiceImp.serchAllAvangers());
	}
	
	@GetMapping("/{idAvanger}")
	public ResponseEntity<Avanger> findAvangerById(@PathVariable Long idAvanger){
		return ResponseEntity.ok(avServiceImp.findAvangerById(idAvanger));
	}
	
	@PostMapping("/")
	public ResponseEntity<Avanger> createAvanger(@RequestBody Avanger avanger){
		avServiceImp.createAvanger(avanger);
		return ResponseEntity.ok(avanger);
	}
	
	@PutMapping("/{idAvanger}")
	public ResponseEntity<Avanger> updateAvanger (@PathVariable Long idAvanger, Avanger avanger){
		avServiceImp.updateAvanger(idAvanger, avanger);
		return ResponseEntity.ok(avanger);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Avanger> deleteAvangerbyId(@PathVariable Long id){
		avServiceImp.deleteAvanger(id);
		return ResponseEntity.ok().build();
	}
	

}
