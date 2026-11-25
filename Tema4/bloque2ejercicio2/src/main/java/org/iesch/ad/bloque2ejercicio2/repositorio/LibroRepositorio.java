package org.iesch.ad.bloque2ejercicio2.repositorio;

import org.iesch.ad.bloque2ejercicio2.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}
