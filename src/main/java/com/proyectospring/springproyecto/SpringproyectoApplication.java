package com.proyectospring.springproyecto;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectospring.springproyecto.controllers.MessageDto1;
import com.proyectospring.springproyecto.controllers.InformacionJuan;



@RestController
@SpringBootApplication
public class SpringproyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringproyectoApplication.class, args);
	}
	@GetMapping("/JuanGutierrez")
	public MessageDto1 messageView(){


	return new MessageDto1 (LocalDateTime.now(), "Bienvenida Instructora, esta es mi evidencia de GA7-220501096-AA3-EV01 codificación de módulos del software Stand - alone, web y móvil de acuerdo al proyecto a desarrollar ", "Juan Gutierrez", "ANALISIS Y DESARROLLO DE SOFTWARE. (2721427)");

	}
}
