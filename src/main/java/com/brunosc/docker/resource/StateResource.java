package com.brunosc.docker.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunosc.docker.domain.State;
import com.brunosc.docker.repository.StateRepository;

@RestController
@RequestMapping(value = "/")
public class StateResource {

	@Autowired
	private StateRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<State> findAll() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "seed", method = RequestMethod.GET)
	public String findById() {
		
		State sc = new State("Santa Catarina", "UF");
		State sp = new State("São Paulo", "SP");
		State rj = new State("Rio de Janeiro", "RJ");
		
		repository.save(sc);
		repository.save(sp);
		repository.save(rj);
		
		return "Dados gerados - OK";
	}
	
}
