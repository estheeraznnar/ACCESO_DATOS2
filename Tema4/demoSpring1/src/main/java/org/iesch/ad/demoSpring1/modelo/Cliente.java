package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;

    @OneToMany(mappedBy = "cliente") //bidereccional

    //@OneToMany
            //@JoinColumn(name = "orden_id")//Para evitar la tabla imtermedia,
            //le indicamos como se va a llamar la clave ajena de la tabla orden
            //con el Join Column
    List<Orden> ordenList;
}
