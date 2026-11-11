package org.iesch.ad.bloque1ejercicio1.sevice;

import lombok.RequiredArgsConstructor;
import org.iesch.ad.bloque1ejercicio1.modelo.Perfil;
import org.iesch.ad.bloque1ejercicio1.modelo.Usuario;
import org.iesch.ad.bloque1ejercicio1.repositorio.PerfilRepositorio;
import org.iesch.ad.bloque1ejercicio1.repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepositorio usuarioRepositorio;
    private final PerfilRepositorio perfilRepositorio;

    public void cambiaPerfil(Usuario usuario){
        Perfil perfil = usuario.getPerfil();
        perfil.setFotoPerfil("img/user.jpg");
        perfil.setFechaNacimiento(LocalDate.of(2005,4,12));
        perfil.setDescripcion("Nuevo alumno de Dam1");

        usuarioRepositorio.save(usuario);

    }
}
