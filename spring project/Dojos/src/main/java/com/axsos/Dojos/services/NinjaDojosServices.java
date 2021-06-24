package com.axsos.Dojos.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.Dojos.models.Dojos;
import com.axsos.Dojos.models.Ninjas;
import com.axsos.Dojos.repositorys.DojoRepository;
import com.axsos.Dojos.repositorys.NinjaRepository;

@Service
public class NinjaDojosServices {
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	public NinjaDojosServices(DojoRepository dojoRepository,NinjaRepository ninjaRepository) {
		this.dojoRepository=dojoRepository;
		this.ninjaRepository=ninjaRepository;
	}
	public Iterable<Dojos> allDojos(){
		return dojoRepository.findAll();
	}
	public Iterable<Ninjas> allNinjas(){
		return ninjaRepository.findAll();
	}
	public Dojos creatDojo(Dojos dojo) {
		return dojoRepository.save(dojo);
	}
	public Ninjas creatNinja(Ninjas ninja) {
		return ninjaRepository.save(ninja);
	}
	public Dojos findDojo(Long id) {
		Optional<Dojos> findDojo = dojoRepository.findById(id);
		if (findDojo.isPresent()) {
			return findDojo.get();
		}
		else {
			return null;
		}
	}
	public Ninjas findNinja(Long id) {
		Optional<Ninjas> findNinja=ninjaRepository.findById(id);
		if(findNinja.isPresent()) {
			return findNinja.get();
		}
		else {
			return null;
		}
	}
	
}
