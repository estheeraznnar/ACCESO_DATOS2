package org.iesch.ad.bloque1ejercicio4.repositorio;

import org.iesch.ad.bloque1ejercicio4.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepositorio  extends JpaRepository<Reserva, Long> {
}
