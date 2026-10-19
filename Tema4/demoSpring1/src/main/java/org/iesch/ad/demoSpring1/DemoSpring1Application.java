package org.iesch.ad.demoSpring1;

import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@SpringBootApplication
public class DemoSpring1Application implements CommandLineRunner {

	@Value("${mi.app.nombre}")
	String nombre;
	@Value("${mi.app.version}")
	String version;
	@Value("${firma}")
	String firma;

	@Autowired
	List<Persona> personaList;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Mundo!!");
		/*System.out.println(version);
		System.out.println(nombre);
		System.out.println(firma);*/



		/*Persona p = new Persona();
		p.setNombre("Juan");
		p.setApellidos("Perez");
		p.setDni("12345678M");
		p.setEmail("juanp@com.com");
		System.out.println(p);*/
		System.out.println(personaList);
	}
}
