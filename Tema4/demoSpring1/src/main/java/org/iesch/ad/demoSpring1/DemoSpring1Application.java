package org.iesch.ad.demoSpring1;

import lombok.RequiredArgsConstructor;
import org.iesch.ad.demoSpring1.modelo.Coche;
import org.iesch.ad.demoSpring1.modelo.Persona;
import org.iesch.ad.demoSpring1.repositorio.CocheRepossitorio;
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
import java.util.Optional;

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
	@Autowired
	CocheRepossitorio cocheRepossitorio;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Hola Mundo!!");
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
/*
		Persona p = Persona.builder().nombre("Juan").apellidos("Perez").dni("18444555A").email("juan@aa.a").build();
		Persona p2 = Persona.builder().nombre("Paco").apellidos("Sanchez").dni("18442555B").email("paco@aa.a").build();
		Persona p3 = Persona.builder().nombre("German").apellidos("Sanchez").dni("18443555C").email("german@aa.a").build();
		Persona p4 = Persona.builder().nombre("Diego").apellidos("Gracia").dni("18446555D").email("diego@aa.a").build();
		System.out.println(p);
		personaRepositorio.save(p);
		List<Persona> personaList = new ArrayList<>(Arrays.asList(p2, p3, p4));
		personaRepositorio.saveAll(personaList);*/

		/*Persona p = new Persona();
		p.setNombre("Jose");
		p.setApellidos("Jualian Juan");
		System.out.println(p);
		personaRepositorio.save(p);*/

/*
		//CRUD
		//Read
		List<Persona> personaList1 = personaRepositorio.findAll();
		System.out.println(personaList1);

		//select * from ------ where id =4;
		//Pone optional por defecto
		Optional<Persona> personaEncontradaPorId = personaRepositorio.findById(4L);
		//Esta forma no es recomendada
		//Persona personaEncontradaPorId2 = personaRepositorio.findById(4L).get();
		if (personaEncontradaPorId.isPresent()){
			System.out.println("Persona encontrada por id: " + personaEncontradaPorId.get());
		}else {
			System.out.println("Persona no encontrada");
		}
		System.out.println("==============================");

		//update
		//Estamos trabajando con personaEncontradaPorId
		if (personaEncontradaPorId.isPresent()){
			personaEncontradaPorId.get().setNombre("Paca");
			personaEncontradaPorId.get().setApellidos("Lopez");
			personaEncontradaPorId.get().setDni("18445566L");
			personaEncontradaPorId.get().setEmail("paca@p.es");

			//guardo
			personaRepositorio.save(personaEncontradaPorId.get());
			List<Persona> personaList2 = personaRepositorio.findAll();
			System.out.println(personaList2);
			System.out.println("==============================");
		}


		//DELETE
		Optional<Persona> personaABorrar = personaRepositorio.findById(3L);
		if (personaABorrar.isPresent()){
			Persona personaBorra = personaABorrar.get();
			personaRepositorio.delete(personaBorra);
		}

		System.out.println("==============================");

		Persona personatmp = new Persona();
		personatmp.setId(2L);
		personaRepositorio.delete(personatmp);

		System.out.println("==============================");

*/

		/*
		List<Persona> listaPersona = personaRepositorio.buscaTodasPersonas();
		System.out.println(listaPersona);
		System.out.println("================================");


		System.out.println("------Native------");
		List<Persona> listaPersonaNative = personaRepositorio.buscaTodasPersonasNative();
		System.out.println(listaPersonaNative);
		System.out.println("================================");


		System.out.println("-----Pseudo-Lenguaje------");
		//busacmos las personas que su nombre empiece por J
		List<Persona> personaListComienzaporLetra = personaRepositorio.findByNombreStartingWith('J');
		System.out.println(personaListComienzaporLetra);
		System.out.println("================================");

		//Buscamos las personas Cuya letra del DNi sea A y el apellido contenga R
		List<Persona> personas = personaRepositorio.findByDniContainingAndApellidosContaining('A', "R");
		System.out.println(personas);
		System.out.println("================================");

		//DNI con un 6 o email null
		List<Persona> personasOr = personaRepositorio.findByDniContainingOrEmailIsNull('6' );
		System.out.println(personasOr);
		System.out.println("================================");

		 */



		/*
		//Nueva persona
		Persona persona = new Persona();
		persona.setNombre("Pepelu");
		persona.setApellidos("Lopez Catalan");
		persona.setDni("18446699P");
		persona.setEmail("pplu@g.es");

		//Nuevo coche
		Coche coche =new Coche();
		coche.setMarca("Tesla");
		coche.setModelo("3");
		coche.setMatricula("9999 JNY");

		persona.setCoche(coche);
		//guardamos en base de datos
		personaRepositorio.save(persona);

		 */

		/*
		System.out.println("OneToOne");
		//Cargar en la BBDD la persona con el ID 11
		Optional<Persona> persona = personaRepositorio.findById(26L);
		if (persona.isPresent()){
			Persona p = persona.get();
			System.out.println(p);
		}

		Optional<Coche> coche = cocheRepossitorio.findById(1L);
		if (coche.isPresent()){
			Coche c = coche.get();
			System.out.println(c);
		}

		 */

		System.out.println("OneToOne Bidireccional");

		/*Persona persona = new Persona();
		persona.setNombre("Jose");
		persona.setApellidos("Pascual Sanchez");
		persona.setDni("18779986P");
		persona.setEmail("pepito@aa.es");

		Coche coche =new Coche();
		coche.setMatricula("9989 NTH");

		persona.setCoche(coche);
		coche.setPersona(persona);
		personaRepositorio.save(persona);*/
		System.out.println("Peta bidireccional");
		Optional<Persona> persona = personaRepositorio.findById(28L);
		if (persona.isPresent()){
			Persona persona1 = persona.get();
			System.out.println(persona1);

		}
		System.out.println("Peta bidireccional");
		Optional<Coche> coche = cocheRepossitorio.findById(3L);
		if (coche.isPresent()){
			Coche coche1 = coche.get();
			System.out.println(coche1);
			System.out.println(coche1.getPersona().getApellidos());

		}

	}
}
