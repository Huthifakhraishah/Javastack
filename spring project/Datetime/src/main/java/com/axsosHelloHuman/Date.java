package com.axsosHelloHuman;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Date {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	    }
	@RequestMapping(value="/date")
	public String date(Model viewmodel) {
	    java.util.Date date=new java.util.Date();  
	    SimpleDateFormat formattedAsDate = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
		viewmodel.addAttribute("date", formattedAsDate.format(date));
	    return "date.jsp";
	    }
	@RequestMapping(value="/time")
	public String time(Model viewmodel) {
	    java.util.Date time=new java.util.Date(); 
	    SimpleDateFormat formattedAsTime = new SimpleDateFormat("h:mm a");
	    viewmodel.addAttribute("time",formattedAsTime.format(time));
	    return "time.jsp";
	    }
	}


