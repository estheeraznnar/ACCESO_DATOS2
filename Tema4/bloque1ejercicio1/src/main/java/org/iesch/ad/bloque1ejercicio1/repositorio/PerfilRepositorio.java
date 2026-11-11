package org.iesch.ad.bloque1ejercicio1.repositorio;

import org.iesch.ad.bloque1ejercicio1.modelo.Perfil;
import org.iesch.ad.bloque1ejercicio1.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil, Long> {
}
