package org.iesch.ad.demoCarga.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;

    @OneToMany
    @JoinColumn(name = "cliente_id") //para que no me cree table intermedia
    private List<Pedido> pedidos;

}
