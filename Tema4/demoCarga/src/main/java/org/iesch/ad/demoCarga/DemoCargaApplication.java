package org.iesch.ad.demoCarga;

import org.iesch.ad.demoCarga.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoCargaApplication implements CommandLineRunner {

	@Autowired
	ClienteServicio clienteServicio;

	public static void main(String[] args) {
		SpringApplication.run(DemoCargaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//lanzar la app
		System.out.println("Datos del cliente 1");
		clienteServicio.mostrarDatos(1L);

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("===========================================");
		System.out.println(" ");
		System.out.println(" ");

		//Muestro todos
		System.out.println("Muestro todos");
		clienteServicio.mostrarTodos();


		System.out.println(" ");
		System.out.println(" ");
		System.out.println("===========================================");
		System.out.println(" ");
		System.out.println(" ");


		System.out.println("\n".repeat(10));

	}
}
