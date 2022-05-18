package edu.unju.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //es igual que colocar las anotaciones @Controller + @ResponseBody
public class controlador2 {
	@RequestMapping("/hola/{nombre}/{apellido}")
	public String hola(@PathVariable("nombre")String nombre, @PathVariable("apellido")String apellido) {
		return "Hola "+ nombre + " "+ apellido + " , Bienvenido a Spring Boot";
	}
	
	@RequestMapping("calcular/{num1}/{num2}")
	public int calcular(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		return num1+num2;
	}
}
