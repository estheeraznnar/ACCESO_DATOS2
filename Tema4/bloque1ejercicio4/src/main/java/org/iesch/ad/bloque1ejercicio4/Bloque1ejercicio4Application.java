package org.iesch.ad.bloque1ejercicio4;

import org.iesch.ad.bloque1ejercicio4.modelo.Habitacion;
import org.iesch.ad.bloque1ejercicio4.modelo.Reserva;
import org.iesch.ad.bloque1ejercicio4.repositorio.HabitacionRepositorio;
import org.iesch.ad.bloque1ejercicio4.repositorio.ReservaRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class Bloque1ejercicio4Application implements CommandLineRunner {

	private final HabitacionRepositorio habitacionRepositorio;
	private final ReservaRepositorio reservaRepositorio;

	public Bloque1ejercicio4Application(HabitacionRepositorio habitacionRepositorio, ReservaRepositorio reservaRepositorio) {
		this.habitacionRepositorio = habitacionRepositorio;
		this.reservaRepositorio = reservaRepositorio;
	}

	public static void main(String[] args) {
		SpringApplication.run(Bloque1ejercicio4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		reservaRepositorio.deleteAll();
		habitacionRepositorio.deleteAll();

		Habitacion h201 = new Habitacion();
		h201.setNumeroHab(201);
		h201.setTipo("individual");
		Habitacion h102 = new Habitacion();
		h102.setNumeroHab(102);
		h102.setTipo("Doble");

		habitacionRepositorio.save(h201);
		habitacionRepositorio.save(h102);


		//Misma reserva para la misma habitacion
		Reserva r1 = new Reserva();
		r1.setFechaEntrada(LocalDate.of(2026,12,01));
		r1.setFechaSalida(LocalDate.of(2026,12,05));
		r1.setHabitacion(h102);

		Reserva r2 = new Reserva();
		r2.setFechaEntrada(LocalDate.of(2027,1,10));
		r2.setFechaSalida(LocalDate.of(2027,1,15));
		r2.setHabitacion(h102);

		Reserva r3 = new Reserva();
		r3.setFechaEntrada(LocalDate.of(2027,1,20));
		r3.setFechaSalida(LocalDate.of(2027,1,25));
		r3.setHabitacion(h102);

		//Reserva h201
		Reserva r4 = new Reserva();
		r4.setFechaEntrada(LocalDate.of(2027,4,28));
		r4.setFechaSalida(LocalDate.of(2027,5,2));
		r4.setHabitacion(h201);

		reservaRepositorio.saveAll(Arrays.asList(r1, r2, r3, r4));

	}
}
