package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.jdbc.Size;

@Getter
@Setter
//@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Persona {

    @Id //Esto indica que el id es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autonumerico
    Long id;
    String nombre;
    String apellidos;
    @Column(length = 9)
    String dni;
    String email;

    //@Basic
    //@Column
}
