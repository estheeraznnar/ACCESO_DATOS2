package org.iesch.ad.demoSpring1;

import lombok.RequiredArgsConstructor;
import org.iesch.ad.demoSpring1.modelo.Persona;
import org.iesch.ad.demoSpring1.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
//@RequiredArgsConstructor
@PropertySource(value = "classpath:my.properties", encoding = "UTF-8")
public class DemoSpring1Application implements CommandLineRunner {

	/*@Value("${mi.app.nombre}")
	String nombre;
	@Value("${mi.app.version}")
	String version;
	@Value("${firma}")
	String firma;*/

	/*@Autowired
	List<Persona> personaList;*/

	//Una opcion
	/*PersonaRepositorio personaRepositorio;
	public DemoSpring1Application(PersonaRepositorio personaRepositorio){
		this.personaRepositorio = personaRepositorio;
	}*/
	//otra opcion
	@Autowired
	PersonaRepositorio personaRepositorio;

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

		//System.out.println(personaList);

		/*Persona p = Persona.builder().nombre("Juan").apellidos("Perez").dni("18444555A").email("juan@aa.a").build();
		Persona p2 = Persona.builder().nombre("Paco").apellidos("Sanchez").dni("18442555B").email("paco@aa.a").build();
		Persona p3 = Persona.builder().nombre("German").apellidos("Sanchez").dni("18443555C").email("german@aa.a").build();
		Persona p4 = Persona.builder().nombre("Diego").apellidos("Gracia").dni("18446555D").email("diego@aa.a").build();
		//System.out.println(p);
		//personaRepositorio.save(p);
		List<Persona> personaList = new ArrayList<>(Arrays.asList(p2, p3, p4));
		personaRepositorio.saveAll(personaList);*/


		//CRUD
		List<Persona> personaList1 = personaRepositorio.findAll();
		System.out.println(personaList1);
	}
}
