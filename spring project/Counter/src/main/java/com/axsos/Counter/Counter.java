package com.axsos.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	public Counter() {
		
	}
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	    }
	@RequestMapping(value="/counter")
	public String time(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if (count == null) {
			session.setAttribute("count", 0);
        	return "countr.jsp";
		}
		else {
			session.setAttribute("count", count.intValue()+1);
			return "countr.jsp";
		}
	    
	    }
}
