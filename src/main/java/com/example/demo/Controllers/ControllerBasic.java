package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")

public class ControllerBasic {
	
	@GetMapping(path = {"/saludar"})
	
 public String saludar() {
	 return "hola";
 }
}
