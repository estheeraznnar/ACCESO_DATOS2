package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_curso",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "cuso_id")
    )

    private Set<Curso> cursos = new HashSet<>();

}
