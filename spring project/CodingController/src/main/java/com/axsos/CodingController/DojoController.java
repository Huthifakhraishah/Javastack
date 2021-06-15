package com.axsos.CodingController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController

public class DojoController {
	@RequestMapping("/{name}")
	public String show(@PathVariable("name") String name){
		if (name.equals("dojo"))
			return  "The dojo is awesome! " ;
		else if(name.equals("burbank-dojo"))
			return "Burbank Dojo is located in Southern California";
		else if(name.equals("san-jose"))
			return "SJ dojo is the headquarters";
		else 
			return "no dojo";
	}	

}
