package br.com.renato.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.renato.data.vo.v1.PersonVO;
import br.com.renato.data.vo.v2.PersonVOV2;
import br.com.renato.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService service;

	// FIND ALL
	@GetMapping(
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<PersonVO> findAll() {

		return service.findAll();
	}

	// FIND BY ID
	@GetMapping(value = "/{id}", 
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public PersonVO findById(@PathVariable(value = "id") Long id) {

		return service.findById(id);
	}

	// CREATE
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public PersonVO create(@RequestBody PersonVO person) {

		return service.create(person);
	}

	// CREATE v2
	@PostMapping(value = "/v2", 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public PersonVOV2 createV2(@RequestBody PersonVOV2 person) {

		return service.createV2(person);
	}

	// UPDATE
	@PutMapping(
		consumes = MediaType.APPLICATION_JSON_VALUE, produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE })
	public PersonVO update(@RequestBody PersonVO person) {

		return service.update(person);
	}

	// DELETE
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {

		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}