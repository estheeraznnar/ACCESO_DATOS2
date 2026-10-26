package org.iesch.ad.demoSpring1.repositorio;

import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//La encargada de hablar con la base de datos
@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

    @Query("select p from Persona p")  //HQL
    List<Persona> buscaTodasPersonas();

    @NativeQuery("select * from Persona p")
    List<Persona> buscaTodasPersonasNative();

    List<Persona> findByNombreStartingWith (char c);

    List<Persona> findByDniContainingAndApellidosContaining(char c, String s);

    List<Persona> findByDniContainingOrEmailIsNull(char c);

}
