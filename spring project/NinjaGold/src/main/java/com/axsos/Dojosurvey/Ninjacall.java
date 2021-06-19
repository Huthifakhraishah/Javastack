package com.axsos.Dojosurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Ninjacall {
	private	int farm=0;
	private int cave=0;
	private int house=0;
	private int casino=0;
	private int x=0;
@RequestMapping("/")
public String homepage(Model model) {
	x=farm+cave+house+casino+x;
	model.addAttribute("far",x);
    return "home.jsp";
}
@RequestMapping(value="/farm", method=RequestMethod.POST)
public String farmcal(@RequestParam(value="farm", required=false) String farmlo,@RequestParam(value="cave", required=false) String cavelo
		,@RequestParam(value="house", required=false) String houselo
		,@RequestParam(value="casino", required=false) String casinolo,
		RedirectAttributes redirectAttributes) {
	if (farmlo!=null) {
		farm=(int)Math.floor(Math.random()*(20-10+1)+10);
	}
	if(cavelo!=null) {
		cave=(int)Math.floor(Math.random()*(10-5+1)+5);
	}
	if(houselo!=null) {
		house=(int)Math.floor(Math.random()*(5-2+1)+2);
	}
	if(casinolo!=null) {
		casino=(int)Math.floor(Math.random()*(50+50+1)-50);
	}
	redirectAttributes.addFlashAttribute("farm", farm);
	redirectAttributes.addFlashAttribute("cave", cave);
	redirectAttributes.addFlashAttribute("house", house);
	redirectAttributes.addFlashAttribute("casino", casino);
	return "redirect:/";
}

}
