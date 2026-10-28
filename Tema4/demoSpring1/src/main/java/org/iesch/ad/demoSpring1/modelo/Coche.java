package org.iesch.ad.demoSpring1.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String marca;
    String modelo;
    String matricula;

    //A qui no ponemos el OneToOne porque es unidereccional y con ponerlo en persona vale pporque si lo hacemos como lo hemos puedto abajo
    //hace un desbordamiento
    @OneToOne(mappedBy = "coche") //nombre de la variable que hace maoei en la relacion padre
    Persona persona;


}
