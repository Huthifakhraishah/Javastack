package com.axsos.Drivers.repository;



import org.springframework.data.repository.CrudRepository;

import com.axsos.Drivers.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {


}
