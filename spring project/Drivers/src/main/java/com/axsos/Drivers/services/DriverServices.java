package com.axsos.Drivers.services;

import java.sql.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.Drivers.models.License;
import com.axsos.Drivers.models.Person;
import com.axsos.Drivers.repository.LicenseRepository;
import com.axsos.Drivers.repository.PersonRepository;

@Service
public class DriverServices {
	private final LicenseRepository licenseRepository;
	private final PersonRepository personRepository;
	private Integer count=0;
	public DriverServices(LicenseRepository licenseRepository,PersonRepository personRepository) {
		this.licenseRepository=licenseRepository;
		this.personRepository=personRepository;
	}
	public Iterable<Person> allPersons(){
		return personRepository.findAll();
	}
	public Iterable<License> allLicenses(){
		return licenseRepository.findAll();
	}
	public Person creatperson(Person person) {
		return personRepository.save(person);
	}
	public License creatlicencse(String state,Date expdate,Person person) {
		License license=new License();
		license.setNumber(genratenumber());
		license.setExpirationDate(expdate);
		license.setPerson(person);
		license.setState(state);
		return licenseRepository.save(license);
	}
	   public License findLicense(Long id) {
		   Optional<License> findlicense = licenseRepository.findById(id);
		   if(findlicense.isPresent()) {
	        return findlicense.get();
	    } else {
	    	return null;
	    }
		   }
	   public Person findPerson(Long id) {
		   Optional<Person> findperson = personRepository.findById(id);
		   if(findperson.isPresent()) {
	        return findperson.get();
	    } else {
	    	return null;
	    }}
	   public String genratenumber() {
		   count+=1;
		   String c=String.valueOf(count);
		   return c;
	   }
}
