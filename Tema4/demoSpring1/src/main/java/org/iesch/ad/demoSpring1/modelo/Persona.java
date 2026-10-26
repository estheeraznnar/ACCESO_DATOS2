package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.jdbc.Size;

import java.time.LocalDateTime;

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

    private LocalDateTime createdAt;

    //@Basic
    //@Column

    @PrePersist
    public void preGuardar(){
        this.createdAt = LocalDateTime.now();
    }

    @PostPersist
    public void postguardar(){
        System.out.println("se guarda la persona con ID: " + this.id);
    }

    @OneToOne(cascade = CascadeType.ALL)
    Coche coche;

}
