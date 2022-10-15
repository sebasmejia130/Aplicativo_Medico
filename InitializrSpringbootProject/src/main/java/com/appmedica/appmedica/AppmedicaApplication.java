package com.appmedica.appmedica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppmedicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppmedicaApplication.class, args);
	}
        @RequestMapping(value="/hola")
        public String index(){
            return "Hola Mundo, hoy es dia 04/10/2022";
        }
}
