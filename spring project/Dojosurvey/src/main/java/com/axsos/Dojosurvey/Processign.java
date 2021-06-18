package com.axsos.Dojosurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Processign {
	   @RequestMapping("/")
	   public String index() {
	       return "Home.jsp";
	   }

	   @RequestMapping(value="/result", method=RequestMethod.POST)
	   public String Results(@RequestParam(value="name") String name,@RequestParam(value="dojoloc") String dojoloc,@RequestParam(value="favlang") String favlang,@RequestParam(value="comment") String comment,Model model) {
		   model.addAttribute("name", name);
		   model.addAttribute("dojoloc", dojoloc);
		   model.addAttribute("favlang", favlang);
		   model.addAttribute("comment", comment);
	       return "result.jsp";
	   }
	   @RequestMapping(value="/result")
	   public String refr() {
		   return "redirect:/";
	   }
}
