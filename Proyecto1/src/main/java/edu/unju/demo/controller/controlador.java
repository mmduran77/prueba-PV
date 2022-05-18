package edu.unju.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controlador {

	@RequestMapping("/saludar")
	@ResponseBody
	public String saludar() {
		return "Programacion Visual";
	}
	
	@RequestMapping("saludo/{nombre}")
	@ResponseBody
	public String saludo(@PathVariable("nombre") String nombre) {
		return "Bienvenido " + nombre;
	}
}
