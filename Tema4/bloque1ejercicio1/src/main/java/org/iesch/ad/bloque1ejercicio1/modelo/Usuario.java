package org.iesch.ad.bloque1ejercicio1.modelo;

import jakarta.persistence.*;
import lombok.*;

@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    String password;

    //bidireccional para gusrdar el perfil
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true) //el mapped bay lo pone para definir que el usuario
    private Perfil perfil;                                                           // ya esta en la otra tabla y se pone el mismo nombre
                                                                                    // que se le asigna en la otra tabla


    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
        if (perfil != null){
            perfil.setUsuario(this);
        }
    }
}
