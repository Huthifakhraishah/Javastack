package com.axsos.Error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Error {
   @RequestMapping("/")
   public String index() {
       return "error.jsp";
   }

   @RequestMapping(value="/code", method=RequestMethod.POST)
   public String flashMessages(@RequestParam(value="enter") String enter,RedirectAttributes redirectAttributes) {
	   if (enter.equals("bushido")) {
		   return "errorpage.jsp";
	   }
       redirectAttributes.addFlashAttribute("error", "not the correct word");
       return "redirect:/";
   }
}