package com.axsos.Drivers.controller;

import java.sql.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.Drivers.models.Person;
import com.axsos.Drivers.services.DriverServices;

@Controller
public class DriverController {
private final DriverServices driverServices;
	public DriverController(DriverServices driverServices) {
		this.driverServices=driverServices;	
	}
	@RequestMapping("/")
	public String home(Model model) {
		Iterable<Person> person = driverServices.allPersons();
		model.addAttribute("person", person);
		return "home.jsp";
	}
	@RequestMapping("/persons/{id}")
	public String personinfo(@PathVariable Long id,Model model) {
		Person person = driverServices.findPerson(id);
		model.addAttribute("person", person);
		return "info.jsp";
	}
	@RequestMapping("/persons/new")
	public String personIndex() {
		return "person.jsp";
	}
	@RequestMapping("/license/new")
	public String licenseIndex(Model model) {
		Iterable<Person> person = driverServices.allPersons();
		model.addAttribute("person", person);
		return "license.jsp";
	}
	@RequestMapping(value="/persons/new" , method=RequestMethod.POST)
	public String persondata(@Valid @ModelAttribute(value="person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/";
        } else {
        
        	driverServices.creatperson(person);
            return "redirect:/persons/"+person.getId();
        }
		}
	@RequestMapping(value="/license/new" , method=RequestMethod.POST)
	public String licensedata(@Valid @ModelAttribute(value="state") String state, 
			@ModelAttribute(value="expirationDate") Date expdate,
			@ModelAttribute(value="person") Person person) {
        	driverServices.creatlicencse(state,expdate,person);
            return "redirect:/";
        }
		}

