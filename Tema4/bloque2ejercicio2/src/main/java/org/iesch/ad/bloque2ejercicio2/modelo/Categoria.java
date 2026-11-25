package org.iesch.ad.bloque2ejercicio2.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    

    public Categoria(String nombre) {
        this.nombre = nombre;
    }
}
