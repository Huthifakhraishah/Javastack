package com.axsos.Dojos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.Dojos.models.Dojos;
import com.axsos.Dojos.models.Ninjas;
import com.axsos.Dojos.services.NinjaDojosServices;

@Controller
public class NinjaDojocontroller {
private final NinjaDojosServices ninjaDojoServices;
public NinjaDojocontroller(NinjaDojosServices ninjaDojoServices) {
	this.ninjaDojoServices=ninjaDojoServices;
}
@RequestMapping("/{id}")
public String home(@PathVariable Long id, Model model) {
	Dojos dojos=ninjaDojoServices.findDojo(id);
	Iterable<Ninjas> ninjas=ninjaDojoServices.allNinjas();
	model.addAttribute("dojos", dojos);
	model.addAttribute("ninjas", ninjas);
	return "home.jsp";
}
@RequestMapping("/dojos")
public String dojo() {
	return "dojos.jsp";
}
@RequestMapping("/ninjas")
public String ninja(Model model) {
	Iterable<Dojos> dojos=ninjaDojoServices.allDojos();
	model.addAttribute("dojos", dojos);
	return "ninjas.jsp";
}
@RequestMapping(value="/dojos",method=RequestMethod.POST)
public String adddojo(Dojos dojo) {
	ninjaDojoServices.creatDojo(dojo);
	return "redirect:/ninjas";
}
@RequestMapping(value="/ninjas",method=RequestMethod.POST)
public String addninja(Ninjas ninja,BindingResult result) {
	ninjaDojoServices.creatNinja(ninja);
	return "redirect:/"+ninja.getId();
}
}
