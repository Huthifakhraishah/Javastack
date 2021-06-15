package com.axsos.Stringasign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class StringasignApplication {
        public static void main(String[] args) {
                SpringApplication.run(StringasignApplication.class, args);
        }
        
        @RequestMapping("/")
        public String hello() { // 3
                return "Hello Clint,How are you doing?";
        }
        @RequestMapping("/random")
        public String helloSpring() { // 3
                return "Hello World! Spring is lokking nice for now";
        }
}
