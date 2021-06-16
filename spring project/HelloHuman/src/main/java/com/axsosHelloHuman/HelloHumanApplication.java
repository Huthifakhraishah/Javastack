package com.axsosHelloHuman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String name) {
    	if (name==null)
    		return "index.jsp";
    	else
         return "Hello " + name;
    }
	
}
