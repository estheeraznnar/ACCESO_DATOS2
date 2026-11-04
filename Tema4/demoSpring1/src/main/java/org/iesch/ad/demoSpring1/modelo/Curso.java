package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;

    @ToString.Exclude //Evitar stackoverflow
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "cursos") //nombre de la variable en otra entidad
                                                                //El cascade all puede ser peligroso ya que si borramos
                                                                //un curso, se puede dar el caso que borres al padre(studiante)
                                                                //y tambien al resto de cutso del estudiante
                                                                //Se recomienda usar: CascadeType.PERSIST y MERGE
                                                                //Con persist al guardar se guardaria al padre
                                                                //con merge al actualizar tmbn se actualiza el padre



    private Set<Student> students = new HashSet<>();

}
