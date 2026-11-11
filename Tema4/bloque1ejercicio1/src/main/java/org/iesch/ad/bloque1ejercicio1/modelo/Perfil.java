package org.iesch.ad.bloque1ejercicio1.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String fotoPerfil;
    private String descripcion;
    private LocalDate fechaNacimiento;


    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false, unique = true)
    private Usuario usuario; //No puede existir un perfil sin un usuario

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", fotoPerfil='" + fotoPerfil + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", USUARIO= " + usuario.getId() + " " + usuario.getNombre() + " " + usuario.getPassword() +
                '}';
    }
}
