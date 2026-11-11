package org.iesch.ad.bloque1ejercicio1;

import org.iesch.ad.bloque1ejercicio1.modelo.Perfil;
import org.iesch.ad.bloque1ejercicio1.modelo.Usuario;
import org.iesch.ad.bloque1ejercicio1.repositorio.UsuarioRepositorio;
import org.iesch.ad.bloque1ejercicio1.sevice.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Optional;


@SpringBootApplication
public class Bloque1ejercicio1Application implements CommandLineRunner {
	@Autowired
	UsuarioRepositorio usuarioRepositorio;

	@Autowired
	UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(Bloque1ejercicio1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println( "-" .repeat(30));

		/*Perfil perfil = new Perfil();
		perfil.setFotoPerfil("/img/juan.jpg");
		perfil.setDescripcion("Estudiante de Asir");
		perfil.setFechaNacimiento(LocalDate.of(2006, 5, 25));

		Usuario usuario = new Usuario();
		usuario.setNombre("Juan");
		usuario.setPassword("987654321");
		usuario.setPerfil(perfil);
		//perfil.setUsuario(usuario); No porque lo añado en el set de Usuario como lo he echo en la clase de usuario

		usuarioRepositorio.save(usuario);
		System.out.println(usuario);*/



		//obtener de base de datos un usuario
		Optional<Usuario> usu = usuarioRepositorio.findById(1L);
		if (usu.isPresent()){
			Usuario usuario = usu.get();
			System.out.println(usuario);


			Perfil perfil = new Perfil();
			perfil.setFotoPerfil("/img/pepe.jpg");
			perfil.setDescripcion("Estudiante de Dam");
			perfil.setFechaNacimiento(LocalDate.of(2004, 9, 25));

			usuarioService.cambiaPerfil(usuario);
//			usuario.setPerfil(null);
//			usuarioRepositorio.save(usuario);
//			usuario.setPerfil(perfil);
//			usuarioRepositorio.save(usuario);
		}


		//Borrar usuario
		/*Optional<Usuario> usuarioTmp = usuarioRepositorio.findById(2L);
		if (usuarioTmp.isPresent()){
			Usuario usuario = usuarioTmp.get();
			usuarioRepositorio.delete(usuario);
		}*/
		usuarioRepositorio.deleteById(2L);

	}
}
